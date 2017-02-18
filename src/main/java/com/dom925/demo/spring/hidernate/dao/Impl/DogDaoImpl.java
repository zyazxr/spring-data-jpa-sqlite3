package com.dom925.demo.spring.hidernate.dao.Impl;

import com.dom925.demo.spring.hidernate.dao.DogDao;
import com.dom925.demo.spring.hidernate.model.Dog;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Scope("prototype")
@Service("dogDao")
public class DogDaoImpl extends BaseDaoImpl<Dog> implements DogDao {

}
