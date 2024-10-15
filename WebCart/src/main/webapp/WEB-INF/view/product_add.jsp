<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Product 商品資料新增</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css" >
	</head>
	<body style="padding: 15px">
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		<div class="pure-form">
			<fieldset>
				<legend>Product 商品資料新增</legend>
				<form class="pure-form" enctype="multipart/form-data" method="post" action="/WebCart/product/add">
					商品名稱: <input type="text" name="productName" placeholder="請輸入商品名稱" required /><p />
					商品價格: <input type="number" name="price" placeholder="請輸入商品價格" min="1" required /><p />
					商品庫存: <input type="number" name="qty" placeholder="請輸入商品庫存" min="1" max="100" required /><p />
					上傳圖片: <input type="file" name="productImage" placeholder="請選擇商品圖片"><p />
					<button type="reset" class="pure-button">清除資料</button>
					<button type="submit" class="pure-button pure-button-primary">新增商品</button><p />
				</form>
			</fieldset>
		</div>
	</body>
</html>