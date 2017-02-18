package com.dom925.demo.spring.hidernate.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/2/18.
 */
public interface BaseDao<T> {

    void save(T entity);

    void update(T entity);

    void delete(Serializable id);

    T findById(Serializable id);

    List<T> getAllList();

    List<T> findByHQL(String hql, Object... params);

}