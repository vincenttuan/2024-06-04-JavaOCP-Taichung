<%@ page import="model.dto.UserDto"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>User 會員資料</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css" >
	</head>
	<body style="padding: 15px">
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		<div class="pure-form">
			<fieldset>
				<legend>User 會員資料列表</legend>
				<table class="pure-table pure-table-bordered">
					<thead>
						<tr>
							<th>序號</th><th>名稱</th><th>權限</th>
						</tr>
					</thead>
					<tbody>
						<% for(UserDto userDto : userDtos) { %>
							
							<tr>
								<td>${ userDto.userId }</td>
								<td>${ userDto.username }</td>
								<td>${ userDto.priority }</td>
							</tr>
						
						<% } %>
					</tbody>
				</table>
			</fieldset>
		</div>
	</body>
</html>