<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CKEditor - WEB - WUXINCHENG</title>
<link href="<%=request.getContextPath()%>/assets/css/bootstrap.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/assets/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/assets/css/ya2dan.css" rel="stylesheet">

<script type="text/javascript" src="<%=request.getContextPath()%>/ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/ckfinder/ckfinder.js"></script>
<script type="text/javascript">
	window.onload = function() {
		var editor = CKEDITOR.replace('content');
		CKFinder.setupCKEditor(editor,'/ckeditor/');
	}
</script>
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="ya2dan-container tooltip-time">
			<button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
				<a class="brand" href="http://wuxincheng.com.cn" rel="tooltip" data-placement="bottom" title="新成工作室欢迎您">WUXINCHENG</a>
				<div class="nav-collapse collapse">
					<ul class="nav pull-left">
						<li class="active">
							<a href="#"><i class="icon-home icon-white"> </i> <b>首页</b></a>
						</li>
					</ul>
					<ul class="nav pull-right">
						<li>
							<a href="#"><i class="icon-user icon-white"> </i> 登录</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="ya2dan-container">
		<form id="form1" name="form1" method="post" action="<%=request.getContextPath()%>/ckeditor/domain">  
			<table align="center">  
			    <tr>
			        <td>
			        	<textarea id="content" name="content"></textarea>
			        </td>  
			    </tr>
			    <tr height="50px">
			        <td>
				        <input type="submit" name="Submit" value="提交" class="btn" /> 
				        <input type="reset" name="Reset" value="重置" class="btn" />
			        </td>  
			    </tr>
			</table>
		</form>
	</div>
	
</body>
</html>