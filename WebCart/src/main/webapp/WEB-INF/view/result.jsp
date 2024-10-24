<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>結果頁面</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css" >
	</head>
	<body style="padding: 15px">
		<div class="pure-form">
			<fieldset>
				<legend>結果</legend>
				${ result }<p />
				<c:if test="${ userDto ne null }">
					session userDto 變數: ${ userDto }<p />
					session userDto 變數: ${ sessionScope.userDto }<p />
					session userDto 變數: <%=session.getAttribute("userDto") %><p />
					session userDto 變數: <%=pageContext.getAttribute("userDto", PageContext.SESSION_SCOPE) %><p />
				</c:if>
				<a href="${ redirectURL }">${ redirectName }</a>
			</fieldset>
		</div>
	</body>
</html>