package com.dom925.demo.spring.hibernate.dao;

import java.util.List;

import com.dom925.demo.spring.hibernate.model.Person;

public interface PersonDAO {

 public List<Person> getAllPersons();
 
 public void insertPerson (Person person);
}
