package com.joy.modules.demo.service.impl;

import com.joy.modules.common.common.Constant;
import com.joy.modules.common.exception.MyException;
import com.joy.modules.common.page.Page;
import com.joy.modules.common.page.PageHelper;
import com.joy.modules.common.utils.StringUtils;
import com.joy.modules.common.utils.UserUtils;
import com.joy.modules.common.utils.Utils;
import com.joy.modules.demo.dao.BxDao;
import com.joy.modules.demo.entity.BxEntity;
import com.joy.modules.demo.service.ProbxService;
import com.joy.modules.sys.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 项目报销
 *
 * @author w24164
 * @create 2018-03-23 16:38
 */
@Service("probxService")
public class ProbxServiceImpl implements ProbxService{
    @Autowired
    private BxDao bxDao;

    @Override
    public BxEntity queryObject(String id){
        if(StringUtils.isEmpty(id)){
            new MyException("id不为空!");
        }
        return bxDao.queryObject(id);
    }

    @Override
    public List<BxEntity> queryList(Map<String, Object> map){
        return bxDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map){
        return bxDao.queryTotal(map);
    }

 /*   @Override
    public byte[] getBxfp(String fp) {
        return baoxiaoDao.getBxfp(fp);
    }*/

    @Override
    public void save(BxEntity bx){
        UserEntity currentUser = UserUtils.getCurrentUser();
        bx.setCode(Utils.getCode("D"));
        bx.setStatus(Constant.ActStauts.DRAFT.getValue());
        bx.setCreateId(currentUser.getId());
        bx.setCreateTime(new Date());
        bx.setId(Utils.uuid());
        bx.setStatus(Constant.ActStauts.DRAFT.getValue());
        bx.setUserId(UserUtils.getCurrentUserId());
        bx.setBapid(currentUser.getBapid());
        bx.setBaid(currentUser.getBaid());

        bxDao.save(bx);
    }

    @Override
    public void update(BxEntity bx){
        if(StringUtils.isEmpty(bx.getId())){
            throw new MyException("报销id不能为空");
        }
        bx.setUpdateId(UserUtils.getCurrentUserId());
        bx.setUpdateTime(new Date());
        bxDao.update(bx);
    }

    @Override
    public int delete(String id){
        if(StringUtils.isEmpty(id)){
            throw  new MyException("报销id不能为空");
        }
        return bxDao.delete(id);
    }

    @Override
    public void deleteBatch(String[] ids){
        bxDao.deleteBatch(ids);
    }

    @Override
    public Page<BxEntity> findPage(BxEntity bxEntity, int pageNum) {
        PageHelper.startPage(pageNum, Constant.pageSize);
        bxDao.queryList(bxEntity);
        return PageHelper.endPage();
    }

}
