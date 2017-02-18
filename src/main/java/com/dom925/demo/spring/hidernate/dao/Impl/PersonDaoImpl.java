package com.dom925.demo.spring.hidernate.dao.Impl;

import com.dom925.demo.spring.hidernate.dao.PersonDAO;
import com.dom925.demo.spring.hidernate.model.Person;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/2/18.
 */

@Repository
@Transactional(readOnly = true)
class PersonDaoImpl implements PersonDAO {

    @Autowired
    private SessionFactory sessionFactory;


    public List<Person> getAllPersons() {
        Session session = sessionFactory.openSession();
        String hql = "FROM Person";
        Query query = session.createQuery(hql);
        List<Person> persons = query.list();
        return persons;
    }

    @Transactional(readOnly = false)
    public void insertPerson(Person employee) {
        Session session = sessionFactory.openSession();
        session.save(employee);
    }
}

