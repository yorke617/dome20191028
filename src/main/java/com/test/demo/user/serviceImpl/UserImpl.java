package com.test.demo.user.serviceImpl;

import com.test.demo.system.BusinessException;
import com.test.demo.user.UserForm;
import com.test.demo.user.service.UserService;
import com.test.demo.xmlMapper.FieldsMapper;
import com.test.demo.xmlMapper.TablesMapper;
import com.test.demo.xmlMapper.ValueMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserImpl implements UserService {
    @Resource
    private ValueMapper valueMapper;
    @Resource
    private TablesMapper tablesMapper;
    @Resource
    private FieldsMapper fieldsMapper;

    private static String tableName = "sys_user";//user表名

    public void saveUser(UserForm userForm){
        if (userForm == null){
            throw new BusinessException("用户信息不能为空！");
        }
        //获取最大数据id
        int maxDataId = valueMapper.getMaxDataId();//用来表示为同一条数据
        Map<String, String> userMap = new HashMap<>();
        userMap.put("data_id", maxDataId + 1 + "");
        int record = valueMapper.saveData1(userMap, maxDataId + 1, "sys_data");
        if (record != 1)
            throw new BusinessException("用户信息保存失败！");
        userMap = new HashMap<>();
        userMap.put("user_name", userForm.getUserName());
        userMap.put("user_tel", userForm.getUserTel());
        record = valueMapper.saveData1(userMap, maxDataId + 1, tableName);
        if (record != 2)
            throw new BusinessException("用户信息保存失败！");
        userMap = new HashMap<>();
        userMap.put("user_address", userForm.getUserAddress());
        record = valueMapper.saveData2(userMap, maxDataId, tableName);
        if (record != 1)
            throw new BusinessException("用户信息保存失败！");
    }

    @Override
    public List<Map<String, Object>> getUsers(int page, int pageCount) {
        if (page <= 0)
            page = 1;
        if (pageCount <= 0)
            pageCount = 10;//默认查询10条
        int pageSize = pageCount * 3;
        List<Map<String, Object>> values = valueMapper.getDataByTable(tableName, (page - 1) * pageSize + 1, pageSize);
        return values;
    }

}
