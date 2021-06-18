<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户登录</title>
</head>
<body>
<form name ="dataForm" id="dataForm" action="loginSuccess.jsp" method="get">
	<table border="0" cellspacing="5" cellpadding="0" align="center">
		<tr><td align="center" colspan="2" style="text-align:center;" >用户登录</td></tr>
		<tr>
			<td>用户名</td>
			<td><input type="text" name="username" value="123"/></td>
            <td><input type="text" name="username" value="123"/></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="password" name="password" value="123"/></td>
		</tr>
		<tr>
			<td style="text-align:center;" colspan="2">				
				<button type="submit" name="save">登录</button>
			</td>
		</tr>
	</table>
</form>
</body>
</html>
