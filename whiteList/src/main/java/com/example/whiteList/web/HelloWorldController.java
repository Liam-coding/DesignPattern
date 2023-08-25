package com.example.whiteList.web;

import com.example.whiteList.domain.UserInfo;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController {
    public UserInfo queryUserInfo(@RequestParam String userId) {
        // white list intercept
        List<String> userList = new ArrayList<String>();
        userList.add("1001");
        userList.add("aaaa");
        userList.add("ccc");
        if (!userList.contains(userId)) {
            return new UserInfo("1111", "don't existed in white List, you're intercepted");
        }
        return new UserInfo("chongchong:" + userId, 19, "shanghai pudong");
    }
}
