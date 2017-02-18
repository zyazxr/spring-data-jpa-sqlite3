package com.dom925.demo.spring.hidernate.service.Impl;

import com.dom925.demo.spring.hidernate.dao.BaseDao;
import com.dom925.demo.spring.hidernate.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/2/18.
 */
@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {
    private BaseDao<T> dao;

    @Resource
    @Autowired(required = false)
    public void setDao(BaseDao<T> dao) {
        this.dao = dao;
    }

    public void save(T entity) {
        dao.save(entity);
    }

    public void update(T entity) {
        dao.update(entity);

    }

    public void delete(Serializable id) {
        dao.delete(id);
    }

    public T getById(Serializable id) {
        return dao.findById(id);
    }

    public List<T> getByHQL(String hql, Object... params) {
        return dao.findByHQL(hql, params);
    }

    public List<T> getAllList() {
        return dao.getAllList();
    }
}
