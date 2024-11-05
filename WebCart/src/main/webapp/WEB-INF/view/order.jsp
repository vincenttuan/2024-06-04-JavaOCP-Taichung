<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>商品訂購單</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css" >
	</head>
	<body>
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		<form class="pure-form" method="post" action="/WebCart/order" style="padding: 15px">
			<fieldset>
				<legend>商品訂購單</legend>
				<table class="pure-table pure-table-bordered">
					<thead>
						<tr>
							<th>序號</th><th>品名</th><th>價格</th><th>庫存</th><th>數量</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="productDto" items="${ productDtos }">
							<tr>
								<td>
									${ productDto.id }
									<input type="hidden" name="productId" value="${ productDto.id }" />
								</td>
								<td>${ productDto.name }</td>
								<td>
									${ productDto.price }
									<input type="hidden" name="price" value="${ productDto.price }" />
								</td>
								<td>${ productDto.qty }</td>
								<td><input type="number" min="0" max="${ productDto.qty }" value="0" name="amount"></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<button class="pure-button pure-button-primary">加入訂單</button>
			</fieldset>
		</form>
	</body>
</html>