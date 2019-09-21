package com.dp.demo.controller;


import com.dp.demo.entity.Student;
import com.dp.demo.service.impl.StudentServiceImpl;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Controller("stuController")
public class StudentController {

    @Resource
    private StudentServiceImpl studentService;


    public Integer add(Student student){

        System.out.println("噌噌噌");

        return studentService.add(new Student());

    }

}
