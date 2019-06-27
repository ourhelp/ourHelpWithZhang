<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page deferredSyntaxAllowedAsLiteral="true"%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.request.contextPath}/"/>
<title></title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="Css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="Css/bootstrap-responsive.css" />
<link rel="stylesheet" type="text/css" href="Css/style.css" />
<script type="text/javascript" src="Js/jquery.js"></script>
<script type="text/javascript" src="Js/bootstrap.js"></script>
<script type="text/javascript" src="Js/ckform.js"></script>
<script type="text/javascript" src="Js/common.js"></script>
<link href="assets/layui/css/layui.css" rel="stylesheet" />
<style type="text/css">
body {
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) {
	/* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>
</head>
<body>
		<form class="layui-form" action="">
			<div id="layui-xtree-demo1" style="width:300px;height:500px; border:1px solid black; margin:20px;"></div>

			<input type="button" value="提交" id="btn_getCk" />

		</form>
	</body>

</html>
<!--引入你自己的layui文件-->
<script src="assets/layui/layui.js"></script>
<!--xtree的js文件-->
<script src="assets/layui-xtree/layui-xtree.js"></script>
<script type="text/javascript">

</script>
