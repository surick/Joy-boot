package com.joy.modules.demo.service;

import com.joy.modules.common.page.Page;
import com.joy.modules.demo.entity.BaoxiaoEntity;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * 差旅报销
 *
 * @author w24164
 * @create 2018-03-12 16:41
 */
public interface BaoxiaoService {
    BaoxiaoEntity queryObject(String id);

    List<BaoxiaoEntity> queryList(Map<String, Object> map);

    /*byte[] getBxfp(String fp);*/

    int queryTotal(Map<String, Object> map);

    void save(BaoxiaoEntity baoxiao);

    void update(BaoxiaoEntity baoxiao);

    int delete(String id);

    void deleteBatch(String[] ids);

    Page<BaoxiaoEntity> findPage(BaoxiaoEntity baoxiaoEntity, int pageNum);
}
