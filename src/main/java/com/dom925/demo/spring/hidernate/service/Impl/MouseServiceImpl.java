package com.dom925.demo.spring.hidernate.service.Impl;

import com.dom925.demo.spring.hidernate.dao.BaseDao;
import com.dom925.demo.spring.hidernate.model.Mouse;
import com.dom925.demo.spring.hidernate.service.MouseService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/12/13.
 */
@Scope("prototype")
@Service("mouseService")
public class MouseServiceImpl extends BaseServiceImpl<Mouse> implements MouseService {
    @Resource(name = "mouseDao")
    public void setDao(BaseDao<Mouse> dao) {
        super.setDao(dao);
    }
}
