package com.labway.portal.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSessionFactory;

import com.labway.portal.mapper.SampleMapper;

public class SqlSessionFactoryManager {

	private Map<Department, SqlSessionFactory> factoryMap = new HashMap<Department, SqlSessionFactory>();

	public void setFactoryMap(Map<Department, SqlSessionFactory> factoryMap) {
		this.factoryMap = factoryMap;
	}

	public SqlSessionFactory getSqlSessionFactory(Department department) {
		return factoryMap.get(department);
	}

	public void init() {
		Set<Department> keys = factoryMap.keySet();
		for (Department department : keys) {
			SqlSessionFactory factory = factoryMap.get(department);
			factory.getConfiguration().addMapper(SampleMapper.class);
		}
	}
}
