<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>員工註冊</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		<link rel="stylesheet" href="/css/buttons.css">
	</head>
	<body>
		<!-- menu bar include -->
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		
		<!-- body content -->
		<div style="padding: 15px">
			<!-- 員工註冊 -->
			<form class="pure-form" method="post" action="/employee/register">
			    登入帳號: <input name="username" required="required" /> <p />
			    登入密碼: <input name="password" required="required" /> <p />
			    員工薪資: <input name="salaryAmount" value="55000" min="45000" max="1000000" /> <p />
			    到職日期: <input name="arrivalDate" type="date" required="required" /> <p />
			    特休天數: <input name="annualLeave" type="number" value="7" min="0" max="30" /> <p />
			    <button type="submit">新增</button>
			</form>
		</div>
	</body>
</html>