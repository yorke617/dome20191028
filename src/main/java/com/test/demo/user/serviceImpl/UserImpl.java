package com.test.demo.user.serviceImpl;

import com.test.demo.system.BusinessException;
import com.test.demo.user.UserForm;
import com.test.demo.user.service.UserService;
import com.test.demo.xmlMapper.ValueMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserImpl implements UserService {
    @Resource
    private ValueMapper valueMapper;

    public void saveUser(UserForm userForm){
        if (userForm == null){
            throw new BusinessException("用户信息不能为空！");
        }



    }

}
