package com.dom925.demo.spring.hidernate.model;

import javax.persistence.*;

@Entity
@Table(name = "PERSON_INFO")
public class Person {

 @Id
 @Column(name = "ID")
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
 
 @Column(name = "FIRST_NAME")
 private String firstName;
 
 @Column(name = "LAST_NAME")
 private String lastName;
  
 public Integer getId() {
  return id;
 }
 public void setId(Integer id) {
  this.id = id;
 }
 public String getFirstName() {
  return firstName;
 }
 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }
 public String getLastName() {
  return lastName;
 }
 public void setLastName(String lastName) {
  this.lastName = lastName;
 }
 @Override
 public boolean equals(Object obj){
  if (this == obj){
   return true;
  }
  Person person = (Person) obj;
  return firstName != null ? firstName.equals(person.firstName) : person.firstName == null;
 }
 @Override
 public String toString() {
  return "Person [id=" 
    + id 
    + ", name=" 
    + firstName 
    + " " 
    + lastName 
    + "]";
 }
}
