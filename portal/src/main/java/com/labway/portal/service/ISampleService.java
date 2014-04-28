package com.labway.portal.service;

import java.util.List;

import com.labway.portal.po.Dengji;
import com.labway.portal.po.Grade;
import com.labway.portal.po.Product;
import com.labway.portal.po.Sample;
import com.labway.portal.po.SamplerKeep;
import com.labway.portal.po.SpecType;

public interface ISampleService {

	public void insertSample(Sample sample);

	public List<Product> getProduct(String name, Department department);

	public List<Grade> getGrade(String prodname, Department department);

	public List<Dengji> getDengji(String prodname, Department department);

	public List<SpecType> getSpecType(String prodname, Department department);

	public int getSampleMaxNum(Department department);

	public List<Sample> getSample(int samplename, Department department);

	public Sample getSampleOne(int sampn, Department department);

	public void updateSample(Sample sam);

	public List<SamplerKeep> getSampleKeep(Department department);

}
