<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'disp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <table>
  <tr><td>用户编号</td><td>用户名</td><td>用户密码</td><td>修改</td><td>删除</td></tr>
  <s:iterator  var="u" value="#request.list">
   <tr><td><s:property value="#u.uid"/></td><td><s:property value="#u.uname"/></td><td><s:property value="#u.pwd"/></td><td><a href="updateusers.jsp?uname=<s:property value="#u.uname"/>&pwd=<s:property value="#u.uname"/>&uid=<s:property value="#u.uid"/>">修改</a></td><td><a href="deleteusers?uid=<s:property value="#u.uid"/>">删除</a></td></tr>
  </s:iterator>
 
  </table>
   
  </body>
</html>
