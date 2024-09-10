<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>顯示 BMI 結果頁面</title>
	</head>
	<body>
		<fieldset>
			<legend>計算結果</legend>
			BMI: <%=request.getAttribute("bmi") %><p />
			<a href="/JavaWeb/index.jsp">回首頁</a>
		</fieldset>
	</body>
</html>