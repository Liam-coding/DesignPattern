package com.example.whiteList.controller;

import com.example.whiteList.domain.UserInfo;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController {
    public UserInfo queryUserInfo(@RequestParam String userId) {
        List<String> userList = new ArrayList<>();
        userList.add("1001");
        userList.add("aaaa");
        userList.add("ccc");
        if (!userList.contains(userId)) {
            return new UserInfo("1111", "not in white list user, intercept!!!!!");
        }
        return new UserInfo("chongchong:" + userId, 19, "shanghai");
    }
}
