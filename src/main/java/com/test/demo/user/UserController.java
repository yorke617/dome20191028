package com.test.demo.user;

import com.test.demo.returnModel.Result;
import com.test.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
        userService.saveUser(userForm);
        return Result.success();
    }
    @GetMapping("/{page}/{pageCount}")
    public Result<List<Map<String, Object>>> getUsers(@PathVariable int page, @PathVariable int pageCount){
        List<Map<String, Object>> users = userService.getUsers(page,pageCount);
        Result<List<Map<String, Object>>> result = new Result<List<Map<String, Object>>>(true, users);
        return result;
    }


}
