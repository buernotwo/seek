<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
	#wrapper{
		position: relative;
	}
	#logo{
		position: absolute;
		top: 0;
		bottom: 0;
		left: 0;
		right: 0;
		width: 50%;
		height: 30%;
		margin: 50px auto;
	}
	</style>
  </head>
  
  <body style="background:url('<%=basePath%>img/body.png');" oncontextmenu="return false" ondragstart="return false" onselect="document.selection.empty()" onselectstart ="return false" oncopy="document.selection.empty()" onbeforecopy="return false">
   	<div id="wrapper">
		<div id="logo">
			<div class="am-cf am-padding am-padding-bottom-0">
				<div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">404</strong> / <small>No info in DB.</small>
					<table class="d-block">
					  <tbody class="d-block">
					    <tr class="d-block">
					      <td class="d-block comment-body markdown-body  js-comment-body">
					          <p><code>连接服务器失败...</code></p>
						      <p><code>可能原因：运气不好；服务器数据对你进行了隔离；服务器今天在维修中；由于网站火爆，您被挤出来了；ERR_SERVER_DISCONNECTED</code></p>
					      </td>
					    </tr>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!--  
	<div class="widget widget_ui_comments"> <span class="icon"><i class="fa fa-pencil-square-o"></i></span><h3> 最新评论</h3> <ul> 
		<li><a href="./img/kaduoxi.jpg" title="1"><img class="avatar avatar-50 photo avatar-default" height="50" width="50" src="./img/kaduoxi.jpg"> <strong>Tisawudii</strong> 12小时前 说<br />这个网站还挺冷清的哈</a></li >
	</ul> </div>
	-->
  </body>
</html>
