<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
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
		<link rel="stylesheet" href="./css/index.css"/>
		<link rel="stylesheet" href="./css/dialog.css">
		<script src="./js/zepto.min.js"></script>
		<script src="./js/dialog.js"></script>
	</head>
	<body background="./img/body.png" oncontextmenu="return false" ondragstart="return false" onselectstart ="return false" oncopy="document.selection.empty()" onbeforecopy="return false">
			<!-- <div id="spliteleftright"></div> -->
			<!-- <div id="seek"><p style="border-left:5px solid #000;font-size:28px;">你</p><p style="border-left:5px solid #000;margin-left:40px;font-size:30px;">是谁？</p></div> -->
			<s:if test="SWord.SensitiveWordSize>0">
			<div id="OutsideSWDiv">
				<div id="SensitiveWordDiv">
		      	    <p><code>很抱歉，您的搜索内容中带有敏感政治倾向（或反执政党倾向）、暴力倾向、不健康色彩的词或不文明语，请您重新输入</code></p>
			        <p><code>敏感词个数：<s:property value="SWord.SensitiveWordSize"/></code></p>
			        <p><code>敏感词：<s:property value="SWord.SensitiveWordSet"/></code></p>
			        <p><code>过滤后字符串：<s:property value="SWord.OutString"/></code></p>
		        </div>
	        </div>
	        </s:if>
	        <s:elseif test="SWord.SensitiveWordSize==0">
	        <div id="OutsideSWDiv">
				<div id="SensitiveWordDiv">
	                <p><code>连接服务器失败...</code></p>
	                <p><code>可能原因：运气不好；数据库中无您想要的数据；服务器数据对你进行了隔离；服务器今天在维修中；由于网站火爆，您被挤出来了；ERR_SERVER_DISCONNECTED</code></p>
	            </div>
	        </div>
			</s:elseif>
			<div id="wrapper">
				<div id="logo">
					<form id="formID" action="seek.acc" target="_self" method="post">
						<input type="text" id="search-input" name="SeekString" placeholder="To Seek You Wherever You are↲" autocomplete="off" onkeydown="if(event.keyCode==13) {return false;}">
						<input type="button" id="search-button" value="">
					</form>
				</div>
			</div>
			<!-- <div id="spliteline"></div> -->
			<!-- <div id="content1">只要记住你的名字<br>
							不管你在世界的哪个地方<br>
							我一定会，去见你。</div>
			<div id="content2">清晨 醒来的时候 <br>
							不知道自己为什么会哭 <br>
							时常会有这样的情况 <br>
							做过的梦总回想不起 <br>
							只是 <br>
							只是 <br>
							一种有什么要消失的丧失感 <br>
							即使醒来后 也一直存在 <br>
							我一直在寻找 寻找着某个人 <br>
							陷入这种情绪 <br>
							应该是从那天开始的<br> 
							那天 彗星划过天空的那天<br> 
							那就像 <br>
							就像梦幻一般的景色一般<br> 
							那真是 无与伦比 <br>
							美到极致的景色</div>
			<div id="content3">假如我们相遇，<br>
							肯定一眼就能认出彼此</div>
			<div id="content4">不管你在世界的哪个地方，<br>
							我一定会，<br>
							再次去见你的。</div>
			<div id="content5">重要的人，不能忘记的人，不想忘记的人。 <br>
							你，是谁？</div> -->
			<script type="text/javascript">
				$('#search-button').click(function(){
				    var infoDialog = $.dialog({
				        type : 'tips',
				        infoText : 'Seeking…',
				        infoIcon : './img/loading.gif',
				        autoClose : 500,
				        onClosed : function(){
				        	if((document.getElementById("search-input").value == "") || 
				        	(document.getElementById("search-input").value == null))
           					{
           						alert('Input content can not be empty.');
       						}else{
	       						document.getElementById("formID").submit();
       						}
       					}
				    });
				    /*window.setTimeout(function() {
				        infoDialog.dialog.update({
					        autoClose : 2500,
					        infoText : '当前功能维护中,暂时关闭'
				        });
				    }, 1500);*/
				});
			</script>

</html>