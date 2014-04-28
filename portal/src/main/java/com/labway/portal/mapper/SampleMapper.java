package com.labway.portal.mapper;

import java.util.List;

import com.labway.portal.po.Dengji;
import com.labway.portal.po.Grade;
import com.labway.portal.po.Product;
import com.labway.portal.po.Sample;
import com.labway.portal.po.SamplerKeep;
import com.labway.portal.po.SpecType;

public interface SampleMapper {
  public void insertSample(Sample sample);
  public List<SamplerKeep> getSampleKeep();
  public List<Product> getProduct(String name);
  public List<Grade> getGrade(String prodname);
  public List<Dengji> getDengji(String prodname);
  public List<SpecType> getSpecType(String prodname);
  public int getSampleMaxNum();
  public List<Sample> getSample(int samplename);
  public Sample getSampleOne(int sampn);
  public void updateSample(Sample sam);


}
