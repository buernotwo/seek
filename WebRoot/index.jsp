<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
		<style type="text/css">
			*{
			   	margin:0;padding:0;list-style: none;text-decoration: none;
			}
			#logo{
			    float: left;margin:-5px 5px 0 0;
			}
			form{
			    background: white;float: left;
			}
			#search-input{
			    border:1px solid red;font-size:10px;position:absolute;padding-left:70px;outline:none;width:520px;height:40px;line-height:40px;float:left;border:1px solid #000;
			}
			#search-button{
			    border:1px solid #000;margin:0px;position:absolute;background-image:url("./img/cn_searchbt_hp.png");background-repeat:no-repeat;width:50px;height:42px;float: left;
			}
			#wrapper{
			    position:absolute;top:145px;left:100px;
			}
			#spliteline{
				posotion:absolute;margin-top:250px;left:300px;border:1px solid #000;
			}
			#content1{
				border-left:1px solid #000;padding:10 0 0 10;font-size:12px;line-height:20px;posotion: absolute;margin-top:20px;margin-left:100px;left:20px;width:180px;height:80px;
			}
			#content2{
				border-left:1px solid #000;padding:10 0 0 10;font-size:12px;posotion:absolute;line-height:20px;margin-top:10px;margin-left:100px;left:230px;width:180px;height:340px;
			}
			#content3{
				border-left:1px solid #000;padding:10 0 0 10;font-size:12px;posotion:absolute;line-height:20px;margin-top:-350px;margin-left:300px;left:270px;width:200px;height:80px;
			}
			#content4{
				border-left:1px solid #000;padding:10 0 0 10;font-size:12px;posotion:absolute;line-height:20px;margin-top:10px;margin-left:300px;left:270px;width:200px;height:80px;
			}
			#content5{
				border-left:1px solid #000;padding:10 0 0 10;font-size:12px;posotion:absolute;line-height:20px;margin-top:10px;margin-left:300px;left:270px;width:230px;height:80px;
			}
			#seek{
				position:absolute;margin:0;padding:0;margin-top:-225px;margin-left:110px;
			}
			#seek:hover{
				background:#708090;color:#3385ff;cursor:pointer;
			}
			#seek p{
				position:absolute;font-size:26px;font-family:"PingFang SC", "Helvetica Neue", "Hiragino Sans GB", "Microsoft YaHei", "微软雅黑", Helvetica, Arial, Verdana, sans-serif;;
			}
			#content1:hover{
				background:#708090;color:white;cursor:pointer;
			}
			#content2:hover{
				background:#708090;color:white;cursor:pointer;
			}
			#content3:hover{
				background:#708090;color:white;cursor:pointer;
			}
			#content4:hover{
				background:#708090;color:white;cursor:pointer;
			}
			#content5:hover{
				background:#708090;color:white;cursor:pointer;
			}
			#spliteleftright{
				position:absolute;float:right;border:1px solid red;width:100px;
			}
		</style>
	</head>
	<body background="./img/body.png">
			<div id="spliteleftright">
				<!-- 左右分割 -->
			</div>
			<div id="seek"><p style="border-left:5px solid #000;font-size:28px;">你</p><p style="border-left:5px solid #000;margin-left:40px;font-size:30px;">是谁？</p></div>
			<div id="wrapper">
				<div id="logo">
					<form action="QueryInfo.action" target="_self" method="post">
						<input type="text" id="search-input" name="q" placeholder="重要的人，不想忘记的人，绝对不能忘的人，就算我不记得你的名字，我也会一直一直拼命的寻找你↲" autocomplete="off">
						<input type="submit" id="search-button" value="">
					</form>
				</div>
			</div>
			<div id="spliteline"></div>
			<div id="content1">只要记住你的名字<br>
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
你，是谁？</div>

</html>