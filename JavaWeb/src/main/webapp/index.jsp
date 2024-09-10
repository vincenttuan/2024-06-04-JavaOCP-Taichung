<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>My WebPage</title>
	</head>
	<body>
		現在時刻: <%=new Date() %>
		<hr />
		<form method="get" action="/JavaWeb/servlet/bmi">
			<fieldset>
				<legend>BMI 計算</legend>
				身高: <input type="number" name="h" placeholder="請輸入身高" required><p />
				體重: <input type="number" name="w" placeholder="請輸入體重" required><p />
				<button type="reset">重置</button>
				<button type="submit">送出</button>
			</fieldset>
		</form>
		<hr />
	</body>
</html>