package com.joy.modules.demo.service.impl;

import com.joy.modules.demo.dao.SumDao;
import com.joy.modules.demo.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("sumService")
public class SumServiceImpl implements SumService {
    @Autowired
    private SumDao sumDao;

    @Override
    public void sum(Map<String, String> map) {
        sumDao.sum(map);
    }

    @Override
    public void sum_bx(Map<String, String> map) {
        sumDao.sum_bx(map);
    }
}
