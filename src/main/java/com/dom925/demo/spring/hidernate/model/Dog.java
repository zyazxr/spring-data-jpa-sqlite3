package com.dom925.demo.spring.hidernate.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dog")
public class Dog implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Integer id;

    public String username;

    public String password;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(length = 18, unique = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(length = 18)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
