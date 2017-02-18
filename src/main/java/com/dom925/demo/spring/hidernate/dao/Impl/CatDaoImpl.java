package com.dom925.demo.spring.hidernate.dao.Impl;

import com.dom925.demo.spring.hidernate.dao.CatDao;
import com.dom925.demo.spring.hidernate.model.Cat;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service("catDao")
public class CatDaoImpl extends BaseDaoImpl<Cat> implements CatDao {

}
