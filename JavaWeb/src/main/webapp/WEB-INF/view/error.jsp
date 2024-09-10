<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>錯誤頁面處理</title>
	</head>
	<body>
		錯誤訊息: <%=request.getAttribute("errorMessage") %>
	</body>
</html>