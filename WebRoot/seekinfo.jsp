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
	</style>
  </head>
  
  <body>
	<div class="am-cf am-padding am-padding-bottom-0" style="border-top:1px solid red;border-left:1px solid red;border-bottom:1px solid red;border-radius:50px 0 0 0;">
		<div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">SUCCESS</strong> / <small><s:property value="user.Name"/> is in DB.Work in <s:property value="user.Company"/></small>
			<table class="d-block">
			  <tbody class="d-block">
			    <tr class="d-block">
			      <td class="d-block comment-body markdown-body  js-comment-body">
			          <p><code>简单的说呢，这个人不简单</code></p>
			          <p><code>叶落几春秋，花开又一年，著我绣夹裙，事事四五通，足下蹑丝履，头上玳瑁光，腰若流纨素，耳著明月当，指如削葱根，口如含珠丹，纤纤作细步，精妙世无双</code></p>
			      </td>
			    </tr>
			  </tbody>
			</table>
		</div>
	</div>
  </body>
</html>
