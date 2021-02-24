<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>Title</title>
		<!-- http://localhost:8080/ums/user/login -->
		<link rel="stylesheet" type="text/css" href="../static/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="../static/css/font-awesome.min.css">
		<link rel="stylesheet" type="text/css" href="../static/css/AdminLTE.min.css">
		<script type="application/javascript" src="../static/js/jquery-3.5.1.min.js"></script>
		<script type="application/javascript" src="../static/js/bootstrap.min.js"></script>
	</head>
	<body class="hold-transition login-page">
		<div class="login-box">
			<div class="login-logo">
				<a href="login"><b>UMS 信息管理平台</b></a>
			</div>
			<div class="login-box-body">
				<p class="login-box-msg">登录 UMS 信息管理平台</p>

				<form action="login" method="post">
					<div class="form-group has-feedback">
						<input type="text" class="form-control" placeholder="请填写您的手机号码">
						<span class="glyphicon glyphicon-phone form-control-feedback"></span>
					</div>
					<div class="form-group has-feedback">
						<input type="password" class="form-control" placeholder="请填写您的登录密码">
						<span class="glyphicon glyphicon-lock form-control-feedback"></span>
					</div>
					<div class="row">
						<div class="col-xs-8">
							<div class="checkbox icheck"></div>
						</div>
						<div class="col-xs-4">
							<button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
						</div>
					</div>
				</form>

				<div class="social-auth-links text-center">
					<p>- OR -</p>
					<a href="register" class="btn btn-block btn-social btn-facebook btn-flat">
						<i class="fa fa-plus-square"></i>
						还没有账号？注册新用户...
					</a>
				</div>
			</div>
		</div>
	</body>
</html>
