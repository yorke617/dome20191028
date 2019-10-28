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

    public void saveUser(UserForm userForm){
        if (userForm == null){
            throw new BusinessException("用户信息不能为空！");
        }
        String tableName = "sys_user";
        //获取最大数据id
        int maxDataId = valueMapper.getMaxDataId();
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
        String tableName = "sys_user";
        List<Map<String, Object>> tables = tablesMapper.selectTables();
        List<Map<String, Object>> fields = fieldsMapper.selectFields();
        List<Map<String, Object>> values = valueMapper.getDataByTable(tableName, (page - 1) * pageCount, pageCount);
        System.out.println(tableName);
        return values;
    }

    public Integer getFieldId(String tableName, String fieldName){
        if (StringUtils.isEmpty(tableName) || StringUtils.isEmpty(fieldName))
            throw new BusinessException("查询字段ID时，表名和字段名不能为空！");
        List<Map<String, Object>> fields = fieldsMapper.selectFieldsByTable(tableName);
        for (Map<String, Object> tabFields : fields){
            if (fieldName.equals(tabFields.get("field_name"))){
                return Integer.parseInt(tabFields.get("field_id") + "");
            }
        }
        return 0;
    }

}
