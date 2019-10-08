<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <style type="text/css">
        .Header {background: url(<%=path %>/img/banner.jpg) #008000 repeat-x left top; height: 250px;width: 966px;}
        .HeaderTop {margin: 0px auto;}
    </style>
     <script type="text/javascript">
            function myXinxi()
	        {
	            <s:if test="#session.user==null">
	                  alert("请先登录");
	            </s:if>
	            
	            <s:else>
	                var url="<%=path %>/qiantai/userinfo/userXinxi.jsp";
	                var n="";
	                var w="480px";
	                var h="500px";
	                var s="resizable:no;help:no;status:no;scroll:yes";
				    openWin(url,n,w,h,s);
	            </s:else>
	        }
	        
	        
	        function reg()
	        {
	                var url="<%=path %>/qiantai/userinfo/userReg.jsp";
	                var n="";
	                var w="480px";
	                var h="500px";
	                var s="resizable:no;help:no;status:no;scroll:yes";
				    openWin(url,n,w,h,s);
	        }
     </script>
  </head>
  
  <body>
        <div class="Header HeaderTop">
			<br/>
			<font style="font-size: 40px;color: white;font-weight: bolder;display: block;text-align: center;"></font>
		</div>
<div class="topmenu cbody1">
			<ul>
				<li class="thisclass">
					<A href="<%=path %>/qiantai/default.jsp" style="font-family: 楷体;font-size: 17px;">网站首页</A>
				</li>
				<li class="thisclass">
					<A href="<%=path %>/jingdianAll.action" style="font-family: 楷体;font-size: 17px;">旅游景点</A>
				</li>
				<li class="thisclass">
					<A href="<%=path %>/xianluAll.action" style="font-family: 楷体;font-size: 17px;">旅游线路</A>
				</li>
				<li class="thisclass">
					<A href="<%=path %>/liuyanAll.action" style="font-family: 楷体;font-size: 17px;">留言板</A>
				</li>
				<li class="thisclass">
					<A href="<%=path %>/jiudianAll.action" style="font-family: 楷体;font-size: 17px;">酒店信息</A>
				</li>
				<li class="thisclass">
					<A href="#"  onclick="reg()" style="font-family: 楷体;font-size: 17px;">免费注册</A>
				</li>
				<li class="thisclass">
					<A href="#" onclick="myXinxi()" style="font-family: 楷体;font-size: 17px;">我的信息</A>
				</li>
			</ul>
		</div>
		<form id="searchForm" action="<%=path %>/jingdianSearch.action" method="post">
			<div class="topsearch">
				<div class="title"></div>
				<div id="page_search_left">
					<input class="inputText" size="16" onkeypress="if(event.keyCode==13){searchFormSubmit();return false;}" name="name" type="text" />
				</div>
				<div id="page_search_btn">
					<input type="submit" value="搜索">
				</div>
				<div style="clear: both"></div><!--清除左右两边的浮动 -->
			</div>
		</form>
  </body>
</html>
