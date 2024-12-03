<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<form class="pure-form" method="post" action="/room/update/${ roomDTO.id }">
				<fieldset>
					<legend>Room 編輯</legend>
					Room 房號: <input type="number" name="id" value="${ roomDTO.id }" disabled="disabled" /><p />
					Room 房名: <input type="text" name="name" value="${ roomDTO.name }" /><p />
					Room 人數: <input type="number" name="size" value="${ roomDTO.size }" /><p />
					<button type="submit" class="pure-button pure-button-primary">
						修改
					</button>
				</fieldset>
			</form>
		</div>
	</body>
</html>