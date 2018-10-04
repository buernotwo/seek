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
	<style type="text/css">
	.markdown-body {
	    font-family: -apple-system,BlinkMacSystemFont,"Segoe UI",Helvetica,Arial,sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol";
	    font-size: 16px;
	    line-height: 1.5;
	    word-wrap: break-word;
	}
	.markdown-body code, .markdown-body p{
	    padding: 0.2em 0.4em;
	    margin: 0;
	    font-size: 85%;
	    background-color: rgba(27,31,35,0.05);
	    border-radius: 3px;
    	font-family: "SFMono-Regular",Consolas,"Liberation Mono",Menlo,Courier,monospace;
	}
	</style>
  </head>
  
  <body background="./img/body.png">
	<div class="am-cf am-padding am-padding-bottom-0" style="border-bottom:1px solid red;border-top:1px solid red;border-radius:50px 0 0 0;">
		<div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">404</strong> / <small>No info in DB.</small>
			<table class="d-block">
			  <tbody class="d-block">
			    <tr class="d-block">
			      <td class="d-block comment-body markdown-body  js-comment-body">
			          <p><code>连接服务器失败</code></p>
			          <p><code>请试试以下办法：
							     检查网线、调制解调器和路由器;
							     重新连接到 Wi-Fi 网络;
							     运行 Windows 网络诊断;
							   ERR_INTERNET_DISCONNECTED</code></p>
			      </td>
			    </tr>
			  </tbody>
			</table>
		</div>
	</div>
	<!--  
	<div class="widget widget_ui_comments"> <span class="icon"><i class="fa fa-pencil-square-o"></i></span><h3> 最新评论</h3> <ul> 
		<li><a href="./img/kaduoxi.jpg" title="1"><img class="avatar avatar-50 photo avatar-default" height="50" width="50" src="./img/kaduoxi.jpg"> <strong>Tisawudii</strong> 12小时前 说<br />这个网站还挺冷清的哈</a></li >
	</ul> </div>
	-->
  </body>
</html>
