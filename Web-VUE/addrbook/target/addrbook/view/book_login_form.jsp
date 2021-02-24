<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>Title</title>
		<link rel="stylesheet" type="text/css" href="../static/css/form.css">
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
								<input type="text"  id="cellphone" name="cellphone" class="form-control"  placeholder="请填写你的手机号码" required>
							</td>
						</tr>
						<tr>
							<td style="text-align: right;">
								<span style="color: red;">*</span>&nbsp;
								<label>登录密码：</label>
							</td>
							<td>
								<input type="password"  id="password" name="password" class="form-control"  placeholder="请填写你的登录密码" required>
							</td>
						</tr>
						<tr>
							<td colspan="2" style="text-align: right;">
								<button type="submit">登录</button>&nbsp;
							</td>
						</tr>
						<tr>
							<td>
								<a href="book_registry_form.jsp">注册</a>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</body>
</html>
