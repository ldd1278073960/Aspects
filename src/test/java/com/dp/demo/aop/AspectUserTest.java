package com.dp.demo.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:resource.xml")
public class AspectUserTest {

    @Resource
    private User2 user2;

    @Test
    public void save(){
        user2.save();
    }
}