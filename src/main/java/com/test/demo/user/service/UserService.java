package com.test.demo.user.service;

import com.test.demo.user.UserForm;

import java.util.List;
import java.util.Map;

public interface UserService {

    /**
     * 保存用户
     * @param userForm
     */
    public void saveUser(UserForm userForm);

    /**
     * 获取所有用户，可分页
     * @param page
     * @param pageCount
     * @return
     */
    public List<Map<String,Object>> getUsers(int page, int pageCount);
}
