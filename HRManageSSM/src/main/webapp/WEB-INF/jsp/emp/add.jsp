<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/emp/add.action" method="post">
		<table border="1" width="600" style="text-align: center;">	
		<tr>
			<td>员工姓名：</td>
			<td><input type="text" name="ename"></td>
		</tr>
			
		<tr>
			<td>员工性别：</td>
			<td>
				<input type="radio" name="egender" value="1">男
				<input type="radio" name="egender" value="0">女
			</td>
		</tr>
		<tr>
			<td>部门编号：</td>
			<td>
				<select name="dept.deptId">
					<c:forEach items="${deptlist }" var="dept">
						<option value="${dept.deptId }">${dept.dname }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="6">
				<input type="submit"  value="提交">
			</td>
		</tr>

	</table>
	</form>
</body>
</html>