package com.joy.modules.demo.service.impl;

import com.joy.modules.activiti.utils.ActUtils;
import com.joy.modules.common.common.Constant;
import com.joy.modules.common.exception.MyException;
import com.joy.modules.common.page.Page;
import com.joy.modules.common.page.PageHelper;
import com.joy.modules.common.utils.StringUtils;
import com.joy.modules.common.utils.UserUtils;
import com.joy.modules.common.utils.Utils;
import com.joy.modules.demo.dao.BaoxiaoDao;
import com.joy.modules.demo.entity.BaoxiaoEntity;
import com.joy.modules.demo.service.BaoxiaoService;
import com.joy.modules.sys.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author w24164
 * @create 2018-03-12 16:44
 */
@Service("baoxiaoService")
public class BaoxiaoServiceImpl implements BaoxiaoService {
    @Autowired
    private BaoxiaoDao baoxiaoDao;

    @Override
    public BaoxiaoEntity queryObject(String id){
        if(StringUtils.isEmpty(id)){
            new MyException("id不为空!");
        }
        return baoxiaoDao.queryObject(id);
    }

    @Override
    public List<BaoxiaoEntity> queryList(Map<String, Object> map){
        return baoxiaoDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map){
        return baoxiaoDao.queryTotal(map);
    }

 /*   @Override
    public byte[] getBxfp(String fp) {
        return baoxiaoDao.getBxfp(fp);
    }*/

    @Override
    public void save(BaoxiaoEntity baoxiao){
        UserEntity currentUser = UserUtils.getCurrentUser();
        baoxiao.setCode(Utils.getCode("D"));
        baoxiao.setStatus(Constant.ActStauts.DRAFT.getValue());
        baoxiao.setCreateId(currentUser.getId());
        baoxiao.setCreateTime(new Date());
        baoxiao.setId(Utils.uuid());
        baoxiao.setStatus(Constant.ActStauts.DRAFT.getValue());
        baoxiao.setUserId(UserUtils.getCurrentUserId());
        baoxiao.setBapid(currentUser.getBapid());
        baoxiao.setBaid(currentUser.getBaid());

        baoxiaoDao.save(baoxiao);
    }

    @Override
    public void update(BaoxiaoEntity baoxiao){
        if(StringUtils.isEmpty(baoxiao.getId())){
            throw new MyException("报销id不能为空");
        }
        baoxiao.setUpdateId(UserUtils.getCurrentUserId());
        baoxiao.setUpdateTime(new Date());
        baoxiaoDao.update(baoxiao);
    }

    @Override
    public int delete(String id){
        if(StringUtils.isEmpty(id)){
            throw  new MyException("报销id不能为空");
        }
        return baoxiaoDao.delete(id);
    }

    @Override
    public void deleteBatch(String[] ids){
        baoxiaoDao.deleteBatch(ids);
    }

    @Override
    public Page<BaoxiaoEntity> findPage(BaoxiaoEntity baoxiaoEntity, int pageNum) {
        PageHelper.startPage(pageNum, Constant.pageSize);
        baoxiaoDao.queryList(baoxiaoEntity);
        return PageHelper.endPage();
    }
}
