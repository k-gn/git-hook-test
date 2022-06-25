package com.example.hooktest;

import org.springframework.stereotype.Service;

public class UserService {

    public void test() {
        var user = new User();
        user.setUserid(1L);
        user.setUsername("gyul");
//        user.setAge(26);
        System.out.println(user);
    }
}
