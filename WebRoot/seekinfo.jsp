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
	<script src="./js/jquery-1.8.0.min.js"></script>
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
		margin: 30px auto;
	}
	.dingzhi-p p{
		width:200px;
	}
	.dingzhi-img img{
	    border-radius:10px;
	    margin:10px 10px 10px 10px;
		width:200px;
		height:200px;
		float:left;
		transition: all 0.6s;
	}
	.dingzhi-img img:hover{
		transform: scale(1.4);
		cursor:pointer;
	}
	</style>
  </head>
  
  <body style="background:url('<%=basePath%>img/body.png');" oncontextmenu="return false" ondragstart="return false" onselect="document.selection.empty()" onselectstart ="return false" oncopy="document.selection.empty()" onbeforecopy="return false">
  	<div id="wrapper">
		<div id="logo">
			<div class="am-cf am-padding am-padding-bottom-0" style="margin-bottom:10px;border-bottom:1px solid #000;border-top:2px solid #000;border-radius:50px 0 0 0;">
				<div class="am-fl am-cf"><!-- <strong class="am-text-primary am-text-lg">SUCCESS</strong> / <small style='font-family: -apple-system,BlinkMacSystemFont,"Segoe UI",Helvetica,Arial,sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol";'><s:property value="user.Name"/> is in DB.Work in <s:property value="user.Company"/></small>-->
					<table class="d-block">
					  <tbody class="d-block">
					    <tr class="d-block">
					      <td class="d-block comment-body markdown-body  js-comment-body dingzhi-p">
					          <p><code>IDCard：<s:property value="user.IDCard"/></code></p>
					          <p><code>Nationality：<s:property value="user.Nationality"/></code></p>
					          <p><code>PostXXs：<s:property value="user.PostXXs"/></code></p>
					          <p><code>Age：<s:property value="user.Age"/></code></p>
					          <p><code>Name：<s:property value="user.Name"/></code></p>
					          <p><code>NickName：<s:property value="user.NickName"/></code></p>
					          <p><code>Sex：<s:property value="user.Sex"/></code></p>
					          <p><code>HomeTown：<s:property value="user.HomeTown"/></code></p>
					          <p><code>PhoneNumber：<s:property value="user.PhoneNumber"/></code></p>
					          <p><code>Email：<s:property value="user.Email"/></code></p>
					          <p><code>Company：<s:property value="user.Company"/></code></p>
					          <p><code>Home：<s:property value="user.Home"/></code></p>
					          <p><code>CompanyIDCard：<s:property value="user.CompanyIDCard"/></code></p>
					          <p><code>PrimarySchool：<s:property value="user.PrimarySchool"/></code></p>
					          <p><code>MiddleSchool：<s:property value="user.MiddleSchool"/></code></p>
					          <p><code>College：<s:property value="user.College"/></code></p>
					          <p><code>Hobbies：<s:property value="user.Hobbies"/></code></p>
					          <p><code>HomeMembers：<s:property value="user.HomeMembers"/></code></p>
					          <p><code>ConnectInfo：<s:property value="user.ConnectInfo"/></code></p>
					          <p><code>SocialAccount：<s:property value="user.SocialAccount"/></code></p>
					          <p><code>UniformPwd：<s:property value="user.UniformPwd"/></code></p>
					          <p><code>Description：<s:property value="user.Description"/></code></p>
					          <s:iterator value="imageList" status="li">
								  <p><code>ImageID：<s:property value="ImageID"/></code></p>
								  <p><code>IDCard：<s:property value="IDCard"/></code></p>
								  <p><code>Image：<s:property value="Image"/></code></p>
							  </s:iterator>
					      </td>
					      <td class="d-block comment-body markdown-body  js-comment-body dingzhi-img" style="float:left;">
					      	  <img class="pimg" src="<%=basePath%>img/test/001.jpg"/>
					      	  <img class="pimg" src="<%=basePath%>img/test/002.jpg"/>
					      	  <img class="pimg" src="<%=basePath%>img/test/003.jpg"/>
					      	  <img class="pimg" src="<%=basePath%>img/test/004.jpg"/>
					      	  <img class="pimg" src="<%=basePath%>img/test/005.jpg"/>
					      	  <img class="pimg" src="<%=basePath%>img/test/006.jpg"/>
					      </td>
					    </tr>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<div id="outerdiv" style="position:fixed;top:0;left:0;background:rgba(0,0,0,0.7);z-index:2;width:100%;height:100%;display:none;">      
		<div id="innerdiv" style="position:absolute;">          
			<img id="bigimg" style="border:5px solid #fff;" src=""/>      
		</div>
	</div>
	<script type="text/javascript">
	$(function(){          
		$(".pimg").click(function(){              
			var _this = $(this);//将当前的pimg元素作为_this传入函数              
			imgShow("#outerdiv", "#innerdiv", "#bigimg", _this);          
		});      
	});       
	function imgShow(outerdiv, innerdiv, bigimg, _this){          
		var src = _this.attr("src");//获取当前点击的pimg元素中的src属性          
		$(bigimg).attr("src", src);//设置#bigimg元素的src属性                    
		/*获取当前点击图片的真实大小，并显示弹出层及大图*/          
		$("<img/>").attr("src", src).load(function(){              
			var windowW = $(window).width();//获取当前窗口宽度              
			var windowH = $(window).height();//获取当前窗口高度              
			var realWidth = this.width;//获取图片真实宽度              
			var realHeight = this.height;//获取图片真实高度              
			var imgWidth, imgHeight;              
			var scale = 0.8;//缩放尺寸，当图片真实宽度和高度大于窗口宽度和高度时进行缩放                            
			if(realHeight>windowH*scale) {//判断图片高度                  
				imgHeight = windowH*scale;//如大于窗口高度，图片高度进行缩放                  
				imgWidth = imgHeight/realHeight*realWidth;//等比例缩放宽度                  
				if(imgWidth>windowW*scale) {//如宽度扔大于窗口宽度                      
					imgWidth = windowW*scale;//再对宽度进行缩放                  
				}              
			} else if(realWidth>windowW*scale) {//如图片高度合适，判断图片宽度                  
				imgWidth = windowW*scale;//如大于窗口宽度，图片宽度进行缩放                              
				imgHeight = imgWidth/realWidth*realHeight;//等比例缩放高度              
			} else {//如果图片真实高度和宽度都符合要求，高宽不变                  
				imgWidth = realWidth;                  
				imgHeight = realHeight;              
			}                      
			$(bigimg).css("width",imgWidth);//以最终的宽度对图片缩放                            
			var w = (windowW-imgWidth)/2;//计算图片与窗口左边距              
			var h = (windowH-imgHeight)/2;//计算图片与窗口上边距              
			$(innerdiv).css({"top":h, "left":w});//设置#innerdiv的top和left属性              
			$(outerdiv).fadeIn("fast");//淡入显示#outerdiv及.pimg          
		});                    
		$(outerdiv).click(function(){//再次点击淡出消失弹出层              
			$(this).fadeOut("fast");          
		});      
	}
	</script>
  </body>
</html>
