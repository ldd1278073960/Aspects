package com.dp.demo.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 */
public class TestUser {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("resource.xml");
        User2 user = app.getBean("user", User2.class);
        user.save();

    }

}
