package com.labway.portal.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.mapper.ActionMapping;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.labway.portal.po.Dengji;
import com.labway.portal.po.Grade;
import com.labway.portal.po.Product;
import com.labway.portal.po.Sample;
import com.labway.portal.po.SamplerKeep;
import com.labway.portal.po.SpecType;
import com.labway.portal.service.Department;
import com.labway.portal.service.ISampleService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class SampleAction extends ActionSupport implements ServletRequestAware, SessionAware {
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	private Map<String, Object> session;
	private Sample s;
	private String name;
	private Product p;
	private Grade g;
	ISampleService sampleService;

	public SampleAction() {
		System.out.println("---------------create a sample" + this.hashCode());
	}

	public Grade getG() {
		return g;
	}

	public void setG(Grade g) {
		this.g = g;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public Sample getS() {
		return s;
	}

	public void setS(Sample s) {
		this.s = s;
	}

	public void setSampleService(ISampleService sampleService) {
		this.sampleService = sampleService;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}

	public String addSample() {
		if (s.getGroup_name2().equals("食品化工检测中心")) {
			s.setGroup_name("C01");
		} else if (s.getGroup_name2().equals("食品化工检测中心")) {
			s.setGroup_name("C02");
		} else if (s.getGroup_name2().equals("包装及材料安全检测中心")) {
			s.setGroup_name("C03");
		} else if (s.getGroup_name2().equals("机械产品安全检测中心")) {
			s.setGroup_name("C04");
		} else if (s.getGroup_name2().equals("工程安全节能检测中心")) {
			s.setGroup_name("C05");
		} else if (s.getGroup_name2().equals("家居产品检测中心")) {
			s.setGroup_name("C06");
		} else if (s.getGroup_name2().equals("科研中心")) {
			s.setGroup_name("C07");
		} else if (s.getGroup_name2().equals("市场业务部")) {
			s.setGroup_name("M02");
		} else if (s.getGroup_name2().equals("太阳能实验室")) {
			s.setGroup_name("C08");
		} else if (s.getGroup_name2().equals("工程材料实验室")) {
			s.setGroup_name("C09");
		}
		this.sampleService.insertSample(this.s);
		int snum = this.sampleService.getSampleMaxNum(Department.getDepartmentFromSample(this.s));
		request.setAttribute("msg", "样品添加成功！,样品编号为：" + snum + "");
		return Action.SUCCESS;
	}

	public String getProduct() {

		String sSAMPLERECORDNO = s.getX_samplerecordno();// 委托单号
		// 委托单位信息
		String sX_ORGNAME = s.getX_orgname();// 委托单位名称（受检单位）
		String sX_PROD_YIELDNAME = s.getX_prod_yieldname();// 生产单位
		String sX_ADDR = s.getX_addr();// 委托单位详细地址
		String sX_POST = s.getX_post();// 委托单位邮政编码
		String sX_CONTACTTEL = s.getX_contacttel();// 委托单位联系电话
		// 产品信息
		String sname = s.getX_prodnm();// 样品名称
		String sbrand = s.getX_brand();// 商标
		String sMANUSPCMODEL = s.getX_manuspcmodel();// 规格型号
		String sSAMPLEAMOUNT = s.getX_sampleamount();// 样品数量
		String sSAMPLELEVEL = s.getX_samplelevel();// 样品等级
		String sX_INSPYIELDDATE = s.getX_inspyielddate();// 生产日期
		String sBATCHNUM = s.getX_batchnum();// 样品批号
		String sSAMPLESTATE = s.getX_samplestate();// 样品状态
		String sx_sample_keep = s.getX_sample_keep();// 样品保存条件
		String sX_FILES = s.getX_files();// 资料名称及数量
		String sX_TEST_REQU1 = s.getX_test_requ1();// 保密要求
		// 检验依据（标准）
		String name = String.valueOf(p.getName());// 检验标准（product）
		// 检验要求
		String sX_TEST_ITEMS = s.getX_test_items();// 检验项目
		String sx_test_requ3 = s.getX_test_requ3();// 仅供测试数据不做结论
		String sGroup_Name = s.getGroup_name();// 检验科室
		String sx_test_requ4 = s.getX_test_requ4();// 由本实验室依据样品选定检测项目
		String sx_test_requ5 = s.getX_test_requ5();// 按协议项目
		String sx_test_requ2 = s.getX_test_requ2();// 检验依据来源
		String sgroup_name2 = s.getGroup_name2();// 检验科室
		// 报告交付
		String sdue_date = s.getDue_date();// 约定完成日期
		// String sx_report_num=s.getX_report_num();//报告提交数量
		String sx_report_deliver = s.getX_report_deliver();// 报告提交方式
		String sx_sample_handle = s.getX_sample_handle();// 样品处理
		// 其他
		String sx_service_fee = s.getX_service_fee();// 检测、技术服务费
		String sX_STANDARDS = s.getX_standards();// 企业标准代号
		String sX_OWN_STD = s.getX_own_std();// 企业标准名称
		String sX_CONTACTMAN = s.getX_contactman();// 委托方代表签名
		String sx_remark = s.getX_remark();// 其他约定说明
		String sx_service_type = s.getX_service_type();// 检测技术服务类型
		String sx_upto2 = s.getX_upto2();// 是否符合实验条件
		if (name != "") {
			List<Product> list = this.sampleService.getProduct(name, Department.valueOf(sgroup_name2));
			request.setAttribute("plist", list);
		}
		if (sname != "") {
			request.setAttribute("sname", sname);
		}
		if (sbrand != "") {
			request.setAttribute("sbrand", sbrand);
		}
		if (sMANUSPCMODEL != "") {
			request.setAttribute("sMANUSPCMODEL", sMANUSPCMODEL);
		}
		if (sSAMPLEAMOUNT != "") {
			request.setAttribute("sSAMPLEAMOUNT", sSAMPLEAMOUNT);
		}
		if (sSAMPLELEVEL != "") {
			request.setAttribute("sSAMPLELEVEL", sSAMPLELEVEL);
		}
		if (sBATCHNUM != "") {
			request.setAttribute("sBATCHNUM", sBATCHNUM);
		}
		if (sSAMPLESTATE != "") {
			request.setAttribute("sSAMPLESTATE", sSAMPLESTATE);
		}
		if (sSAMPLERECORDNO != "") {
			request.setAttribute("sSAMPLERECORDNO", sSAMPLERECORDNO);// 委托单号
		}

		if (sX_ORGNAME != "") {
			request.setAttribute("sX_ORGNAME", sX_ORGNAME);
		}
		if (sX_PROD_YIELDNAME != "") {
			request.setAttribute("sX_PROD_YIELDNAME", sX_PROD_YIELDNAME);
		}
		if (sX_ADDR != "") {
			request.setAttribute("sX_ADDR", sX_ADDR);
		}
		if (sX_POST != "") {
			request.setAttribute("sX_POST", sX_POST);
		}
		if (sX_CONTACTTEL != "") {
			request.setAttribute("sX_CONTACTTEL", sX_CONTACTTEL);
		}
		if (sX_FILES != "") {
			request.setAttribute("sX_FILES", sX_FILES);
		}
		if (sX_TEST_REQU1 != "") {
			request.setAttribute("sX_TEST_REQU1", sX_TEST_REQU1);
		}
		if (sX_TEST_ITEMS != "") {
			request.setAttribute("sX_TEST_ITEMS", sX_TEST_ITEMS);
		}
		if (sX_STANDARDS != "") {
			request.setAttribute("sX_STANDARDS", sX_STANDARDS);
		}
		if (sX_OWN_STD != "") {
			request.setAttribute("sX_OWN_STD", sX_OWN_STD);
		}

		if (sX_CONTACTMAN != "") {
			request.setAttribute("sX_CONTACTMAN", sX_CONTACTMAN);
		}

		if (sX_INSPYIELDDATE != "") {
			request.setAttribute("sX_INSPYIELDDATE", sX_INSPYIELDDATE);
		}
		if (sX_INSPYIELDDATE != "") {
			request.setAttribute("sGroup_Name", sGroup_Name);
		}
		if (sdue_date != "") {
			request.setAttribute("sdue_date", sdue_date);
		}
		if (sx_service_fee != "") {
			request.setAttribute("sx_service_fee", sx_service_fee);
		}
		if (sx_remark != "") {
			request.setAttribute("sx_remark", sx_remark);
		}
		if (sx_sample_keep != "") {
			request.setAttribute("sx_sample_keep", sx_sample_keep);
		}
		if (sx_test_requ2 != "") {
			request.setAttribute("sx_test_requ2", sx_test_requ2);
		}
		if (sgroup_name2 != "") {
			request.setAttribute("sgroup_name2", sgroup_name2);
		}
		if (sx_report_deliver != "") {
			request.setAttribute("sx_report_deliver", sx_report_deliver);
		}

		if (sx_sample_handle != "") {
			request.setAttribute("sx_sample_handle", sx_sample_handle);
		}

		if (sx_service_type != "") {
			request.setAttribute("sx_service_type", sx_service_type);
		}
		if (sx_upto2 != "") {
			request.setAttribute("sx_upto2", sx_upto2);
		}
		if (sx_test_requ3 != "") {
			request.setAttribute("sx_test_requ3", sx_test_requ3);
		}
		if (sx_test_requ4 != "") {
			request.setAttribute("sx_test_requ4", sx_test_requ4);
		}
		if (sx_test_requ5 != "") {
			request.setAttribute("sx_test_requ5", sx_test_requ5);
		}
		// if (sx_report_num != "") {
		// request.setAttribute("sx_report_num", sx_report_num);
		// }
		return this.SUCCESS;
	}

	public String getGrade() {
		String prodname = request.getParameter("prodname");
		String iSAMPLERECORDNO = request.getParameter("SAMPLERECORDNO");
		String iX_ORGNAME = request.getParameter("X_ORGNAME");
		String iX_PROD_YIELDNAME = request.getParameter("X_PROD_YIELDNAME");
		String iX_ADDR = request.getParameter("X_ADDR");
		String iX_POST = request.getParameter("X_POST");
		String iX_CONTACTTEL = request.getParameter("X_CONTACTTEL");
		String iX_PRODNM = request.getParameter("X_PRODNM");
		String iX_BRAND = request.getParameter("X_BRAND");
		String iX_MANUSPCMODEL = request.getParameter("X_MANUSPCMODEL");
		String iX_SAMPLEAMOUNT = request.getParameter("X_SAMPLEAMOUNT");
		String iX_SAMPLELEVEL = request.getParameter("X_SAMPLELEVEL");
		String idateinput = request.getParameter("dateinput");
		String iX_BATCHNUM = request.getParameter("X_BATCHNUM");
		String iX_SAMPLESTATE = request.getParameter("X_SAMPLESTATE");
		String iX_FILES = request.getParameter("X_FILES");
		String iX_TEST_REQU1 = request.getParameter("X_TEST_REQU1");
		String ix_test_items = request.getParameter("x_test_items");
		String idue_date = request.getParameter("due_date");
		String ix_service_fee = request.getParameter("x_service_fee");
		String ix_standards = request.getParameter("x_standards");
		String ix_own_std = request.getParameter("x_own_std");
		String ix_remark = request.getParameter("x_remark");
		String ix_contactman = request.getParameter("x_contactman");
		String ix_sample_keep = request.getParameter("x_sample_keep");
		String ix_test_requ2 = request.getParameter("x_test_requ2");
		String igroup_name2 = request.getParameter("group_name2");
		String ix_report_deliver = request.getParameter("x_report_deliver");
		String ix_sample_handle = request.getParameter("x_sample_handle");
		String ix_service_type = request.getParameter("x_service_type");
		String ix_upto2 = request.getParameter("x_upto2");
		String ix_test_requ3 = request.getParameter("x_test_requ3");
		String ix_test_requ4 = request.getParameter("x_test_requ4");
		String ix_test_requ5 = request.getParameter("x_test_requ5");
		Department department = Department.valueOf(igroup_name2);
		// String ix_report_num = request.getParameter("x_report_num");
		List<Grade> gradelist = this.sampleService.getGrade(prodname, department);
		List<Dengji> dengjilist = this.sampleService.getDengji(prodname, department);
		List<SpecType> spectype = this.sampleService.getSpecType(prodname, department);
		request.setAttribute("gradelist", gradelist);
		request.setAttribute("dengjilist", dengjilist);
		request.setAttribute("spectype", spectype);
		request.setAttribute("prodname", prodname);
		session.put("sgradelist", gradelist);
		session.put("sdengjilist", dengjilist);
		session.put("sspectype", spectype);
		session.put("sprodname", prodname);
		request.setAttribute("iSAMPLERECORDNO", iSAMPLERECORDNO);
		request.setAttribute("iX_ORGNAME", iX_ORGNAME);
		request.setAttribute("iX_PROD_YIELDNAME", iX_PROD_YIELDNAME);
		request.setAttribute("iX_ADDR", iX_ADDR);
		request.setAttribute("iX_POST", iX_POST);
		request.setAttribute("iX_CONTACTTEL", iX_CONTACTTEL);
		request.setAttribute("iX_PRODNM", iX_PRODNM);
		request.setAttribute("iX_BRAND", iX_BRAND);
		request.setAttribute("iX_MANUSPCMODEL", iX_MANUSPCMODEL);
		request.setAttribute("iX_SAMPLEAMOUNT", iX_SAMPLEAMOUNT);
		request.setAttribute("iX_SAMPLELEVEL", iX_SAMPLELEVEL);
		request.setAttribute("idateinput", idateinput);
		request.setAttribute("iX_BATCHNUM", iX_BATCHNUM);
		request.setAttribute("iX_SAMPLESTATE", iX_SAMPLESTATE);
		request.setAttribute("iX_FILES", iX_FILES);
		request.setAttribute("iX_TEST_REQU1", iX_TEST_REQU1);
		request.setAttribute("ix_test_items", ix_test_items);
		request.setAttribute("idue_date", idue_date);
		request.setAttribute("ix_service_fee", ix_service_fee);
		request.setAttribute("ix_standards", ix_standards);
		request.setAttribute("ix_own_std", ix_own_std);
		request.setAttribute("ix_remark", ix_remark);
		request.setAttribute("ix_contactman", ix_contactman);
		request.setAttribute("ix_sample_keep", ix_sample_keep);
		request.setAttribute("ix_test_requ2", ix_test_requ2);
		request.setAttribute("igroup_name2", igroup_name2);
		request.setAttribute("ix_report_deliver", ix_report_deliver);
		request.setAttribute("ix_sample_handle", ix_sample_handle);
		request.setAttribute("ix_service_type", ix_service_type);
		request.setAttribute("ix_upto2", ix_upto2);
		request.setAttribute("ix_test_requ3", ix_test_requ3);
		request.setAttribute("ix_test_requ4", ix_test_requ4);
		request.setAttribute("ix_test_requ5", ix_test_requ5);
		// request.setAttribute("ix_report_num", ix_report_num);
		return Action.SUCCESS;
	}

	public String getSample() {
		int samplename = s.getSample_number();
		List<Sample> samplelist = this.sampleService.getSample(samplename, Department.getDepartmentFromSample(s));
		request.setAttribute("samplelist", samplelist);
		return Action.SUCCESS;
	}

	public String getSampleOne() {
		String sn = request.getParameter("sampn");
		String pn = request.getParameter("prodn");
		// 这个地方会存在问题，未来需要按照固定的方式来进行调整，如选中某个sample的时候需传入是哪个部门？？？？？？？？？？？？？？
		Department department = null;
		Sample samp = this.sampleService.getSampleOne(Integer.parseInt(sn), department);
		// 获取样品后回填下拉列表，RADIOBUTTON
		String samp_keep = samp.getX_sample_keep();// 获取样品保存条件
		String samp_x_test_requ2 = samp.getX_test_requ2();// 检验依据来源
		String smap_group_name = samp.getGroup_name();// 检验科室
		String samp_x_report_deliver = samp.getX_report_deliver();// 报告提交方式
		String sampx_sample_handle = samp.getX_sample_handle();// 样品处理
		String sampx_service_type = samp.getX_service_type();// 检测技术服务类型
		String sampx_upto = samp.getX_upto();//
		String sampx_test_requ3 = samp.getX_test_requ3();// 仅供测试不做结论
		String sampx_test_requ4 = samp.getX_test_requ4();// //由本实验室依据样品选定检测项目
		String sampx_test_requ5 = samp.getX_test_requ5();// 按协议项目
		if (smap_group_name != null) {
			if (smap_group_name.equals("C01")) {
				String smap_group_name2 = "食品化工检测中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
				System.out.println("smap_group_name2:" + smap_group_name2);
			} else if (smap_group_name.equals("C02")) {
				String smap_group_name2 = "电器安全能效检测中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C03")) {
				String smap_group_name2 = "包装及材料安全检测中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C04")) {
				String smap_group_name2 = "机械产品安全检测中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C05")) {
				String smap_group_name2 = "工程安全节能检测中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C06")) {
				String smap_group_name2 = "家居产品检测中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C07")) {
				String smap_group_name2 = "科研中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("M02")) {
				String smap_group_name2 = "市场业务部";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C08")) {
				String smap_group_name2 = "太阳能实验室";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C09")) {
				String smap_group_name2 = "工程材料实验室";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else {
				request.setAttribute("smap_group_name2", "");
			}
		}

		if (sampx_upto != null) {
			if (sampx_upto.equals("T")) {
				String sampx_upto2 = "符合";
				request.setAttribute("sampx_upto2", sampx_upto2);
			} else if (sampx_upto.equals("F")) {
				String sampx_upto2 = "不符合";
				request.setAttribute("sampx_upto2", sampx_upto2);
			}

		}
		if (samp_keep != null) {
			request.setAttribute("samp_keep", samp_keep);
		}
		if (samp_x_test_requ2 != null) {
			request.setAttribute("samp_x_test_requ2", samp_x_test_requ2);
		}
		if (samp_x_report_deliver != null) {
			request.setAttribute("samp_x_report_deliver", samp_x_report_deliver);
		}
		if (sampx_sample_handle != null) {
			request.setAttribute("sampx_sample_handle", sampx_sample_handle);
		}
		if (sampx_service_type != null) {
			request.setAttribute("sampx_service_type", sampx_service_type);
		}
		if (sampx_test_requ3 != null) {
			request.setAttribute("sampx_test_requ3", sampx_test_requ3);
		}
		if (sampx_test_requ4 != null) {
			request.setAttribute("sampx_test_requ4", sampx_test_requ4);
		}
		if (sampx_test_requ5 != null) {
			request.setAttribute("sampx_test_requ5", sampx_test_requ5);
		}

		request.setAttribute("samplen", samp);

		session.put("sampleno", sn);
		session.put("samplen2", samp);
		List<Grade> gradelist = this.sampleService.getGrade(pn, department);
		List<Dengji> dengjilist = this.sampleService.getDengji(pn, department);
		List<SpecType> spectype = this.sampleService.getSpecType(pn, department);
		request.setAttribute("gradelist", gradelist);
		request.setAttribute("dengjilist", dengjilist);
		request.setAttribute("spectype", spectype);
		System.out.println("11111111111111111111111");
		return Action.SUCCESS;
	}

	public String updateSample() {
		int sno = s.getSample_number();
		String pno = s.getProduct();
		if (s.getGroup_name2().equals("食品化工检测中心")) {
			s.setGroup_name("C01");
		} else if (s.getGroup_name2().equals("食品化工检测中心")) {
			s.setGroup_name("C02");
		} else if (s.getGroup_name2().equals("包装及材料安全检测中心")) {
			s.setGroup_name("C03");
		} else if (s.getGroup_name2().equals("机械产品安全检测中心")) {
			s.setGroup_name("C04");
		} else if (s.getGroup_name2().equals("工程安全节能检测中心")) {
			s.setGroup_name("C05");
		} else if (s.getGroup_name2().equals("家居产品检测中心")) {
			s.setGroup_name("C06");
		} else if (s.getGroup_name2().equals("科研中心")) {
			s.setGroup_name("C07");
		} else if (s.getGroup_name2().equals("市场业务部")) {
			s.setGroup_name("M02");
		} else if (s.getGroup_name2().equals("太阳能实验室")) {
			s.setGroup_name("C08");
		} else if (s.getGroup_name2().equals("工程材料实验室")) {
			s.setGroup_name("C09");
		}

		if (s.getX_upto2().equals("符合")) {
			s.setX_upto("T");
		} else if (s.getX_upto2().equals("不符合")) {
			s.setX_upto("F");
		}
		this.sampleService.updateSample(this.s);
		Department department = Department.getDepartmentFromSample(s);
		Sample samp = this.sampleService.getSampleOne(sno, department);
		// 获取样品后回填下拉列表
		String samp_keep = samp.getX_sample_keep();// 获取样品保存条件
		String samp_x_test_requ2 = samp.getX_test_requ2();// 检验依据来源
		String smap_group_name = samp.getGroup_name();// 检验科室
		String samp_x_report_deliver = samp.getX_report_deliver();// 报告提交方式
		String sampx_sample_handle = samp.getX_sample_handle();// 样品处理
		String sampx_service_type = samp.getX_service_type();// 检测技术服务类型
		String sampx_upto = samp.getX_upto();//
		String sampx_test_requ3 = samp.getX_test_requ3();// 仅供测试不做结论
		String sampx_test_requ4 = samp.getX_test_requ4();// //由本实验室依据样品选定检测项目
		String sampx_test_requ5 = samp.getX_test_requ5();// 按协议项目

		if (smap_group_name != null) {
			if (smap_group_name.equals("C01")) {
				String smap_group_name2 = "食品化工检测中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
				System.out.println("smap_group_name2:" + smap_group_name2);
			} else if (smap_group_name.equals("C02")) {
				String smap_group_name2 = "电器安全能效检测中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C03")) {
				String smap_group_name2 = "包装及材料安全检测中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C04")) {
				String smap_group_name2 = "机械产品安全检测中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C05")) {
				String smap_group_name2 = "工程安全节能检测中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C06")) {
				String smap_group_name2 = "家居产品检测中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C07")) {
				String smap_group_name2 = "科研中心";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("M02")) {
				String smap_group_name2 = "市场业务部";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C08")) {
				String smap_group_name2 = "太阳能实验室";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else if (smap_group_name.equals("C09")) {
				String smap_group_name2 = "工程材料实验室";
				request.setAttribute("smap_group_name2", smap_group_name2);
			} else {
				request.setAttribute("smap_group_name2", "");
			}
		}

		if (sampx_upto != null) {
			if (sampx_upto.equals("T")) {
				String sampx_upto2 = "符合";
				request.setAttribute("sampx_upto2", sampx_upto2);
			} else if (sampx_upto.equals("F")) {
				String sampx_upto2 = "不符合";
				request.setAttribute("sampx_upto2", sampx_upto2);
			}

		}
		if (samp_keep != null) {
			request.setAttribute("samp_keep", samp_keep);
		}
		if (samp_x_test_requ2 != null) {
			request.setAttribute("samp_x_test_requ2", samp_x_test_requ2);
		}
		if (samp_x_report_deliver != null) {
			request.setAttribute("samp_x_report_deliver", samp_x_report_deliver);
		}
		if (sampx_sample_handle != null) {
			request.setAttribute("sampx_sample_handle", sampx_sample_handle);
		}
		if (sampx_service_type != null) {
			request.setAttribute("sampx_service_type", sampx_service_type);
		}
		if (sampx_test_requ3 != null) {
			request.setAttribute("sampx_test_requ3", sampx_test_requ3);
		}
		if (sampx_test_requ4 != null) {
			request.setAttribute("sampx_test_requ4", sampx_test_requ4);
		}
		if (sampx_test_requ5 != null) {
			request.setAttribute("sampx_test_requ5", sampx_test_requ5);
		}
		request.setAttribute("samplen", samp);
		List<Grade> gradelist = this.sampleService.getGrade(pno, department);
		List<Dengji> dengjilist = this.sampleService.getDengji(pno, department);
		List<SpecType> spectype = this.sampleService.getSpecType(pno, department);
		request.setAttribute("gradelist", gradelist);
		request.setAttribute("dengjilist", dengjilist);
		request.setAttribute("spectype", spectype);
		return Action.SUCCESS;
	}

	public String getSampleKeep() {
		Department department = null;
		List<SamplerKeep> skeeplist = this.sampleService.getSampleKeep(department);
		request.setAttribute("skeeplist", skeeplist);
		return Action.SUCCESS;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}