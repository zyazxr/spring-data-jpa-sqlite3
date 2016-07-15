package com.dom925.demo.spring.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dom925.demo.spring.hibernate.dao.PersonDAO;
import com.dom925.demo.spring.hibernate.model.Person;


@Service
public class PersonServiceImpl implements PersonService {

 @Autowired
 private PersonDAO personDao;
 
 public List<Person> getAllPersons() {
  List<Person> persons = personDao.getAllPersons();
  return persons;
 }

 public void insertPerson(Person person) {
  personDao.insertPerson(person);
 }

}
