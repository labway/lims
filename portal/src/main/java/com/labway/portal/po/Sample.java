package com.labway.portal.po;

import java.io.Serializable;

public class Sample implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int sample_number;//��Ʒ���
String x_samplerecordno;//������/ί�б��
//ί�е�λ��Ϣ
String x_orgname;//ί�е�λ��ƣ��ܼ쵥λ��
String x_addr;//ί�е�λ��ϸ��ַ
String x_post;//ί�е�λ��������
String x_contacttel;//ί�е�λ��ϵ�绰
String x_prod_yieldname;//���λ
//��Ʒ��Ϣ
String x_prodnm;//��Ʒ���
String x_brand;//�̱�
String x_manuspcmodel;//����ͺ�
String x_sampleamount;//��Ʒ����
String x_samplelevel;//��Ʒ�ȼ�
String x_inspyielddate;//�������
String x_batchnum;//��Ʒ���
String x_samplestate;//��Ʒ״̬
String x_sample_keep;//��Ʒ��������
String x_files;//������Ƽ�����
String x_test_requ1;//����Ҫ��
//�������ݣ���׼��
String product;//��Ʒ��׼
String sampling_point;//��Ʒ����
String PRODUCT_GRADE;//��Ʒ�ȼ�
String spec_type;//�������
String STAGE;
//����Ҫ��
String x_test_requ2;//����������Դ
String x_test_requ3;//����������ݲ�������
String x_test_items;//������Ŀ
String x_test_requ4;//�ɱ�ʵ����������Ʒѡ�������Ŀ
String x_test_requ5;//��Э����Ŀ
String group_name;//�������
String group_name2;

//���潻��
String x_report_deliver;//���潻����ʽ
String  x_report_num;//�����ύ����
String due_date;//Լ���������
String x_sample_handle;//��Ʒ����
//����
String x_service_fee;//��⡢���������
String x_service_type;//��⼼����������
String x_lable_nums;//�����ǩ��
String x_standards;//��ҵ��׼���
String x_own_std;//��ҵ��׼���
String x_remark;//����Լ��˵��
String x_upto;//�Ƿ���ʵ������
String x_upto2;//�Ƿ���ʵ������
String x_contactman;//ί�з����ǩ��
String X_OWN_STDNO;//��ҵ��׼��
//�̶��ֶ����
String TEXT_ID ;// "��Ʒ���"
String STATUS;//"���״̬"
String OLD_STATUS ;// "��״̬"
String IN_SPEC  ;//  "�ϸ�"
String IN_CAL   ;// "У׼����"
String CHANGED_ON;//
String RE_SAMPLE ;//  "�����²���"
String ALIQUOT ;//   "����"
String  original_sample ; // "ԭʼ��Ʒ"

String PARENT_SAMPLE ;// "����Ʒ"
String PARENT_ALIQUOT    ;// "����ķ���"
String SAMPLE_VOLUME   ;//"��Ʒ��"
String LOGIN_DATE;//�Ǽ�����
String LOGIN_BY  ;//�Ǽ���
String RECD_DATE   ;//��������
String STARTED  ;//  "�ѿ�ʼ"
String PREP    ;//"׼��"
String PRODUCT_VERSION;// "��Ʒ�汾"
String PRIORITY;//"���ȼ�"
String TEMPLATE;//ģ��
String STANDARD;//��׼
String LOT;//"���"
String PARTIAL_SPEC  ;// "���ֹ��"
String PRIMARY_IN_SPEC ;// "��һ�ȼ��ϸ�"
String RELEASED ;// "�ѷ���"
String   IN_CONTROL ; //"�ܿ�"
String INVESTIGATED     ;// "�ѵ���"
String APPROVED ;//����׼
String READY_FOR_APPROVAL ;//����׼
String APPROVAL_ID      ;//��׼id
String MODIFIED_RESULTS;//�޸Ľ��
String REPORT_NUMBER ;//������
String COMPOSITE ;//�ϲ�
String PARENT_COMPOSITE  ;//"�ϲ��ĸ���Ʒ"
String PEOPLE;
String CHK_ALIQUOT_STATUS;
String CHK_ALIQUOT_SPECS;
String SAMPLE_EVENT;
String HAS_FLAGS;
String SAMPLED;
String NUM_CONTAINERS;
String REQD_VOLUME;
String COLLECTION_OFFSET;
String SIGNED;
String X_YEARTOTALOUTPUT;
String X_LABLE_BNUMS;//"�����ǩ��"
String X_PRODUCT_UNIT;
String X_LABLE_RESULT;//"��ǩ���"
String X_SAMPLE_TYPE;//
String X_ISEXPORT;
String X_PLANTYPE4;
String X_WORKERNUM;
String X_YEARSALE;
String X_PRICE;
String x_coa_status;//����״̬

