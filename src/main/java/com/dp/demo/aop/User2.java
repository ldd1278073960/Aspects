package com.dp.demo.aop;


import org.springframework.stereotype.Controller;

/**
 * @author Administrator
 */
@Controller("user")
public class User2 {

    public void save(){
        System.out.println("核心方法");
    }

}
