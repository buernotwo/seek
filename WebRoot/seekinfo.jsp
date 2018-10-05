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
    
    <title>DetailInfo</title>
    
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
	<div class="am-cf am-padding am-padding-bottom-0" style="border-top:1px solid red;border-left:1px solid red;border-bottom:1px solid red;border-radius:50px 0 0 0;">
		<div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">SUCCESS</strong> / <small><s:property value="user.Name"/> is in DB.Work in <s:property value="user.Company"/></small>
			<table class="d-block">
			  <tbody class="d-block">
			    <tr class="d-block">
			      <td class="d-block comment-body markdown-body  js-comment-body">
			          <p><code>IDCard:<s:property value="user.IDCard"/></code></p>
			          <p><code>Nationality:<s:property value="user.Nationality"/></code></p>
			          <p><code>PostXXs:<s:property value="user.PostXXs"/></code></p>
			          <p><code>Age:<s:property value="user.Age"/></code></p>
			          <p><code>Name:<s:property value="user.Name"/></code></p>
			          <p><code>NickName:<s:property value="user.NickName"/></code></p>
			          <p><code>Sex:<s:property value="user.Sex"/></code></p>
			          <p><code>HomeTown:<s:property value="user.HomeTown"/></code></p>
			          <p><code>PhoneNumber:<s:property value="user.PhoneNumber"/></code></p>
			          <p><code>Email:<s:property value="user.Email"/></code></p>
			          <p><code>Company:<s:property value="user.Company"/></code></p>
			          <p><code>Home:<s:property value="user.Home"/></code></p>
			          <p><code>CompanyIDCard:<s:property value="user.CompanyIDCard"/></code></p>
			          <p><code>PrimarySchool:<s:property value="user.PrimarySchool"/></code></p>
			          <p><code>MiddleSchool:<s:property value="user.MiddleSchool"/></code></p>
			          <p><code>College:<s:property value="user.College"/></code></p>
			          <p><code>Hobbies:<s:property value="user.Hobbies"/></code></p>
			          <p><code>HomeMembers:<s:property value="user.HomeMembers"/></code></p>
			          <p><code>ConnectInfo:<s:property value="user.ConnectInfo"/></code></p>
			          <p><code>SocialAccount:<s:property value="user.SocialAccount"/></code></p>
			          <p><code>UniformPwd:<s:property value="user.UniformPwd"/></code></p>
			          <p><code>Description:<s:property value="user.Description"/></code></p>
			          <s:iterator value="imageList" status="li">
						  <p><code>ImageID:<s:property value="ImageID"/></code></p>
						  <p><code>IDCard:<s:property value="IDCard"/></code></p>
						  <p><code>Image:<s:property value="Image"/></code></p>
					  </s:iterator>
			      </td>
			    </tr>
			  </tbody>
			</table>
		</div>
	</div>
  </body>
</html>