String SAMPLED_DATE    ;//   "ȡ������"

String RECEIVED_BY   ;//������
String DATE_STARTED  ;//��ʼ����

String ASSIGNED_OPERATOR   ;//"��Ʒ����"
String X_PROD_M_DATE   ;//�����Ʒ��������
String X_PROD_TESTER  ;//  "��Ʒ����"
String X_PROD_T_DATE    ;//�����Ʒ��������
String X_PREP_METHOD   ;// "����"
String SAMPLE_UNITS   ;//��Ʒ��λ

public String getX_upto2() {
	return x_upto2;
}
public void setX_upto2(String x_upto2) {
	this.x_upto2 = x_upto2;
}
public String getGroup_name2() {
	return group_name2;
}
public void setGroup_name2(String group_name2) {
	this.group_name2 = group_name2;
}
public String getSTAGE() {
	return STAGE;
}
public void setSTAGE(String sTAGE) {
	STAGE = sTAGE;
}

public String getX_coa_status() {
	return x_coa_status;
}
public void setX_coa_status(String x_coa_status) {
	this.x_coa_status = x_coa_status;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getTEXT_ID() {
	return TEXT_ID;
}
public void setTEXT_ID(String tEXT_ID) {
	TEXT_ID = tEXT_ID;
}
public String getSTATUS() {
	return STATUS;
}
public void setSTATUS(String sTATUS) {
	STATUS = sTATUS;
}
public String getOLD_STATUS() {
	return OLD_STATUS;
}
public void setOLD_STATUS(String oLD_STATUS) {
	OLD_STATUS = oLD_STATUS;
}
public String getIN_SPEC() {
	return IN_SPEC;
}
public void setIN_SPEC(String iN_SPEC) {
	IN_SPEC = iN_SPEC;
}
public String getIN_CAL() {
	return IN_CAL;
}
public void setIN_CAL(String iN_CAL) {
	IN_CAL = iN_CAL;
}
public String getCHANGED_ON() {
	return CHANGED_ON;
}
public void setCHANGED_ON(String cHANGED_ON) {
	CHANGED_ON = cHANGED_ON;
}
public String getRE_SAMPLE() {
	return RE_SAMPLE;
}
public void setRE_SAMPLE(String rE_SAMPLE) {
	RE_SAMPLE = rE_SAMPLE;
}
public String getALIQUOT() {
	return ALIQUOT;
}
public void setALIQUOT(String aLIQUOT) {
	ALIQUOT = aLIQUOT;
}

public String getOriginal_sample() {
	return original_sample;
}
public void setOriginal_sample(String original_sample) {
	this.original_sample = original_sample;
}
public String getPARENT_SAMPLE() {
	return PARENT_SAMPLE;
}
public void setPARENT_SAMPLE(String pARENT_SAMPLE) {
	PARENT_SAMPLE = pARENT_SAMPLE;
}
public String getPARENT_ALIQUOT() {
	return PARENT_ALIQUOT;
}
public void setPARENT_ALIQUOT(String pARENT_ALIQUOT) {
	PARENT_ALIQUOT = pARENT_ALIQUOT;
}
public String getSAMPLE_VOLUME() {
	return SAMPLE_VOLUME;
}
public void setSAMPLE_VOLUME(String sAMPLE_VOLUME) {
	SAMPLE_VOLUME = sAMPLE_VOLUME;
}
public String getLOGIN_DATE() {
	return LOGIN_DATE;
}
public void setLOGIN_DATE(String lOGIN_DATE) {
	LOGIN_DATE = lOGIN_DATE;
}
public String getLOGIN_BY() {
	return LOGIN_BY;
}
public void setLOGIN_BY(String lOGIN_BY) {
	LOGIN_BY = lOGIN_BY;
}
public String getRECD_DATE() {
	return RECD_DATE;
}
public void setRECD_DATE(String rECD_DATE) {
	RECD_DATE = rECD_DATE;
}
public String getSTARTED() {
	return STARTED;
}
public void setSTARTED(String sTARTED) {
	STARTED = sTARTED;
}
public String getPREP() {
	return PREP;
}
public void setPREP(String pREP) {
	PREP = pREP;
}
public String getPRODUCT_VERSION() {
	return PRODUCT_VERSION;
}
public void setPRODUCT_VERSION(String pRODUCT_VERSION) {
	PRODUCT_VERSION = pRODUCT_VERSION;
}
public String getPRIORITY() {
	return PRIORITY;
}
public void setPRIORITY(String pRIORITY) {
	PRIORITY = pRIORITY;
}
public String getTEMPLATE() {
	return TEMPLATE;
}
public void setTEMPLATE(String tEMPLATE) {
	TEMPLATE = tEMPLATE;
}
public String getSTANDARD() {
	return STANDARD;
}
public void setSTANDARD(String sTANDARD) {
	STANDARD = sTANDARD;
}
public String getLOT() {
	return LOT;
}
public void setLOT(String lOT) {
	LOT = lOT;
}
public String getPARTIAL_SPEC() {
	return PARTIAL_SPEC;
}
public void setPARTIAL_SPEC(String pARTIAL_SPEC) {
	PARTIAL_SPEC = pARTIAL_SPEC;
}
public String getPRIMARY_IN_SPEC() {
	return PRIMARY_IN_SPEC;
}
public void setPRIMARY_IN_SPEC(String pRIMARY_IN_SPEC) {
	PRIMARY_IN_SPEC = pRIMARY_IN_SPEC;
}
public String getRELEASED() {
	return RELEASED;
}
public void setRELEASED(String rELEASED) {
	RELEASED = rELEASED;
}
public String getIN_CONTROL() {
	return IN_CONTROL;
}
public void setIN_CONTROL(String iN_CONTROL) {
	IN_CONTROL = iN_CONTROL;
}
public String getINVESTIGATED() {
	return INVESTIGATED;
}
public void setINVESTIGATED(String iNVESTIGATED) {
	INVESTIGATED = iNVESTIGATED;
}
public String getAPPROVED() {
	return APPROVED;
}
public void setAPPROVED(String aPPROVED) {
	APPROVED = aPPROVED;
}
public String getREADY_FOR_APPROVAL() {
	return READY_FOR_APPROVAL;
}
public void setREADY_FOR_APPROVAL(String rEADY_FOR_APPROVAL) {
	READY_FOR_APPROVAL = rEADY_FOR_APPROVAL;
}
public String getAPPROVAL_ID() {
	return APPROVAL_ID;
}
public void setAPPROVAL_ID(String aPPROVAL_ID) {
	APPROVAL_ID = aPPROVAL_ID;
}
public String getMODIFIED_RESULTS() {
	return MODIFIED_RESULTS;
}
public void setMODIFIED_RESULTS(String mODIFIED_RESULTS) {
	MODIFIED_RESULTS = mODIFIED_RESULTS;
}
public String getREPORT_NUMBER() {
	return REPORT_NUMBER;
}
public void setREPORT_NUMBER(String rEPORT_NUMBER) {
	REPORT_NUMBER = rEPORT_NUMBER;
}
public String getCOMPOSITE() {
	return COMPOSITE;
}
public void setCOMPOSITE(String cOMPOSITE) {
	COMPOSITE = cOMPOSITE;
}
public String getPARENT_COMPOSITE() {
	return PARENT_COMPOSITE;
}
public void setPARENT_COMPOSITE(String pARENT_COMPOSITE) {
	PARENT_COMPOSITE = pARENT_COMPOSITE;
}
public String getPEOPLE() {
	return PEOPLE;
}
public void setPEOPLE(String pEOPLE) {
	PEOPLE = pEOPLE;
}
public String getCHK_ALIQUOT_STATUS() {
	return CHK_ALIQUOT_STATUS;
}
public void setCHK_ALIQUOT_STATUS(String cHK_ALIQUOT_STATUS) {
	CHK_ALIQUOT_STATUS = cHK_ALIQUOT_STATUS;
}
public String getCHK_ALIQUOT_SPECS() {
	return CHK_ALIQUOT_SPECS;
}
public void setCHK_ALIQUOT_SPECS(String cHK_ALIQUOT_SPECS) {
	CHK_ALIQUOT_SPECS = cHK_ALIQUOT_SPECS;
}
public String getSAMPLE_EVENT() {
	return SAMPLE_EVENT;
}
public void setSAMPLE_EVENT(String sAMPLE_EVENT) {
	SAMPLE_EVENT = sAMPLE_EVENT;
}
public String getHAS_FLAGS() {
	return HAS_FLAGS;
}
public void setHAS_FLAGS(String hAS_FLAGS) {
	HAS_FLAGS = hAS_FLAGS;
}
public String getSAMPLED() {
	return SAMPLED;
}
public void setSAMPLED(String sAMPLED) {
	SAMPLED = sAMPLED;
}
public String getNUM_CONTAINERS() {
	return NUM_CONTAINERS;
}
public void setNUM_CONTAINERS(String nUM_CONTAINERS) {
	NUM_CONTAINERS = nUM_CONTAINERS;
}
public String getREQD_VOLUME() {
	return REQD_VOLUME;
}
public void setREQD_VOLUME(String rEQD_VOLUME) {
	REQD_VOLUME = rEQD_VOLUME;
}
public String getCOLLECTION_OFFSET() {
	return COLLECTION_OFFSET;
}
public void setCOLLECTION_OFFSET(String cOLLECTION_OFFSET) {
	COLLECTION_OFFSET = cOLLECTION_OFFSET;
}
public String getSIGNED() {
	return SIGNED;
}
public void setSIGNED(String sIGNED) {
	SIGNED = sIGNED;
}
public String getX_YEARTOTALOUTPUT() {
	return X_YEARTOTALOUTPUT;
}
public void setX_YEARTOTALOUTPUT(String x_YEARTOTALOUTPUT) {
	X_YEARTOTALOUTPUT = x_YEARTOTALOUTPUT;
}
public String getX_LABLE_BNUMS() {
	return X_LABLE_BNUMS;
}
public void setX_LABLE_BNUMS(String x_LABLE_BNUMS) {
	X_LABLE_BNUMS = x_LABLE_BNUMS;
}
public String getX_PRODUCT_UNIT() {
	return X_PRODUCT_UNIT;
}
public void setX_PRODUCT_UNIT(String x_PRODUCT_UNIT) {
	X_PRODUCT_UNIT = x_PRODUCT_UNIT;
}
public String getX_LABLE_RESULT() {
	return X_LABLE_RESULT;
}
public void setX_LABLE_RESULT(String x_LABLE_RESULT) {
	X_LABLE_RESULT = x_LABLE_RESULT;
}
public String getX_SAMPLE_TYPE() {
	return X_SAMPLE_TYPE;
}
public void setX_SAMPLE_TYPE(String x_SAMPLE_TYPE) {
	X_SAMPLE_TYPE = x_SAMPLE_TYPE;
}
public String getX_ISEXPORT() {
	return X_ISEXPORT;
}
public void setX_ISEXPORT(String x_ISEXPORT) {
	X_ISEXPORT = x_ISEXPORT;
}
public String getX_PLANTYPE4() {
	return X_PLANTYPE4;
}
public void setX_PLANTYPE4(String x_PLANTYPE4) {
	X_PLANTYPE4 = x_PLANTYPE4;
}
public String getX_WORKERNUM() {
	return X_WORKERNUM;
}
public void setX_WORKERNUM(String x_WORKERNUM) {
	X_WORKERNUM = x_WORKERNUM;
}
public String getX_YEARSALE() {
	return X_YEARSALE;
}
public void setX_YEARSALE(String x_YEARSALE) {
	X_YEARSALE = x_YEARSALE;
}
public String getX_PRICE() {
	return X_PRICE;
}
public void setX_PRICE(String x_PRICE) {
	X_PRICE = x_PRICE;
}
public String getSAMPLED_DATE() {
	return SAMPLED_DATE;
}
public void setSAMPLED_DATE(String sAMPLED_DATE) {
	SAMPLED_DATE = sAMPLED_DATE;
}
public String getRECEIVED_BY() {
	return RECEIVED_BY;
}
public void setRECEIVED_BY(String rECEIVED_BY) {
	RECEIVED_BY = rECEIVED_BY;
}
public String getDATE_STARTED() {
	return DATE_STARTED;
}
public void setDATE_STARTED(String dATE_STARTED) {
	DATE_STARTED = dATE_STARTED;
}
public String getASSIGNED_OPERATOR() {
	return ASSIGNED_OPERATOR;
}
public void setASSIGNED_OPERATOR(String aSSIGNED_OPERATOR) {
	ASSIGNED_OPERATOR = aSSIGNED_OPERATOR;
}
public String getX_PROD_M_DATE() {
	return X_PROD_M_DATE;
}
public void setX_PROD_M_DATE(String x_PROD_M_DATE) {
	X_PROD_M_DATE = x_PROD_M_DATE;
}
public String getX_PROD_TESTER() {
	return X_PROD_TESTER;
}
public void setX_PROD_TESTER(String x_PROD_TESTER) {
	X_PROD_TESTER = x_PROD_TESTER;
}
public String getX_PROD_T_DATE() {
	return X_PROD_T_DATE;
}
public void setX_PROD_T_DATE(String x_PROD_T_DATE) {
	X_PROD_T_DATE = x_PROD_T_DATE;
}
public String getX_PREP_METHOD() {
	return X_PREP_METHOD;
}
public void setX_PREP_METHOD(String x_PREP_METHOD) {
	X_PREP_METHOD = x_PREP_METHOD;
}
public String getSAMPLE_UNITS() {
	return SAMPLE_UNITS;
}
public void setSAMPLE_UNITS(String sAMPLE_UNITS) {
	SAMPLE_UNITS = sAMPLE_UNITS;
}


public String getPRODUCT_GRADE() {
	return PRODUCT_GRADE;
}
public void setPRODUCT_GRADE(String pRODUCT_GRADE) {
	PRODUCT_GRADE = pRODUCT_GRADE;
}



public String getSpec_type() {
	return spec_type;
}
public void setSpec_type(String spec_type) {
	this.spec_type = spec_type;
}
public String getSampling_point() {
	return sampling_point;
}
public void setSampling_point(String sampling_point) {
	this.sampling_point = sampling_point;
}
public String getX_report_num() {
	return x_report_num;
}
public void setX_report_num(String x_report_num) {
	this.x_report_num = x_report_num;
}

public String getDue_date() {
	return due_date;
}
public void setDue_date(String due_date) {
	this.due_date = due_date;
}

public String getX_report_deliver() {
	return x_report_deliver;
}
public void setX_report_deliver(String x_report_deliver) {
	this.x_report_deliver = x_report_deliver;
}
public String getX_sample_handle() {
	return x_sample_handle;
}
public void setX_sample_handle(String x_sample_handle) {
	this.x_sample_handle = x_sample_handle;
}




public String getX_service_type() {
	return x_service_type;
}
public void setX_service_type(String x_service_type) {
	this.x_service_type = x_service_type;
}
public String getX_lable_nums() {
	return x_lable_nums;
}
public void setX_lable_nums(String x_lable_nums) {
	this.x_lable_nums = x_lable_nums;
}
public String getX_upto() {
	return x_upto;
}
public void setX_upto(String x_upto) {
	this.x_upto = x_upto;
}
public String getX_test_requ2() {
	return x_test_requ2;
}
public void setX_test_requ2(String x_test_requ2) {
	this.x_test_requ2 = x_test_requ2;
}
public String getX_test_requ3() {
	return x_test_requ3;
}
public void setX_test_requ3(String x_test_requ3) {
	this.x_test_requ3 = x_test_requ3;
}
public String getX_test_requ4() {
	return x_test_requ4;
}
public void setX_test_requ4(String x_test_requ4) {
	this.x_test_requ4 = x_test_requ4;
}
public String getX_test_requ5() {
	return x_test_requ5;
}
public void setX_test_requ5(String x_test_requ5) {
	this.x_test_requ5 = x_test_requ5;
}


public String getGroup_name() {
	return group_name;
}
public void setGroup_name(String group_name) {
	this.group_name = group_name;
}
public String getX_test_items() {
	return x_test_items;
}
public void setX_test_items(String x_test_items) {
	this.x_test_items = x_test_items;
}


public String getX_own_std() {
	return x_own_std;
}
public void setX_own_std(String x_own_std) {
	this.x_own_std = x_own_std;
}
public String getX_service_fee() {
	return x_service_fee;
}
public void setX_service_fee(String x_service_fee) {
	this.x_service_fee = x_service_fee;
}
public String getX_standards() {
	return x_standards;
}
public void setX_standards(String x_standards) {
	this.x_standards = x_standards;
}
public String getX_remark() {
	return x_remark;
}
public void setX_remark(String x_remark) {
	this.x_remark = x_remark;
}
public String getX_contactman() {
	return x_contactman;
}
public void setX_contactman(String x_contactman) {
	this.x_contactman = x_contactman;
}
public String getX_orgname() {
	return x_orgname;
}
public void setX_orgname(String x_orgname) {
	this.x_orgname = x_orgname;
}

public String getX_prod_yieldname() {
	return x_prod_yieldname;
}
public void setX_prod_yieldname(String x_prod_yieldname) {
	this.x_prod_yieldname = x_prod_yieldname;
}

public String getX_addr() {
	return x_addr;
}
public void setX_addr(String x_addr) {
	this.x_addr = x_addr;
}
public String getX_post() {
	return x_post;
}
public void setX_post(String x_post) {
	this.x_post = x_post;
}
public String getX_contacttel() {
	return x_contacttel;
}
public void setX_contacttel(String x_contacttel) {
	this.x_contacttel = x_contacttel;
}

public String getX_samplerecordno() {
	return x_samplerecordno;
}
public void setX_samplerecordno(String x_samplerecordno) {
	this.x_samplerecordno = x_samplerecordno;
}
public String getX_OWN_STDNO() {
	return X_OWN_STDNO;
}
public void setX_OWN_STDNO(String x_OWN_STDNO) {
	X_OWN_STDNO = x_OWN_STDNO;
}
public int getSample_number() {
	return sample_number;
}
public void setSample_number(int sample_number) {
	this.sample_number = sample_number;
}
public String getX_prodnm() {
	return x_prodnm;
}
public void setX_prodnm(String x_prodnm) {
	this.x_prodnm = x_prodnm;
}



public String getX_brand() {
	return x_brand;
}
public void setX_brand(String x_brand) {
	this.x_brand = x_brand;
}



public String getX_manuspcmodel() {
	return x_manuspcmodel;
}
public void setX_manuspcmodel(String x_manuspcmodel) {
	this.x_manuspcmodel = x_manuspcmodel;
}
public String getX_sampleamount() {
	return x_sampleamount;
}
public void setX_sampleamount(String x_sampleamount) {
	this.x_sampleamount = x_sampleamount;
}
public String getX_samplelevel() {
	return x_samplelevel;
}
public void setX_samplelevel(String x_samplelevel) {
	this.x_samplelevel = x_samplelevel;
}
public String getX_batchnum() {
	return x_batchnum;
}
public void setX_batchnum(String x_batchnum) {
	this.x_batchnum = x_batchnum;
}
public String getX_samplestate() {
	return x_samplestate;
}
public void setX_samplestate(String x_samplestate) {
	this.x_samplestate = x_samplestate;
}


public String getX_sample_keep() {
	return x_sample_keep;
}
public void setX_sample_keep(String x_sample_keep) {
	this.x_sample_keep = x_sample_keep;
}
public String getX_files() {
	return x_files;
}
public void setX_files(String x_files) {
	this.x_files = x_files;
}
public String getX_inspyielddate() {
	return x_inspyielddate;
}
public void setX_inspyielddate(String x_inspyielddate) {
	this.x_inspyielddate = x_inspyielddate;
}
public String getX_test_requ1() {
	return x_test_requ1;
}
public void setX_test_requ1(String x_test_requ1) {
	this.x_test_requ1 = x_test_requ1;
}


}
