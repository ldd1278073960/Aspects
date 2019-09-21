package com.dp.demo;

import com.dp.demo.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext xml = new ClassPathXmlApplicationContext("applicationContext.xml");

        /**
         * Student student = (Student) xml.getBean("stu");
         */

        Student student = xml.getBean("stu",Student.class);
        System.out.println(student);
    }

}
