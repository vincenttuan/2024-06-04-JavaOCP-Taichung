<%@page import="java.util.Arrays"%>
<%@page import="model.entity.Beverage"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% Beverage beverage = (Beverage)request.getAttribute("beverage");%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>飲料結帳單</title>
	</head>
	<body>
		<div>
			<fieldset>
				<legend>飲料結帳單</legend>
				姓名: <%=beverage.getUserName() %><p />
				電郵: <%=beverage.getEmail() %><p />
				日期: <%=beverage.getOrderDate() %><p />
				數量: <%=beverage.getAmount() %><p />
				品名: <%=beverage.getBeverageName() %><p />
				冰塊: <%=beverage.getIce() %><p />
				甜度: <%=beverage.getSugar() %><p />
				配料: <%=Arrays.toString(beverage.getAdditionalArray()) %><p />
				備註: <%=beverage.getMemo() %><p />
				----------------------<br>
				金額: <%=beverage.getTotalPrice() %><p />
			</fieldset>
			<a href="/JavaWeb/servlet/beverage" title="按我一下可以訂購飲料">回飲料訂購單</a>
		</div>
	</body>
</html>