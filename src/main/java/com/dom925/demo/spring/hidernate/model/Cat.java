package com.dom925.demo.spring.hidernate.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cat")
public class Cat implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Long id;

    public String username;

    public String password;

    //	 @Id
//	    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TestSequence")
//	    //@GeneratedValue(strategy=GenerationType.IDENTITY) // MYSQLʱ��������ʹ������
//	    @SequenceGenerator(name = "TestSequence", sequenceName = "SEQ_Test", allocationSize=1)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
