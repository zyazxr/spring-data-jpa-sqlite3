package com.dom925.demo.spring.hidernate.dao.Impl;

import com.dom925.demo.spring.hidernate.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/2/18.
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {
    private Class<T> entityClass;


    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Transactional
    public void clear() {
        getHibernateTemplate().clear();
    }

    @Transactional
    public void save(T entity) {
//		System.out.println(Thread.getAllStackTraces());
        getHibernateTemplate().saveOrUpdate(entity);
    }

    @Transactional
    public void update(T entity) {
        getHibernateTemplate().saveOrUpdate(entity);

    }

    @Transactional
    public void delete(Serializable id) {
        // TODO Auto-generated method stub
//		getHibernateTemplate().delete(entityClass, id);
//		getHibernateTemplate().load(entity, id);
    }

    @Transactional
    public T findById(Serializable id) {
        return getHibernateTemplate().load(entityClass, id);
    }

    @Transactional
    public List<T> findByHQL(String hql, Object... params) {
        return null;
    }

    public List<T> getAllList() {
//		return  getHibernateTemplate().loadAll(entityClass);
        String hql = "from " + entityClass.getName();
        return getSession().createQuery(hql).list();
    }

}
