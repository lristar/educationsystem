<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${empty employee?'添加':'修改'}页面</title>
<script type="text/javascript" src="../../../js/jquery.min.js"></script>
</head>
<body>
	<form action="/employee/saveOrUpload.do" method="post">
		<table>
			<tr>
				<td><input type="hidden" name="id" value="${employee.id}" /></td>
			</tr>
			<tr>
				<td>用户名：<input type="text" name="username"
					value="${employee.username}" />
				</td>
			</tr>
			<tr>
				<td><input type="hidden" name="password"
					value="${employee.password}" /></td>
			</tr>
			<tr>
				<td>邮&emsp;箱：<input type="text" name="email"
					value="${employee.email}" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="checkbox" id="admain" name="admain"/> 
					
					<c:choose>
						<c:when test="${employee.admain}">
							<script type="text/javascript">
						/* 	prop函数是添加属性checked=true */
						/* $("#admain").prop("checked", true); */
							$("#admain").attr("checked", true);
							</script>
						</c:when>
					</c:choose>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="${empty employee?'添加':'修改'}" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>