package com.dom925.demo.spring.hidernate.service.Impl;

import com.dom925.demo.spring.hidernate.dao.BaseDao;
import com.dom925.demo.spring.hidernate.model.Cat;
import com.dom925.demo.spring.hidernate.service.CatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("catService")
public class CatSercivceImpl extends BaseServiceImpl<Cat> implements CatService {

    @Resource(name = "catDao")
    public void setDao(BaseDao<Cat> dao) {
        super.setDao(dao);
    }
}
