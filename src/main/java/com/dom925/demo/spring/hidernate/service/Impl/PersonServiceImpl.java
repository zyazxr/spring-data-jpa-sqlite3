package com.dom925.demo.spring.hidernate.service.Impl;

import com.dom925.demo.spring.hidernate.dao.PersonDAO;
import com.dom925.demo.spring.hidernate.model.Person;
import com.dom925.demo.spring.hidernate.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import com.dom925.demo.spring.hibernate.dao.PersonDAO;
//import com.dom925.demo.spring.hibernate.model.Person;


@Service
class PersonServiceImpl implements PersonService {

 @Autowired
 private PersonDAO personDao;
 
 public List<Person> getAllPersons() {
  List<Person> persons = personDao.getAllPersons();
  return persons;
 }

 public void insertPerson(Person person) {
  personDao.insertPerson(person);
 }

 public String getpath() {
  return this.getClass().getClassLoader().getResource("").getPath();
 }

}
