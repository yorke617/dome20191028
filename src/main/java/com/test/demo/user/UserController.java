package com.test.demo.user;

import com.test.demo.returnModel.Result;
import com.test.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户接口
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 用户服务
     */
    @Autowired
    private UserService userService;


    @PostMapping
    public Result saveUser(@RequestBody UserForm userForm){



        return Result.success();
    }



}
