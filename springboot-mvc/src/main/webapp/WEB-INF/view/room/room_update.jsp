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
			<form class="pure-form" method="post" action="/room">
				<fieldset>
					<legend>Room 表單</legend>
					Room 房號: <input type="number" name="id" /><p />
					Room 房名: <input type="text" name="name" /><p />
					Room 人數: <input type="number" name="size" /><p />
					<button type="submit" class="pure-button pure-button-primary">
						新增
					</button>
				</fieldset>
			</form>
		</div>
	</body>
</html>