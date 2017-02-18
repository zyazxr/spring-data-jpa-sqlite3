package com.dom925.demo.spring.hidernate.service.Impl;

import com.dom925.demo.spring.hidernate.dao.BaseDao;
import com.dom925.demo.spring.hidernate.model.Dog;
import com.dom925.demo.spring.hidernate.service.DogService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Scope("prototype")
@Service("dogService")
public class DogSercivceImpl extends BaseServiceImpl<Dog> implements DogService {

    @Resource(name = "dogDao")
    public void setDao(BaseDao<Dog> dao) {
        super.setDao(dao);
    }
}
