package com.joy.modules.activiti.service.impl;

import com.joy.modules.activiti.dao.ExtendActTasklogDao;
import com.joy.modules.activiti.entity.ExtendActTasklogEntity;
import com.joy.modules.activiti.service.ExtendActTasklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("extendActTasklogService")
public class ExtendActTasklogServiceImpl implements ExtendActTasklogService {
	@Autowired
	private ExtendActTasklogDao extendActTasklogDao;
	
	@Override
	public ExtendActTasklogEntity queryObject(String id){
		return extendActTasklogDao.queryObject(id);
	}
	
	@Override
	public List<ExtendActTasklogEntity> queryList(Map<String, Object> map){
		return extendActTasklogDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return extendActTasklogDao.queryTotal(map);
	}
	
	@Override
	public void save(ExtendActTasklogEntity extendActTasklog){
		extendActTasklogDao.save(extendActTasklog);
	}
	
	@Override
	public void update(ExtendActTasklogEntity extendActTasklog){
		extendActTasklogDao.update(extendActTasklog);
	}
	
	@Override
	public void delete(String id){
		extendActTasklogDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		extendActTasklogDao.deleteBatch(ids);
	}

	@Override
	public int updateByTaskId(ExtendActTasklogEntity extendActTasklogEntity) {
		return extendActTasklogDao.updateByTaskId(extendActTasklogEntity);
	}

	@Override
	public int updateByTaskIdOpinion(ExtendActTasklogEntity extendActTasklogEntity) {
		return extendActTasklogDao.updateByTaskIdOpinion(extendActTasklogEntity);
	}
}
