package com.joy.modules.demo.service;

import com.joy.modules.activiti.entity.ExtendActModelEntity;
import com.joy.modules.common.page.Page;

import java.util.Map;

public interface SumService {
    void sum(Map<String, String> map);
    void sum_bx(Map<String,String> map);
    Page<ExtendActModelEntity> recordList(Map<String, Object> params, int pageNum);
}
