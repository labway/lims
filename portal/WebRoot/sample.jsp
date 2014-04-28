<%@page import="com.labway.portal.po.Sample"%>
<%@page import="com.toedter.calendar.JDateChooser"%>
<%@page import="com.labway.portal.po.Calendar"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" >
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'sample.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="css/indexCSS.css" rel="stylesheet" type="text/css" />
<link href="css/jquery.datepick.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="css/boxy.css" />
<script type="text/javascript" src="js/jquery-1.3.2.js"></script>
<script type="text/javascript" src="js/jquery.datepick.js"></script>
<script type="text/javascript" src="js/jquery.datepick-zh-CN.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<script type="text/javascript" src="js/jquery-ui-slide.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-timepicker-addon.js"></script>
<script type="text/javascript" src="js/jquery.boxy.js"></script>
<script type="text/javascript" src="js/sample.js"></script>
<script>
		//GROUP_NAME代号转换
		function groupchange(g){			
			if(g=="食品化工检测中心"){			
				document.getElementById("ssn22").value="C01";			
			}else if(g=="电器安全能效检测中心"){
				document.getElementById("ssn22").value="C02";				
			}else if(g=="包装及材料安全检测中心"){
				document.getElementById("ssn22").value="C03";	
			}
			else if(g=="机械产品安全检测中心"){
				document.getElementById("ssn22").value="C04";	
			}
			else if(g=="工程安全节能检测中心"){
				document.getElementById("ssn22").value="C05";	
			}
			else if(g=="家居产品检测中心"){
				document.getElementById("ssn22").value="C06";	
			}
			else if(g=="科研中心"){
				document.getElementById("ssn22").value="C07";	
			}
			else if(g=="市场业务部"){
				document.getElementById("ssn22").value="M02";	
			}
			else if(g=="太阳能实验室"){
				document.getElementById("ssn22").value="C08";	
			}
			else if(g=="工程材料实验室"){
				document.getElementById("ssn22").value="C09";	
			}			
		}
		//是否符合实验条件转换
		function fchange(f){			
			if(f=="符合"){
				document.getElementById("upto").value="T";					
			}else if(f=="不符合"){
				document.getElementById("upto").value="F";					
			}		
		}
		//点击确定按钮选择标准（product）
		function tian(ss) {
			document.getElementById("samp2").value = ss;

			var ssn9 = document.getElementById("ssn9").value;
			var ssn10 = document.getElementById("ssn10").value;
			var ssn11 = document.getElementById("ssn11").value;
			var ssn12 = document.getElementById("ssn12").value;
			var ssn13 = document.getElementById("ssn13").value;
			var ssn14 = document.getElementById("ssn14").value;
			var ssn1 = document.getElementById("ssn1").value;
			var ssn2 = document.getElementById("ssn2").value;
			var ssn3 = document.getElementById("ssn3").value;
			var ssn4 = document.getElementById("ssn4").value;
			var ssn5 = document.getElementById("ssn5").value;
			var ssn6 = document.getElementById("ssn6").value;
			var ssn7 = document.getElementById("ssn7").value;
			var ssn8 = document.getElementById("ssn8").value;
			var ssn15 = document.getElementById("ssn15").value;
			var ssn16 = document.getElementById("ssn16").value;			
			var ssn17 = document.getElementById("ssn17").value;
			var ssn18 = document.getElementById("ssn18").value;
			var ssn19 = document.getElementById("ssn19").value;
			var ssn20 = document.getElementById("ssn20").value;
			var ssn21 = document.getElementById("ssn21").value;
			var ssn23 = document.getElementById("ssn23").value;
			var ssn24 = document.getElementById("ssn24").value;
			var ssn25 = document.getElementById("ssn25").value;
			var ssn26 = document.getElementById("ssn26").value;
			var ssn27 = document.getElementById("ssn27").value;
			var ssn28 = document.getElementById("ssn28").value;
			var ssn29 = document.getElementById("ssn29").value;
			//var ssn36 = document.getElementById("ssn36").value;	
			var ssn30='<%=request.getAttribute("sx_test_requ3")%>';
			var ssn32='<%=request.getAttribute("sx_test_requ4")%>';
			var ssn34='<%=request.getAttribute("sx_test_requ5")%>';
			var dateinput2 = document.getElementById("dateinput2").value;
			var dateinput = document.getElementById("dateinput").value;			
			$("#aa").css({
				display : "none"
			});
			
			$("body").load("<%=path%>/getGrade", {
				prodname : ss,
				SAMPLERECORDNO : ssn9,
				X_ORGNAME : ssn10,
				X_PROD_YIELDNAME : ssn11,
				X_ADDR : ssn12,
				X_POST : ssn13,
				X_CONTACTTEL : ssn14,
				X_PRODNM : ssn1,
				X_BRAND : ssn2,
				X_MANUSPCMODEL : ssn3,
				X_SAMPLEAMOUNT : ssn4,
				X_SAMPLELEVEL : ssn5,
				dateinput : dateinput,
				X_BATCHNUM : ssn6,
				X_SAMPLESTATE : ssn7,
				x_sample_keep:ssn8,
				X_FILES : ssn15,
				X_TEST_REQU1 : ssn16,
				x_test_items :ssn17,
				due_date: dateinput2,
				x_service_fee: ssn23,
				x_standards: ssn18,
				x_own_std: ssn19,
				x_remark: ssn20,
				x_contactman: ssn21,
				x_test_requ2: ssn24,
				group_name2: ssn25,
				x_report_deliver: ssn26,
				x_sample_handle: ssn27,
				x_service_type: ssn28,
				x_upto2: ssn29,
				x_test_requ3:ssn30,
				x_test_requ4:ssn32,
				x_test_requ5:ssn34
				
			},function(){				
				keep();
			});
		}
		//隐藏域传值
		function fun2(){				
			var bb=document.getElementsByName("s.x_test_requ3");//仅供测试数据不做结论
			var bb1=document.getElementsByName("s.x_test_requ4");//由本实验室依据样品选定检测项目
			var bb2=document.getElementsByName("s.x_test_requ5");//按协议项目
			
			document.getElementById("ssm1").value=document.getElementById("ssn1").value;
			document.getElementById("ssm2").value=document.getElementById("ssn2").value;
			document.getElementById("ssm3").value=document.getElementById("ssn3").value;
			document.getElementById("ssm4").value=document.getElementById("ssn4").value;
			document.getElementById("ssm5").value=document.getElementById("ssn5").value;
			document.getElementById("ssm6").value=document.getElementById("ssn6").value;
			document.getElementById("ssm7").value=document.getElementById("ssn7").value;
			document.getElementById("ssm8").value=document.getElementById("ssn8").value;
			document.getElementById("ssm9").value=document.getElementById("ssn9").value;
			document.getElementById("ssm10").value=document.getElementById("ssn10").value;
			document.getElementById("ssm11").value=document.getElementById("ssn11").value;
			document.getElementById("ssm12").value=document.getElementById("ssn12").value;
			document.getElementById("ssm13").value=document.getElementById("ssn13").value;
			document.getElementById("ssm14").value=document.getElementById("ssn14").value;
			document.getElementById("ssm15").value=document.getElementById("ssn15").value;
			document.getElementById("ssm16").value=document.getElementById("ssn16").value;
			document.getElementById("ssm17").value=document.getElementById("ssn17").value;
			document.getElementById("ssm18").value=document.getElementById("ssn18").value;
			document.getElementById("ssm19").value=document.getElementById("ssn19").value;
			document.getElementById("ssm20").value=document.getElementById("ssn20").value;
			document.getElementById("ssm21").value=document.getElementById("ssn21").value;				
			document.getElementById("ssm22").value=document.getElementById("ssn22").value;
			document.getElementById("ssm23").value=document.getElementById("ssn23").value;
			document.getElementById("ssm24").value=document.getElementById("ssn24").value;
			document.getElementById("ssm25").value=document.getElementById("ssn25").value;
			document.getElementById("ssm26").value=document.getElementById("ssn26").value;
			document.getElementById("ssm27").value=document.getElementById("ssn27").value;
			document.getElementById("ssm28").value=document.getElementById("ssn28").value;
			document.getElementById("ssm29").value=document.getElementById("ssn29").value;
			//document.getElementById("ssm36").value=document.getElementById("ssn36").value;
			document.getElementById("ssmdateinput").value=document.getElementById("dateinput").value;
			document.getElementById("ssmdateinput2").value=document.getElementById("dateinput2").value;
			alert("aaaa");
			for(var i=0;i<bb.length; i++ ){
				if(bb[i].checked==true){
					document.getElementById("ssm30").value=bb[i].value;					
				}				
			}
			for(var i=0;i<bb1.length; i++ ){
				if(bb1[i].checked==true){
					document.getElementById("ssm32").value=bb1[i].value;					
				}				
			}
			for(var i=0;i<bb2.length; i++ ){
				if(bb2[i].checked==true){
					document.getElementById("ssm34").value=bb2[i].value;					
				}				
			}	
		}
		//选中一个样品
		function tiansample(kk,pp){			
			$("#bb").css({display:"none"});				
			$("body").load("<%=path%>/getSampleOne",{sampn:kk,prodn:pp},function(){
				keep();
			});
		}
		//隐藏表单的提交
		function form2tijiao(){
			
			fun2();	
			alert("sss");
			document.form2.submit();
		}
		//更新按钮的实现
		function form1updated(){
		var sn=document.getElementById("sss").value;
			if(confirm("确认要更新样品："+sn+"吗？"))
				document.form1.action="<%=path%>/updateSample";				
				document.form1.submit();
	
			}
		//form1样品表的提交
		function form1tijiao(){		
			if(confirm("确认要提交吗？"))
				document.form1.action="<%=path%>/insertSample";
				document.form1.submit();			
		}	
		//下拉列表默认选中
		function keep(){
			//样品保存条件
			var s = document.getElementById("ssn8");
			var ops = s.options;
			//检验依据
			var s1=document.getElementById("ssn24");
			var ops1=s1.options;
			//检验科室
			var s2=document.getElementById("ssn25");
			var ops2=s2.options;
			//报告提交方式
			var s3=document.getElementById("ssn26");
			var ops3=s3.options;
			//样品处理
			var s4=document.getElementById("ssn27");
			var ops4=s4.options;
			//检测技术服务类型
			var s5=document.getElementById("ssn28");
			var ops5=s5.options;
			//是否符合实验条件
			var s6=document.getElementById("ssn29");
			var ops6=s6.options;
			//仅供测试数据不做结论
			var s7=document.getElementsByName("s.x_test_requ3");
			//由本实验室依据样品选定检测项目
			var s8=document.getElementsByName("s.x_test_requ4");
			//按协议项目
			var s9=document.getElementsByName("s.x_test_requ5");
			//样品保存条件
			for(var i=0;i<ops.length; i++){
				var tempValue = ops[i].value;
				if(tempValue == "<%=request.getAttribute("sx_sample_keep")%>")   //这里是你要选的值
				{
					ops[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("ix_sample_keep")%>")   //这里是你要选的值
				{
					ops[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("samp_keep")%>")   //这里是你要选的值
				{
					ops[i].selected = true;
					break;
				}
			}
			//检验依据
			for(var i=0;i<ops1.length; i++){
				var tempValue = ops1[i].value;
				if(tempValue == "<%=request.getAttribute("sx_test_requ2")%>")   //这里是你要选的值
				{
					ops1[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("ix_test_requ2")%>")   //这里是你要选的值
				{
					ops1[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("samp_x_test_requ2")%>")   //这里是你要选的值
				{
					ops1[i].selected = true;
					break;
				}
			}
			//检验科室
			for(var i=0;i<ops2.length; i++){
				var tempValue = ops2[i].value;
				if(tempValue == "<%=request.getAttribute("sgroup_name2")%>")   //这里是你要选的值
				{
					ops2[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("igroup_name2")%>")   //这里是你要选的值
				{
					ops2[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("smap_group_name2")%>")   //这里是你要选的值
				{
					ops2[i].selected = true;					
					break;
				}
			}
			//报告提交方式
			for(var i=0;i<ops3.length; i++){
				var tempValue = ops3[i].value;
				if(tempValue == "<%=request.getAttribute("sx_report_deliver")%>")   //这里是你要选的值
				{
					ops3[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("ix_report_deliver")%>")   //这里是你要选的值
				{
					ops3[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("samp_x_report_deliver")%>")   //这里是你要选的值
				{
					ops3[i].selected = true;
					break;
				}
			}
			//样品处理
			for(var i=0;i<ops4.length; i++){
				var tempValue = ops4[i].value;
				if(tempValue == "<%=request.getAttribute("sx_sample_handle")%>")   //这里是你要选的值
				{
					ops4[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("ix_sample_handle")%>")   //这里是你要选的值
				{
					ops4[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("sampx_sample_handle")%>")   //这里是你要选的值
				{
					ops4[i].selected = true;
					break;
				}
			}
			//检测技术服务类型
			for(var i=0;i<ops5.length; i++){
				var tempValue = ops5[i].value;
				if(tempValue == "<%=request.getAttribute("sx_service_type")%>")   //这里是你要选的值
				{
					ops5[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("ix_service_type")%>")   //这里是你要选的值
				{
					ops5[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("sampx_service_type")%>")   //这里是你要选的值
				{
					ops5[i].selected = true;				
					break;
				}
			}
			//是否符合实验条件
			for(var i=0;i<ops6.length; i++){
				var tempValue = ops6[i].value;
				if(tempValue == "<%=request.getAttribute("sx_upto2")%>")   //这里是你要选的值
				{
					ops6[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("ix_upto2")%>")   //这里是你要选的值
				{
					ops6[i].selected = true;
					break;
				}
				if(tempValue == "<%=request.getAttribute("sampx_upto2")%>")   //这里是你要选的值
				{
					ops6[i].selected = true;
					break;
				}
			}
			//仅供测试数据不做结论
			for(var i=0;i<s7.length;i++){
				if(s7[i].value=="<%=request.getAttribute("sx_test_requ3")%>"){
					s7[i].checked=true;
				}
				if(s7[i].value=="<%=request.getAttribute("ix_test_requ3")%>"){
					s7[i].checked=true;
				}
				if(s7[i].value=="<%=request.getAttribute("sampx_test_requ3")%>"){
					s7[i].checked=true;
				}
				
			}
			//由本实验室依据样品选定检测项目
			for(var i=0;i<s8.length;i++){
				if(s8[i].value=="<%=request.getAttribute("sx_test_requ4")%>"){
					s8[i].checked=true;
				}
				if(s8[i].value=="<%=request.getAttribute("ix_test_requ4")%>"){
					s8[i].checked=true;
				}
				if(s8[i].value=="<%=request.getAttribute("sampx_test_requ4")%>"){
					s8[i].checked=true;
				}
				
			}
			//按协议项目
			for(var i=0;i<s9.length;i++){
				if(s9[i].value=="<%=request.getAttribute("sx_test_requ5")%>"){
					s9[i].checked=true;
				}
				if(s9[i].value=="<%=request.getAttribute("ix_test_requ5")%>"){
					s9[i].checked=true;
				}
				if(s9[i].value=="<%= request.getAttribute("sampx_test_requ5") %>") {
				s9[i].checked = true;
			}

		}

	}
</script>



</head>
<body id="main" onload="keep() ">
	<c:if test="${msg ne null }">
		<script>
			alert('${msg}');
		</script>
	</c:if>
	<div id="bb">
		<form action="<%=path%>/getSample" name="form3" method="post">
			<span><img src="<%=path%>/images/close.png"
				onclick="closeceng2()" class="clo" /> </span> <label> 请输入要查询的样品号：
			</label> <input type="text" id="samp" name="s.sample_number" /> <span></span>

			<input type="submit" value="确定">

		</form>

		<div id="ff2">
			<table class="t1">
				<tr class="bt">
					<td>样品号</td>
					<td>样品名称</td>
					<td>委托单位名称</td>
					<td>检测标准</td>
					<td>操作</td>
				</tr>
				<c:if test="${ samplelist ne null}">
					<c:forEach items="${ samplelist}" var="c">

						<tr class="bs">
							<td>${c.sample_number}</td>
							<td>${c.x_prodnm}</td>
							<td>${c.x_orgname }</td>
							<td>${c.product }</td>
							<td><a href="javascript:void();"
								onclick="tiansample('${c.sample_number}','${c.product }')">选择</a>
							</td>
						</tr>

					</c:forEach>
				</c:if>

			</table>
		</div>


	</div>
	<div id="aa">
		<form action="<%=path%>/getProduct" name="form2" method="post">
			<span><img src="<%=path%>/images/close.png"
				onclick="closeceng()" class="clo" /> </span> <label> 请输入要查询的标准号： </label>
			<input type="text" id="prod" name="p.name" /> <span></span>
			<%--委托单位信息	--%>
			<input type="hidden" name="s.x_samplerecordno" id="ssm9" /> <input
				type="hidden" name="s.x_orgname" id="ssm10" /> <input type="hidden"
				name="s.x_addr" id="ssm12" /> <input type="hidden" name="s.x_post"
				id="ssm13" /> <input type="hidden" name="s.x_contacttel" id="ssm14" />
			<input type="hidden" name="s.x_prod_yieldname" id="ssm11" />
			<%--产品信息--%>
			<input type="hidden" name="s.x_prodnm" id="ssm1" /> <input
				type="hidden" name="s.x_brand" id="ssm2" /> <input type="hidden"
				name="s.x_manuspcmodel" id="ssm3" /> <input type="hidden"
				name="s.x_sampleamount" id="ssm4" /> <input type="hidden"
				name="s.x_samplelevel" id="ssm5" /> <input type="hidden"
				name="s.x_inspyielddate" id="ssmdateinput" /> <input type="hidden"
				name="s.x_batchnum" id="ssm6" /> <input type="hidden"
				name="s.x_samplestate" id="ssm7" /> <input type="hidden"
				name="s.x_sample_keep" id="ssm8" /> <input type="hidden"
				name="s.x_files" id="ssm15" /> <input type="hidden"
				name="s.x_test_requ1" id="ssm16" />
			<%--检验依据（标准）--%>

			<%--检验要求--%>
			<input type="hidden" name="s.x_test_items" id="ssm17" /> <input
				type="hidden" name="s.group_name" id="ssm22" /> <input
				type="hidden" name="s.x_test_requ2" id="ssm24" /> <input
				type="hidden" name="s.group_name2" id="ssm25" /> <input
				type="hidden" name="s.x_test_requ3" id="ssm30" /> <input
				type="hidden" name="s.x_test_requ4" id="ssm32" /> <input
				type="hidden" name="s.x_test_requ5" id="ssm34" />
			<%--报告交付--%>
			<input type="hidden" name="s.due_date" id="ssmdateinput2" /> <input
				type="hidden" name="s.x_report_num" id="ssm36" /> <input
				type="hidden" name="s.x_report_deliver" id="ssm26" /> <input
				type="hidden" name="s.x_sample_handle" id="ssm27" />

			<%--其他--%>
			<input type="hidden" name="s.x_service_fee" id="ssm23" /> <input
				type="hidden" name="s.x_standards" id="ssm18" /> <input
				type="hidden" name="s.x_own_std" id="ssm19" /> <input type="hidden"
				name="s.x_remark" id="ssm20" /> <input type="hidden"
				name="s.x_contactman" id="ssm21" /> <input type="hidden"
				name="s.x_service_type" id="ssm28" /> <input type="hidden"
				name="s.x_upto2" id="ssm29" /> <input type="button" value="确定"
				onclick="form2tijiao()">

		</form>

		<div id="ff">
			<table class="t1">
				<tr class="bt">
					<td>名称</td>
					<td>说明</td>
					<td>是否审核</td>
					<td>操作</td>
				</tr>
				<c:if test="${ plist ne null}">
					<c:forEach items="${ plist}" var="a">

						<tr class="bs">
							<td>${a.name}</td>
							<td>${a.description }</td>
							<td>${a.x_reviewed }</td>
							<td><a href="javascript:void(0)" onclick="tian('${a.name}')">选择</a>
							</td>
						</tr>

					</c:forEach>
				</c:if>

			</table>
		</div>
	</div>

	<div id="maintable">
		<form action="" name="form1" method="post" onsubmit="">
			<s:token></s:token>
			<label class="yangpinhao"> 样品号: </label> <input type="text"
				name="s.sample_number" class="yangpinhao"
				value="${samplen.sample_number }" readonly="readonly" id="sss" /> <span
				id="sp"> 委托检验/技术服务协议书</span> 委托单号： <input type="text"
				name="s.x_samplerecordno" id="ssn9"
				value="  ${fn:trim(sSAMPLERECORDNO)} ${fn:trim(iSAMPLERECORDNO)}${fn:trim(samplen.x_samplerecordno)}" />
			<table width="1251" border="1" class="t2">
				<tr>
				</tr>
				<tr>
					<td rowspan="4" class="biaoti">委托单位信息</td>
				</tr>
				<tr>
					<td>委托单位名称：</td>
					<td><input type="text" name="s.x_orgname" id="ssn10"
						value="${fn:trim(sX_ORGNAME)}${fn:trim(iX_ORGNAME)}${fn:trim(samplen.x_orgname)} " />
					</td>
					<td>生产单位名称：</td>
					<td><input type="text" name="s.x_prod_yieldname"
						value="${fn:trim(sX_PROD_YIELDNAME)}${fn:trim(iX_PROD_YIELDNAME)}${fn:trim(samplen.x_prod_yieldname)}"
						id="ssn11" /></td>
				</tr>
				<tr>
					<td>委托单位详细地址：</td>
					<td><input type="text" name="s.x_addr"
						value="${fn:trim(sX_ADDR)}${fn:trim(iX_ADDR)}${fn:trim(samplen.x_addr)}"
						id="ssn12" /></td>
					<td>邮政编码：</td>
					<td><input type="text" name="s.x_post"
						value="${fn:trim(sX_POST)}${fn:trim(iX_POST)}${fn:trim(samplen.x_post)}"
						id="ssn13" /></td>
				</tr>
				<tr>

					<td>联系电话：</td>
					<td><input type="text" name="s.x_contacttel"
						value="${fn:trim(sX_CONTACTTEL)}${fn:trim(iX_CONTACTTEL)}${fn:trim(samplen.x_contacttel)}"
						id="ssn14" /></td>
					<td></td>
					<td></td>
				</tr>


				<tr>
					<td rowspan="7" class="biaoti">产品信息</td>
				</tr>
				<tr>
					<td>样品名称：</td>
					<td><input type="text" name="s.x_prodnm"
						value="${fn:trim(sname)}${fn:trim(iX_PRODNM)}${fn:trim(samplen.x_prodnm)}"
						id="ssn1" /></td>
					<td class="bitian">商标：</td>
					<td><input type="text" name="s.x_brand" id="ssn2"
						value="${fn:trim(sbrand )}${fn:trim(iX_BRAND)}${fn:trim(samplen.x_brand)} " />
					</td>
				</tr>
				<tr>
					<td>规格型号：</td>
					<td><input type="text" name=" s.x_manuspcmodel" id="ssn3"
						value="${fn:trim(sMANUSPCMODEL )}${fn:trim(iX_MANUSPCMODEL )}${fn:trim(samplen.x_manuspcmodel )}">
					</td>
					<td class="bitian">样品数量：</td>
					<td><input type="text" name="s.x_sampleamount" id="ssn4"
						value="${fn:trim(sSAMPLEAMOUNT )}${fn:trim(iX_SAMPLEAMOUNT )}${fn:trim(samplen.x_sampleamount )}">
					</td>

				</tr>
				<tr>
					<td class="bitian">质量等级：</td>
					<td><input type="text" name="s.x_samplelevel" id="ssn5"
						value="${fn:trim(sSAMPLELEVEL )}${fn:trim(iX_SAMPLELEVEL )}${fn:trim(samplen.x_samplelevel )}">
					</td>
					<td class="bitian">生产日期：</td>
					<td><input id="dateinput" type="text" name="s.x_inspyielddate"
						value="${fn:substring(sX_INSPYIELDDATE, 0, 10)}${fn:substring(idateinput, 0, 10)}${fn:substring(samplen.x_inspyielddate, 0, 10)}" />(例如：2014-01-03)
					</td>
				</tr>
				<tr>
					<td class="bitian">产品批号或编号：</td>
					<td><input type="text" name="s.x_batchnum" id="ssn6"
						value="${fn:trim(sBATCHNUM )}${fn:trim(iX_BATCHNUM )}${fn:trim(samplen.x_batchnum )}" />
					</td>
					<td class="bitian">样品状态：</td>
					<td><input type="text" name="s.x_samplestate" id="ssn7"
						value="${fn:trim(sSAMPLESTATE )}${fn:trim(iX_SAMPLESTATE )}${fn:trim(samplen.x_samplestate )}" />
					</td>
				</tr>
				<tr>
					<td>样品保存条件：</td>
					<td><select name="s.x_sample_keep" id="ssn8">
							<option id="keep0"></option>
							<option id="keep1">常温</option>
							<option id="keep2">避光</option>
							<option id="keep3">干燥</option>
							<option id="keep4">冷冻</option>
							<option id="keep5">冷藏</option>
							<option id="keep6">其他</option>
					</select></td>
					<td>样品资料名称及数量：</td>
					<td><input type="text" name="s.x_files" id="ssn15"
						value="${fn:trim(sX_FILES )}${fn:trim(iX_FILES )}${fn:trim(samplen.x_files )}" />
					</td>
				</tr>
				<tr>
					<td>保密要求：</td>
					<td><input type="text" name="s.x_test_requ1" id="ssn16"
						value="${fn:trim(sX_TEST_REQU1 )}${fn:trim(iX_TEST_REQU1 )}${fn:trim(samplen.x_test_requ1 )}" />
					</td>
					<td></td>
					<td></td>
				</tr>

				<tr>
					<td rowspan="3" class="biaoti">检验依据（标准）</td>
				</tr>


				<tr>
					<td class="bitian">检验依据(标准)：</td>

					<td><input type="text" id="samp2" name="s.product"
						value="${ prodname }${samplen.product}" readonly="readonly" /> <input
						type="button" value="查看" id="ck" onclick="chakan()" /></td>
					<td>产品分类：</td>
					<td><select name="s.sampling_point" id="ssn">

							<c:forEach items="${gradelist}" var="sd">
								<option>${ sd.prodgrade}</option>
							</c:forEach>


					</select></td>

				</tr>
				<tr>
					<td>产品等级：</td>
					<td><select name="s.PRODUCT_GRADE">
							<c:forEach items="${dengjilist}" var="dj">
								<option>${ dj.dengji}</option>
							</c:forEach>

					</select></td>
					<td>规格类型：</td>
					<td><select name="s.spec_type">
							<c:forEach items="${spectype}" var="gg">
								<option>${ gg.spectype}</option>
							</c:forEach>
					</select></td>
				</tr>

				<tr>
					<td rowspan="4" class="biaoti">检验要求</td>
				</tr>
				<tr>
					<td>检验依据来源：</td>
					<td><select name="s.x_test_requ2" id="ssn24">
							<option></option>
							<option>实验室选定</option>
							<option>委托方指定</option>
					</select></td>
					<td>仅供测试数据不做结论：</td>
					<td nowrap="nowrap"><input name="s.x_test_requ3" type="radio"
						id="ssn30" value="T" /> 是 <input type="radio"
						name="s.x_test_requ3" value="F" id="ssn31" checked="checked" /> 否

					</td>
				</tr>
				<tr>
					<td>检验项目：</td>
					<td><input type="text" name="s.x_test_items" id="ssn17"
						value="${fn:trim(sX_TEST_ITEMS )}${fn:trim(ix_test_items )}${fn:trim(samplen.x_test_items )}" />
					</td>
					<td>由本实验室依据样品选定检测项目：</td>
					<td><input name="s.x_test_requ4" type="radio" id="ssn32"
						value="T" checked="checked" /> 是 <input type="radio"
						name="s.x_test_requ4" value="F" id="ssn33" /> 否</td>
				</tr>
				<tr>
					<td>按协议项目：</td>
					<td nowrap="nowrap"><input name="s.x_test_requ5" type="radio"
						id="ssn34" value="T" checked="checked" /> 是 <input type="radio"
						name="s.x_test_requ5" value="F" id="ssn35" /> 否</td>
					<td>检验科室：</td>
					<td><select onchange="groupchange(this[selectedIndex].value);"
						id="ssn25" name="s.group_name2">
							<option></option>
							<option value="FOOD">食品化工检测中心</option>
							<option value="">电器安全能效检测中心</option>
							<option value="PACKAGE">包装及材料安全检测中心</option>
							<option>机械产品安全检测中心</option>
							<option>工程安全节能检测中心</option>
							<option>家居产品检测中心</option>
							<option>科研中心</option>
							<option>市场业务部</option>
							<option>太阳能实验室</option>
							<option>工程材料实验室</option>
					</select> <input type="hidden" name="s.group_name" id="ssn22" /></td>
				</tr>
				<tr>
					<td rowspan="3" class="biaoti">报告交付</td>
				</tr>
				<tr>
					<td>报告交付方式：</td>
					<td><select name="s.x_report_deliver" id="ssn26">
							<option></option>
							<option>自取</option>
							<option>挂号</option>
							<option>特快专递</option>
							<option>电子传递</option>
					</select></td>
					<td>报告交付份数：</td>
					<td><input type="button" class="btn" value="-"
						onclick="report('-')" /> <input type="text" id="reportnum"
						name="s.x_report_num" size="2" value="1" /> <input type="button"
						class="btn" value="+" onclick="report('+')" /></td>

				</tr>

				<tr>
					<td>协议交付日期：</td>
					<td><input name="s.due_date" type="text" id="dateinput2"
						value="${fn:substring(sdue_date, 0, 10)}${fn:substring(idue_date, 0, 10)}${fn:substring(samplen.due_date, 0, 10)}" />(例如：2014-01-03)
					</td>
					<td>样品处理：</td>
					<td><select name="s.x_sample_handle" id="ssn27">
							<option></option>
							<option>退换</option>
							<option>报废</option>
					</select></td>
				</tr>
				<tr>
					<td rowspan="5" class="biaoti">其他</td>
				</tr>
				<tr>
					<td>检测技术服务费：</td>
					<td><input type="text" name="s.x_service_fee" id="ssn23"
						value="${fn:trim(sx_service_fee )}${fn:trim(ix_service_fee )}${fn:trim(samplen.x_service_fee )}" />
					</td>
					<td>校验服务费收费类型：</td>
					<td><select name="s.x_service_type" id="ssn28">
							<option></option>
							<option>已交</option>
							<option>未交</option>
							<option>协议</option>
							<option>其他</option>
					</select></td>
				</tr>
				<tr>
					<td>检样标签数：</td>
					<td><label> <input type="button" class="btn" value="-"
							onclick="lablejian()" /> <input type="text"
							name="s.x_lable_nums" size="2" value="1" id="lablenum"> <input
							type="button" class="btn" value="+" onclick="lablejia()" />
					</label></td>
					<td>企业标准代号：</td>
					<td><input type="text" name="s.x_standards" id="ssn18"
						value="${fn:trim(sX_STANDARDS )}${fn:trim(ix_standards )}${fn:trim(samplen.x_standards )}" />
					</td>
				</tr>
				<tr>
					<td>企业标准名称：</td>
					<td><input type="text" name="s.x_own_std" id="ssn19"
						value="${fn:trim(sX_OWN_STD )}${fn:trim(ix_own_std )}${fn:trim(samplen.x_own_std )}" />
					</td>
					<td>其他约定说明：</td>
					<td><input type="text" name="s.x_remark" id="ssn20"
						value="${fn:trim(sx_remark )}${fn:trim(ix_remark )}${fn:trim(samplen.x_remark )}" />
					</td>
				</tr>
				<tr>
					<td id="zh">是否符合实验条件：</td>
					<td id="zh"><select
						onchange="fchange(this[selectedIndex].value);" name="s.x_upto2"
						id="ssn29">
							<option></option>
							<option>符合</option>
							<option>不符合</option>
					</select> <input type="hidden" id="upto" name="s.x_upto" /></td>
					<td id="zh">委托方代表签名：</td>
					<td id="zh"><input type="text" name="s.x_contactman"
						id="ssn21"
						value="${fn:trim(sX_CONTACTMAN )}${fn:trim(ix_contactman )}${fn:trim(samplen.x_contactman )}" />
					</td>
				</tr>


			</table>
			<input type="hidden" name="s.TEXT_ID" value="PL050111-2014" /> <input
				type="hidden" name="s.STATUS" value="U" /> <input type="hidden"
				name="s.OLD_STATUS" value="C" /> <input type="hidden"
				name="s.IN_SPEC" value="T" /> <input type="hidden" name="s.IN_CAL"
				value="T" /> <input type="hidden" name="s.CHANGED_ON" value="" />
			<input type="hidden" name="s.RE_SAMPLE" value="F" /> <input
				type="hidden" name="s.ALIQUOT" value="F" /> <input type="hidden"
				name="s.original_sample " value="" /> <input type="hidden"
				name="s.PARENT_SAMPLE " value="0" /> <input type="hidden"
				name="s.PARENT_ALIQUOT " value="0" /> <input type="hidden"
				name="s.SAMPLE_VOLUME " value="0.0000" /> <input type="hidden"
				name="s.LOGIN_DATE" value="" /> <input type="hidden"
				name="s.LOGIN_BY" value="WANGWANGSHU" /> <input type="hidden"
				name="s.RECD_DATE " value="" /> <input type="hidden"
				name="s.STARTED" value="F" /> <input type="hidden" name="s.PREP"
				value="F" /> <input type="hidden" name="s.PRODUCT_VERSION"
				value="1" /> <input type="hidden" name="s.PRIORITY" value="0" /> <input
				type="hidden" name="s.TEMPLATE" value="委托单" /> <input type="hidden"
				name="s.LOT" value="0" /> <input type="hidden" name="s.STANDARD"
				value="F" /> <input type="hidden" name="s.PARTIAL_SPEC" value="F" />
			<input type="hidden" name="s.PRIMARY_IN_SPEC" value="T" /> <input
				type="hidden" name="s.RELEASED" value="F" /> <input type="hidden"
				name="s.IN_CONTROL" value="T" /> <input type="hidden"
				name="s.INVESTIGATED" value="F" /> <input type="hidden"
				name="s.APPROVED" value="F" /> <input type="hidden"
				name="s.READY_FOR_APPROVAL" value="F" /> <input type="hidden"
				name="s.APPROVAL_ID" value="0" /> <input type="hidden"
				name="s.MODIFIED_RESULTS" value="F" /> <input type="hidden"
				name="s.REPORT_NUMBER" value="0" /> <input type="hidden"
				name="s.COMPOSITE" value="F" /> <input type="hidden"
				name="s.PARENT_COMPOSITE" value="0" /> <input type="hidden"
				name="s.PEOPLE" value="0" /> <input type="hidden"
				name="s.CHK_ALIQUOT_STATUS" value="F" /> <input type="hidden"
				name="s.CHK_ALIQUOT_SPECS" value="F" /> <input type="hidden"
				name="s.SAMPLE_EVENT" value="0" /> <input type="hidden"
				name="s.HAS_FLAGS" value="F" /> <input type="hidden"
				name="s.SAMPLED" value="F" /> <input type="hidden"
				name="s.NUM_CONTAINERS" value="1" /> <input type="hidden"
				name="s.REQD_VOLUME" value="0.0000" /> <input type="hidden"
				name="s.COLLECTION_OFFSET" value="0" /> <input type="hidden"
				name="s.SIGNED" value="F" /> <input type="hidden"
				name="s.X_YEARTOTALOUTPUT" value="0.0000" /> <input type="hidden"
				name="s.X_LABLE_BNUMS" value="1" /> <input type="hidden"
				name="s.X_PRODUCT_UNIT" value="F" /> <input type="hidden"
				name="s.X_LABLE_RESULT" value="F" /> <input type="hidden"
				name="s.X_SAMPLE_TYPE" value="" /> <input type="hidden"
				name="s.X_ISEXPORT" value="F" /> <input type="hidden"
				name="s.X_PLANTYPE4" value="委托" /> <input type="hidden"
				name="s.X_WORKERNUM" value="0" /> <input type="hidden"
				name="s.X_YEARSALE" value="0" /> <input type="hidden"
				name="s.X_PRICE" value="0.0000" /> <input type="hidden"
				name="s.STAGE" value="NONE" /> <input type="hidden"
				name="s.x_coa_status" value="U" /> <span class="tijiao"><input
				type="button" value="登记新样品" class="btn2" onclick="form1tijiao()">
				<input type="button" value="获取样品" class="btn2" onclick="sampled()">
				<input type="button" value="修改样品" class="btn2"
				onclick="form1updated()"> </span>
		</form>


	</div>

</body>
</html>
