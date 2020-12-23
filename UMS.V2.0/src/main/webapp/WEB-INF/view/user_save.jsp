<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>11</title>
	<script type="application/javascript" src="../static/js/jquery-3.5.1.min.js"></script>
	<script type="application/javascript">
		function save() {
			var fromData = $("#saveForm").serialize();
			$.ajax({
				url:"save",
				type:"post",
				data:fromData,
				dataType:"json",
				success: function (data) {
					alert(data);
				}
			});
		}
	</script>
</head>
<body>
<form id="saveForm">
	<table>
		<tr>
			<td style="text-align: right">
				<label>用户姓名：</label>
			</td>
			<td>
				<input type="text" id="name" name="name" style="width: 300px;" placeholder="请输入你的姓名"/>
			</td>

		</tr>
		<tr>
			<td style="text-align: right">
				<label>手机号码：</label>
			</td>
			<td>
				<input type="text" id="cellphone" name="cellphone" style="width: 300px;" placeholder="请输入你的手机号码"/>
			</td>

		</tr>
		<tr>
			<td colspan="2" style="text-align: right">
				<button type="button" onclick="save()">保存</button>
			</td>
		</tr>
	</table>
</form>
</body>
</html>