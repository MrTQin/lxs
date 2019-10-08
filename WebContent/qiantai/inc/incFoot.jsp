<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
        <div class="foot_pic"></div>
		<div class="left foot_msg">
			<br />
			 &nbsp; &nbsp;版权所有  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp 四川旅游网
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a target="_blank" href="<%=path %>/login.jsp">管理登录</a>
			<br />
		</div>
		<div style="clear: both"></div>
  </body>
</html>
