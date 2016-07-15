package com.dom925.demo.spring.hibernate.service;

import java.util.List;

import com.dom925.demo.spring.hibernate.model.Person;

public interface PersonService {

 public List<Person> getAllPersons();
 
 public void insertPerson(Person person);
}
