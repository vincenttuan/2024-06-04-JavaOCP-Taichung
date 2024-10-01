<%@ page import="model.dto.ProductDto"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<ProductDto> productDtos = (List<ProductDto>)request.getAttribute("productDtos");

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Product 商品資料</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css" >
	</head>
	<body>
		<div class="pure-form">
			<fieldset>
				<legend>Product 商品資料列表</legend>
				資料筆數: <%=productDtos.size() %><p />
				<table border="1">
					<thead>
						<tr>
							<th>序號</th><th>品名</th><th>價格</th><th>庫存</th><th>小計</th>
						</tr>
					</thead>
					<tbody>
						<% for(ProductDto productDto : productDtos) { %>
							<tr>
								<td><%=productDto.getId() %></td>
								<td><%=productDto.getName() %></td>
								<td><%=productDto.getPrice() %></td>
								<td><%=productDto.getQty() %></td>
								<td><%=productDto.getTotal() %></td>
							</tr>
						<% } %>
					</tbody>
				</table>
			</fieldset>
		</div>
	</body>
</html>