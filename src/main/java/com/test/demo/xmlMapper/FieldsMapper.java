package com.test.demo.xmlMapper;

import java.util.List;
import java.util.Map;

public interface FieldsMapper {
    /**
     * 获取所有字段信息
     * @return
     */
    public List<Map<String, Object>> selectFields();

    /**
     * 根据表名获取字段信息
     * @param tabId
     * @return
     */
    public List<Map<String, Object>> selectFieldsByTable(String tabId);



}
