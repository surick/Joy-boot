package com.joy.modules.demo.dao;

import com.joy.modules.activiti.dto.ProcessTaskDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SumDao {
    void sum(Map<String, String> map);
    void sum_bx(Map<String,String> map);
    List<ProcessTaskDto> findRecordList(Map<String, Object> params);
}
