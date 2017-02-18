package com.dom925.demo.spring.hidernate.service.Impl;

import com.dom925.demo.spring.hidernate.service.CatService;
import com.dom925.demo.spring.hidernate.service.MouseService;
import com.dom925.demo.spring.hidernate.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/2/18.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring/app-context.xml"})
public class MouseServiceImplTest {

    @Resource(name = "mouseService")
    public MouseService mouseService;

    @Test
    public void springTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/app-context.xml");
        PersonService personService = context.getBean("personServiceImpl", PersonService.class);
        CatService catService = context.getBean("catService", CatService.class);
    }
}