package com.joy.modules.demo.service;

import com.joy.modules.common.page.Page;
import com.joy.modules.demo.entity.BxEntity;

import java.util.List;
import java.util.Map;

/**
 *项目报销
 *
 *@author w24164
 *@create 2018-03-23 14:55
 */
public interface ProbxService {
    BxEntity queryObject(String id);

    List<BxEntity> queryList(Map<String, Object> map);

    /*byte[] getBxfp(String fp);*/

    int queryTotal(Map<String, Object> map);

    void save(BxEntity bx);

    void update(BxEntity bx);

    int delete(String id);

    void deleteBatch(String[] ids);

    Page<BxEntity> findPage(BxEntity BxEntity, int pageNum);
}
