package com.joy.modules.gen.service;

import java.util.List;
import java.util.Map;

/**
 *
 * 代码生成器
 *
 */
public interface SysGeneratorService {
	
	List<Map<String, Object>> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	Map<String, String> queryTable(String tableName);
	
	List<Map<String, String>> queryColumns(String tableName);

	/**
	 * 生成代码
	 * @param tableNames 表名集
	 * @param genType 生成方式，详见Constant枚举类 0本地 1 web形式
	 * @return
	 */
	byte[] generatorCode(String[] tableNames, int genType);
}
