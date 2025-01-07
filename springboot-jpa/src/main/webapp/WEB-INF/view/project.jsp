<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>專案工作</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		<link rel="stylesheet" href="/css/buttons.css">
	</head>
	<body>
		<!-- menu bar include -->
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		
		<!-- body content -->
		<div style="padding: 15px">
			<!-- 專案工作 -->
			<sp:form class="pure-form" modelAttribute="projectDTO" method="post" action="/project">
			    專案名稱: <sp:input path="name" /> <p />
			    <button type="submit">新增</button>
			</sp:form>
			<!-- 專案列表 -->
			<table class="pure-table pure-table-bordered">
				<thead>
					<tr>
						<th>ID</th><th>Name</th><th>員工</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="project" items="${ projectDTOs }">
						<tr>
							<td>${ project.id }</td>
							<td>${ project.name }</td>
							<td>
								
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>