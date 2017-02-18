package com.dom925.demo.spring.hidernate.dao;

import com.dom925.demo.spring.hidernate.model.Person;

import java.util.List;

//import com.dom925.demo.spring.hibernate.model.Person;

public interface PersonDAO {

    List<Person> getAllPersons();

    void insertPerson(Person person);
}
