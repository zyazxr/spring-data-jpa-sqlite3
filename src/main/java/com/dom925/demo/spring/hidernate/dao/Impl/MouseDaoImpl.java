package com.dom925.demo.spring.hidernate.dao.Impl;

import com.dom925.demo.spring.hidernate.dao.MouseDao;
import com.dom925.demo.spring.hidernate.model.Mouse;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/12/13.
 */
@Scope("prototype")
@Service("mouseDao")
public class MouseDaoImpl extends BaseDaoImpl<Mouse> implements MouseDao {

}
