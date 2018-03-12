package com.joy.modules.demo.service;

import com.joy.modules.common.page.Page;
import com.joy.modules.demo.entity.BaoxiaoEntity;
import com.joy.modules.demo.entity.LeaveEntity;

import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-03-12 16:41
 */
public interface BaoxiaoService {
    BaoxiaoEntity queryObject(String id);

    List<BaoxiaoEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(BaoxiaoEntity baoxiao);

    void update(BaoxiaoEntity baoxiao);

    int delete(String id);

    void deleteBatch(String[] ids);

    Page<LeaveEntity> findPage(BaoxiaoEntity baoxiaoEntity, int pageNum);
}
