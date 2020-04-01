<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理页面</title>
<script type="text/javascript">
	function submitForm(pageNum){
		document.getElementById("currentPage").value=pageNum;
		document.forms[0].submit();
	}
</script>
</head>
<body>
	欢迎：${EMP_IN_SESSION.username} <a href="/loginOut.do">退出</a>
	<p><a href="/employee/save.do">添加</a></p>
	<form action="/employee/findAll.do" method="post">
		姓名/邮箱：<input type="text" name="str" value="${qo.str}" placeholder="请输入姓名或邮箱"/>
		<input type="submit" value="search"/>
		<table cellpadding="0" cellspacing="0" style="text-align:center">
			<thead>
				<tr>
					<td>编号</td>
					<td>用户名</td>
					<td>邮箱</td>
					<td>管理员</td>
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="emp" items="${result.listDate}"> 
					<tr>
						<td>${emp.id}</td>
						<td>${emp.username}</td>
						<td>${emp.email}</td>
						<td>${emp.admain}</td>
						<td>
							<a href="/employee/delete.do?id=${emp.id}">删除</a>
							<a href="/employee/update.do?id=${emp.id}">修改</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="5">
						<a href="javascript:submitForm(1)">首页</a>
						<a href="javascript:submitForm(${result.prevPage})">上一页</a>
						<a href="javascript:submitForm(${result.nextPage})">下一页</a>
						<a href="javascript:submitForm(${result.totalPage})">尾页</a>
						总共${result.totalPage}页
						一共有${result.totalCount}条数据
						每页显示
						<select name="pageSize">
							<option ${result.pageSize==3?'selected':''}>3</option>
							<option ${result.pageSize==5?'selected':''}>5</option>
							<option ${result.pageSize==7?'selected':''}>7</option>
						</select>
						条数据
						<input type="text" name="currentPage" id="currentPage" value="${result.currentPage}"/>跳转
						<input type="submit" value="GO"/>
					</td>
				</tr>
			</tfoot>
		</table>
	</form>
</body>
</html>

