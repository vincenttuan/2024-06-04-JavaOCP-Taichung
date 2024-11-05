<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>登入頁面</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css" >
		<style type="text/css">
			/* 正中央 */
			body {
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
            }
		</style>
	</head>
	<body style="padding: 15px">
		<div class="pure-form">
			<fieldset>
				<legend>🔑 登入頁面</legend>
				<form class="pure-form" method="post" action="/WebCart/login">
					🧑: <input type="text" name="username" placeholder="請輸入使用者名稱" required /><p />
					🔐: <input type="password" name="password" placeholder="請輸入使用者密碼" required /><p />
					<input type="text" name="authCode" placeholder="請輸入認證碼" required />
					<img style="cursor: pointer;" src="/WebCart/CAPTCHA" title="按我一下可以更新乙次" valign="middle" onclick="this.src='/WebCart/CAPTCHA?<%=new Random().nextInt() %>'" >
					<p />
					<button type="reset" class="pure-button">清除</button>
					<button type="submit" class="pure-button pure-button-primary">登入</button><p />
				</form>
			</fieldset>
		</div>
	</body>
</html>