package com.test.demo.xmlMapper;

import java.util.List;
import java.util.Map;

public interface TablesMapper {
    /**
     * 获取所有表信息
     * @return
     */
    public List<Map<String, Object>> selectTables();

    /**
     * 根据表名获取表信息
     * @return
     */
    public List<Map<String, Object>> selectTablesByName();

}
