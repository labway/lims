package com.labway.portal.service;

import com.labway.portal.po.Sample;

public enum Department {
	FOOD, PACKAGE;
	/**
	 * 通过sample来得到相应的部门
	 * 
	 * @param sample
	 * @return
	 */
	public static Department getDepartmentFromSample(Sample sample) {
		if (sample.getGroup_name2().equals("食品化工检测中心")) {
			return FOOD;
		} else if (sample.getGroup_name2().equals("食品化工检测中心")) {
			return FOOD;
		} else if (sample.getGroup_name2().equals("包装及材料安全检测中心")) {
			return PACKAGE;
		} else if (sample.getGroup_name2().equals("机械产品安全检测中心")) {
			sample.setGroup_name("C04");
		} else if (sample.getGroup_name2().equals("工程安全节能检测中心")) {
			sample.setGroup_name("C05");
		} else if (sample.getGroup_name2().equals("家居产品检测中心")) {
			sample.setGroup_name("C06");
		} else if (sample.getGroup_name2().equals("科研中心")) {
			sample.setGroup_name("C07");
		} else if (sample.getGroup_name2().equals("市场业务部")) {
			sample.setGroup_name("M02");
		} else if (sample.getGroup_name2().equals("太阳能实验室")) {
			sample.setGroup_name("C08");
		} else if (sample.getGroup_name2().equals("工程材料实验室")) {
			sample.setGroup_name("C09");
		}
		return FOOD;
	}
}
