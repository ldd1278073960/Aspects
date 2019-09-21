package com.dp.demo.service.impl;

import com.dp.demo.entity.Student;
import com.dp.demo.mapper.impl.StudentMapperImpl;
import com.dp.demo.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service("stuService")
public class StudentServiceImpl implements IStudentService {

    @Resource
    private StudentMapperImpl studentMapper;


    @Override
    public Integer add(Student stu) {
        System.out.println("这是service层的add方法");

        return studentMapper.add(new Student());
    }
}
