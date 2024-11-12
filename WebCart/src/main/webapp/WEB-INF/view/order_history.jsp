<%@ page import="model.dto.UserDto"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>訂單歷史資料</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css" >
	</head>
	<body>
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		<div class="pure-form" style="padding: 15px">
			<fieldset>
				<legend>訂單歷史資料</legend>
				<table class="pure-table pure-table-bordered">
					<thead>
						<tr>
							<th>訂單編號</th><th>使用者編號</th>
							<th>訂單日期</th><th>訂單金額</th><th>訂單狀態</th>
							<th>訂單細目</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="orderDto" items="${ orderDtos }">
							<tr>
								<td>${ orderDto.orderId }</td>
								<td>${ orderDto.userId }</td>
								<td>${ orderDto.orderDate }</td>
								<td>${ orderDto.totalPrice }</td>
								<td>${ orderDto.orderStatus }</td>
								<td><a title="按我一下可以看到訂單細目(Homework)" href="#">訂單細目</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</fieldset>
		</div>
	</body>
</html>