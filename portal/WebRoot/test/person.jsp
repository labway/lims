<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Person</title>
</head>
<body>
	<h3>Person</h3>
	<s:property value="#attr.session_zcy"></s:property>
	<s:property value="#attr.params"></s:property>
	<input value="#session.session_zcy"></input>
	<s:form namespace="/test" action="testAction!method1">
		<p>
			<s:label value="name" />
			<s:textfield name="person.name"></s:textfield>
		</p>
		<p>
			<s:label value="birthday" />
			<s:textfield name="person.birthday" />
		</p>
		<p>
			<s:label value="gender" />
			<s:checkbox name="person.boy"></s:checkbox>
		</p>
		<p>
			<s:label value="age" />
			<s:textfield name="person.age"></s:textfield>
		</p>
		<s:submit value="submit"></s:submit>
	</s:form>
	<s:iterator value="#request.list.{?#this.boy}">
		<s:property value="name" />
		<s:property value="age" />
	</s:iterator>
	<s:iterator value="#request.list">
		<s:if test="age==32">
		<s:property value="name" />
		<s:property value="age" />
		</s:if>
	</s:iterator>
</body>
</html>

