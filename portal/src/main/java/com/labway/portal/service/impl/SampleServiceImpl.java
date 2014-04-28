package com.labway.portal.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.labway.portal.mapper.SampleMapper;
import com.labway.portal.po.Dengji;
import com.labway.portal.po.Grade;
import com.labway.portal.po.Product;
import com.labway.portal.po.Sample;
import com.labway.portal.po.SamplerKeep;
import com.labway.portal.po.SpecType;
import com.labway.portal.service.Department;
import com.labway.portal.service.ISampleService;
import com.labway.portal.service.SqlSessionFactoryManager;

public class SampleServiceImpl implements ISampleService {
	public SampleServiceImpl() {
		System.out.println("=========================");
	}

	private SqlSessionFactoryManager sqlSessionFactoryManager = null;

	public SqlSessionFactoryManager getSqlSessionFactoryManager() {
		return sqlSessionFactoryManager;
	}

	public void setSqlSessionFactoryManager(SqlSessionFactoryManager sqlSessionFactoryManager) {
		this.sqlSessionFactoryManager = sqlSessionFactoryManager;
	}

	private SampleMapper getMapper(Department department) {
		SqlSessionFactory sessionFactory = sqlSessionFactoryManager.getSqlSessionFactory(department);
		SqlSession session = sessionFactory.openSession();
		SampleMapper sampleMapper = (SampleMapper) session.getMapper(SampleMapper.class);
		return sampleMapper;
	}

	public void insertSample(Sample sample) {
		SampleMapper sampleMapper = getMapper(Department.getDepartmentFromSample(sample));
		sampleMapper.insertSample(sample);
	}

	public List<Product> getProduct(String name, Department department) {
		SampleMapper sampleMapper = getMapper(department);
		List<Product> list = sampleMapper.getProduct(name);
		return list;
	}

	public List<Grade> getGrade(String prodname, Department department) {
		SampleMapper sampleMapper = getMapper(department);
		List<Grade> gradelist = sampleMapper.getGrade(prodname);
		return gradelist;
	}

	public List<Dengji> getDengji(String prodname, Department department) {
		SampleMapper sampleMapper = getMapper(department);
		List<Dengji> dengjilist = sampleMapper.getDengji(prodname);
		return dengjilist;
	}

	public List<SpecType> getSpecType(String prodname, Department department) {
		SampleMapper sampleMapper = getMapper(department);
		List<SpecType> speclist = sampleMapper.getSpecType(prodname);
		return speclist;
	}

	public int getSampleMaxNum(Department department) {
		SampleMapper sampleMapper = getMapper(department);
		int snum = sampleMapper.getSampleMaxNum();
		return snum;
	}

	public List<Sample> getSample(int samplename, Department department) {
		SampleMapper sampleMapper = getMapper(department);
		List<Sample> samplelist = sampleMapper.getSample(samplename);
		return samplelist;
	}

	public Sample getSampleOne(int sampn, Department department) {
		SampleMapper sampleMapper = getMapper(department);
		Sample samp = sampleMapper.getSampleOne(sampn);
		return samp;
	}

	public void updateSample(Sample sample) {
		SampleMapper sampleMapper = getMapper(Department.getDepartmentFromSample(sample));
		sampleMapper.updateSample(sample);
	}

	public List<SamplerKeep> getSampleKeep(Department department) {
		SampleMapper sampleMapper = getMapper(department);
		List<SamplerKeep> skeeplist = sampleMapper.getSampleKeep();
		return skeeplist;
	}

}
