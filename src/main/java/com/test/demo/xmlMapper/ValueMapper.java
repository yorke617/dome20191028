package com.test.demo.xmlMapper;

import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface ValueMapper {

    /**
     * 根据表名获取所有信息
     * @param tableName
     * @return
     */
    public List<Map<String, Object>> getDataByTable(@Param("tableName") String tableName,
                                                    @Param("startRow") int startRow,
                                                    @Param("pageSize") int pageSize);

    /**
     * 新增用户
     * @param map
     * @param dataId
     * @return
     */
    public int saveData1(@Param("map") Map<String, String> map,
                         @Param("dataId") int dataId,
                         @Param("tableName") String tableName);
    /**
     * 新增用户
     * @param map
     * @param dataId
     * @return
     */
    public int saveData2(@Param("map") Map<String, String> map,
                         @Param("dataId") int dataId,
                         @Param("tableName") String tableName);

    /**
     * 获取最大的数据id
     * @return
     */
    public int getMaxDataId();

}
