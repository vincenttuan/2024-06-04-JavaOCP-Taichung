<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>顯示 BMI 結果頁面</title>
	</head>
	<body>
		BMI 計算結果: <%=request.getAttribute("bmi") %>
	</body>
</html>