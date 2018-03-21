package com.joy.modules.demo.dao;

import com.joy.modules.common.dao.BaseDao;
import com.joy.modules.demo.entity.BaoxiaoEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaoxiaoDao extends BaseDao<BaoxiaoEntity> {
    /*byte[] getBxfp(String fp);*/
}
