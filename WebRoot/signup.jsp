<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta http-equiv="content-type" content="text/html;charset=utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
		<link rel="shortcut icon" href="./img/cn_searchbt_hp.png" type="image/x-icon" />
		<title>SeekU,WhereverUare</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="none,NV,No">
		<meta http-equiv="description" content="This is my generation">
		<link rel="stylesheet" href="./css/login.css"/>
		<link rel="stylesheet" href="./css/bootstrap.css?v=1.4.3">
	</head>
<body>
	<div class="login-mark" style="display: block;"></div>
	<div class="main" style="background:url('<%=basePath%>img/login-bg.png')">
      <div class="container container-custom">
        <div class="row wrap-login">
            <div class="login-part">
                  <h3><em class="login-title js_login_title">扫码登录</em><a href="javascript:void(0);" class="login-code__open js_login_trigger login-user__active">账号登录</a></h3>
                  <div class="code-content code-login">
                      <div class="code-pic">
                        <div id="wxqr" class="wxqr">
                        	<iframe id="iframe_id" src=""></iframe>
                        </div>
                      </div>
                      <span class="code-text js_code_text">微信登录</span>
                      <div class="code-support">
                          <div class="line"></div>
                          <div class="third-part tracking-ad" data-mod="popu_27">
                              <span style="width: 257px;">第三方帐号登录</span>
		                      <span>
		                      	<font color="red"></font>
		                      </span>
                              <div class="register-now js_register_text">
                                  <span>还没有SEEK帐号？</span>
                                  <a href="" class="js_enter__register" target="_blank">立即注册</a>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
        </div>
      </div>
</body>
</html>