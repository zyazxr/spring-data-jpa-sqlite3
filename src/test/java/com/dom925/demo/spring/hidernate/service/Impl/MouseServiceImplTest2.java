package com.dom925.demo.spring.hidernate.service.Impl;

import com.dom925.demo.spring.hidernate.service.CatService;
import com.dom925.demo.spring.hidernate.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/2/18.
 */
//@RunWith(value = SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
public class MouseServiceImplTest2 {

//    @Autowired

    @Test
    public void testMou() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/app-context.xml");
        PersonService personService = context.getBean("personServiceImpl", PersonService.class);
        CatService catService = context.getBean("catServiceImpl", CatService.class);
    }
}