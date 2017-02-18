package com.dom925.demo.spring.hidernate.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/2/18.
 */
public interface BaseService<T> {

    void save(T entity);

    void update(T entity);

    void delete(Serializable id);

    T getById(Serializable id);

    List<T> getAllList();

    List<T> getByHQL(String hql, Object... params);

}