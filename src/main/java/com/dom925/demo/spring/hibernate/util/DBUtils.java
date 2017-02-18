package com.dom925.demo.spring.hibernate.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class DBUtils {

    private final DataSource dataSource;

    @Autowired
    public DBUtils(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @PostConstruct
    public void initialize() {
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS PERSON_INFO");
            statement.executeUpdate(
                    "CREATE TABLE PERSON_INFO(" +
                            "ID INTEGER Primary key, " +
                            "FIRST_NAME varchar(30) not null, " +
                            "LAST_NAME varchar(30) not null)"
            );
            statement.execute("DROP TABLE IF EXISTS CAT_INFO");
            statement.executeUpdate(
                    "CREATE TABLE CAT_INFO(" +
                            "ID INTEGER Primary key, " +
                            "FIRST_NAME varchar(30) not null, " +
                            "LAST_NAME varchar(30) not null)");

            statement.execute("DROP TABLE IF EXISTS DAO");
            statement.executeUpdate(
                    "CREATE TABLE DAO(" +
                            "ID INTEGER Primary key, " +
                            "username varchar(30) not null, " +
                            "password varchar(30) not null)");

            statement.execute("DROP TABLE IF EXISTS MOUSE");
            statement.executeUpdate(
                    "CREATE TABLE MOUSE(" +
                            "ID INTEGER Primary key, " +
                            "username varchar(30) not null, " +
                            "PASSWORD varchar(30) not null)");

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
