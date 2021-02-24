<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
	<link rel="stylesheet" type="text/css" href="../static/css/form.css">
	<script type="application/javascript" src="../static/js/jquery-3.5.1.min.js"></script>
	<script type="application/javascript">
		var flag = false;
		function checkCellphone() {
			var cellphone = $("#cellphone").val();
			var cellphoneRegx = /^1[0-9]{10}$/;
			if (cellphoneRegx.test(cellphone)) {

			}
		}
		function checkPassword() {

		}
		function checkEqual() {
			var password = $("#password").val();
			var confirm = $("#confirmPassword").val();
			console.log(password+"-"+confirm);
			if (password == confirm) {
				// 密码正确可以登录
				$("#confirmPasswordBTn").html("");
				$("#submitBtn").removeAttr("disabled");
			} else {
				$("#confirmPasswordBTn").innerHTML = "密码不正确";
			}
		}
	</script>
</head>
<body>
<div class="container">
	<div class="header">
		<h1>通讯录（登录）</h1>
	</div>
	<div class="section">
		<form action="book_login.jsp" method="post">
			<table>
				<tr>
					<td>
						<span style="color: red;">*</span>&nbsp;
						<label>手机号码：</label>
					</td>
					<td>
						<input type="text"  id="cellphone" name="cellphone" onblur="checkCellphone()" class="form-control"  placeholder="请填写你的手机号码" required>
					</td>
				</tr>
				<tr>
					<td style="text-align: right;">
						<span style="color: red;">*</span>&nbsp;
						<label>登录密码：</label>
					</td>
					<td>
						<input type="password"  id="password" name="password" class="form-control" onblur="checkPassword()"  placeholder="请填写你的登录密码" required>
					</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center">
						<span id="confirmPasswordBTn" style="color: red"></span>
					</td>
				</tr>
				<tr>
					<td style="text-align: right;">
						<span style="color: red;">*</span>&nbsp;
						<label>密码确认：</label>
					</td>
					<td>
						<input type="password"  id="confirmPassword" onblur="checkEqual()" name="confirmPassword" class="form-control"  placeholder="请填写确认你的登录密码" required>
					</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: right;">
						<button id="submitBtn" type="submit" disabled="disabled">注册</button>&nbsp;
					</td>
				</tr>
				<tr>
					<td>
						<a href="book_login_form.jsp">有账号登录</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
</body>
</html>
