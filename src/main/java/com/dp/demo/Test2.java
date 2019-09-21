package com.dp.demo;

import com.dp.demo.controller.StudentController;
import com.dp.demo.entity.Student;
import com.dp.demo.mapper.impl.StudentMapperImpl;
import com.dp.demo.service.impl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 */
public class Test2 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");

        StudentMapperImpl stu = context.getBean("stu", StudentMapperImpl.class);
        System.out.println(stu);


        StudentServiceImpl stuService = context.getBean("stuService", StudentServiceImpl.class);
        System.out.println(stuService);

        StudentController stuController = context.getBean("stuController", StudentController.class);
        System.out.println(stuController);

        stuController.add(new Student());
    }

}
