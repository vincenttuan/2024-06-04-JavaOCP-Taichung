<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>登入頁面</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css" >
	</head>
	<body style="padding: 15px">
		<div class="pure-form">
			<fieldset>
				<legend>登入頁面</legend>
				<form class="pure-form" method="post" action="/WebCart/login">
					名稱: <input type="text" name="username" placeholder="請輸入使用者名稱" required /><p />
					密碼: <input type="password" name="password" placeholder="請輸入使用者密碼" required /><p />
					<button type="reset" class="pure-button">清除</button>
					<button type="submit" class="pure-button pure-button-primary">登入</button><p />
				</form>
			</fieldset>
		</div>
	</body>
</html>