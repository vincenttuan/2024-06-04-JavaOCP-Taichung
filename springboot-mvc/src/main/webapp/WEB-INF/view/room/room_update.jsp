<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Room 編輯</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		<link rel="stylesheet" href="/css/my_css.css">
	</head>
	<body>
		<!-- menu bar include -->
		<%@ include file="/WEB-INF/view/room/menu.jspf" %>
		
		<!-- body content -->
		<div style="padding: 15px">
			<sp:form modelAttribute="roomDTO" class="pure-form" method="post" action="/room/update/${ roomDTO.id }">
				<fieldset>
					<legend>Room 編輯</legend>
					Room 房號: <sp:input type="number" path="id" readonly="true" />
					          <sp:errors path="id" cssStyle="color: red" />
					<p />
					Room 房名: <sp:input type="text"   path="name" />
					          <sp:errors path="name" cssStyle="color: red" />
					<p />
					Room 人數: <sp:input type="number" path="size" />
					          <sp:errors path="size" cssStyle="color: red" />
					<p />
					<button type="submit" class="pure-button pure-button-primary">
						修改
					</button>
				</fieldset>
			</sp:form>
		</div>
	</body>
</html>