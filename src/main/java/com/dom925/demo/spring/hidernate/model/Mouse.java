package com.dom925.demo.spring.hidernate.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/12/13.
 */
@Entity
@Table(name = "mouse")
public class Mouse {
    public Long id;
    public String username;
    public String password;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(length = 18)
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
