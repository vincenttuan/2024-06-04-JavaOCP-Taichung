<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>員工薪資維護</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		<link rel="stylesheet" href="/css/buttons.css">
	</head>
	<body>
		<!-- menu bar include -->
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		
		<!-- body content -->
		<div style="padding: 15px">
			<!-- 員工薪資維護 -->
			<form class="pure-form" method="post" action="/employee/salary">
				<fieldset>
					<legend>員工薪資維護</legend>
					員工編號: ${employeeDTO.id}<p />
					員工姓名: ${employeeDTO.username}<p />
					員工薪資: <input type="number" name="amount" value="${employeeDTO.salary.amount}" /><p />
					<button type="submit">修改</button>
				</fieldset>
			</form>
		</div>
	</body>
</html>