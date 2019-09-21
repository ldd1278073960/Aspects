package com.dp.demo.mapper.impl;

import com.dp.demo.entity.Student;
import com.dp.demo.mapper.IStudentMapper;
import org.springframework.stereotype.Repository;


/**
 * @author Administrator
 */
@Repository("stu")
public class StudentMapperImpl implements IStudentMapper {
    @Override
    public Integer add(Student stu) {
        System.out.println("mapper层的add方法");
        return null;
    }
}
