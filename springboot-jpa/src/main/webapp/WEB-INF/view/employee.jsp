<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>      
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Employee</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		<link rel="stylesheet" href="/css/buttons.css">
	</head>
	<body>
		<!-- menu bar include -->
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		<!-- body content -->
		<div style="padding: 15px">
			
			<table class="pure-table pure-table-bordered">
				<thead>
					<tr>
						<th>編號</th><th>姓名</th><th>年假</th><th>到職日</th>
						<th>薪資</th><th>專案工作</th><th>請假紀錄</th>
					</tr>
				</thead>
				<tbody>
					<!-- 員工資料列表 -->
					<c:forEach var="employeeDTO" items="${ employeeDTOs }">
						<tr>
							<td>${ employeeDTO.id }</td>
							<td>${ employeeDTO.username }</td>
							<td>${ employeeDTO.annualLeave }</td>
							<td>${ employeeDTO.arrivalDate }</td>
							<td>${ employeeDTO.salary.amount }</td>
							<td>
								<table class="pure-table">
									<c:forEach var="projectDTO" items="${ employeeDTO.projects }"> 
										<td>${ projectDTO.name }</td>
									</c:forEach>
								</table>
							</td>
							<td>
								${ employeeDTO.leaveRequests }
							</td>
						</tr>
						
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</body>
</html>
