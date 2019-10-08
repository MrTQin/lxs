<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="24" background="<%=path %>/img/tbg.gif">&nbsp;&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="4%">名称</td>
					<td width="16%">名称</td>
					<td width="16%">地址</td>
					<td width="16%">门票</td>
					<td width="16%">介绍</td>
					
					<td width="16%">操作</td>
		        </tr>	
				<c:forEach items="${jingdianList}" var="jingdian" varStatus="ss">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						 ${ss.index+1}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						 ${jingdian.name}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						 ${jingdian.dizhi}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						 ${jingdian.menpiao}
					</td>
					<td bgcolor="#FFFFFF" align="center">
					 ........
					</td>
					
					<td bgcolor="#FFFFFF" align="center">
						<a class="pn-loperator" href="<%=path %>/jingdianDel.action?id=${jingdian.id}">删除</a>
						<a class="pn-loperator" href="<%=path %>/jingdianPre.action?id=${jingdian.id}">编辑</a>
					</td>
				</tr>
				</c:forEach>
			</table>
			
		    
		    <div id="tip" style="position:absolute;display:none;border:0px;width:200px; height:200px;">
				<TABLE id="tipTable" border="0" bgcolor="#ffffee">
					<TR align="center">
						<TD><img id="photo" src="" height="190" width="290"></TD>
					</TR>
				</TABLE>
			</div>
	</body>
</html>
