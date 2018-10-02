<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>UrHere</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="k1,k2,k3">
	<meta http-equiv="description" content="">
    <link rel="alternate icon" href="./img/kaduoxi.jpg" type="image/png" />
	<link rel="stylesheet" href="./css/amazeui.min.css"/>
  </head>
  
  <body>
	<div class="am-cf am-padding am-padding-bottom-0">
		<div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">404</strong> / <small>That’s an error</small></div>
	</div>
  </body>
</html>
