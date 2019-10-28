package com.test.demo.xmlMapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ValueMapper {

    /**
     * 根据表名获取所有信息
     * @param tableName
     * @return
     */
    public List<Map> getDataByTable(String tableName);

    public int saveUser(@Param("userMap") Map<String, String> userMap, @Param("logId") int logId);

}
