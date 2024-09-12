<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>飲料訂購單</title>
	</head>
	<body>
		<form method="post" action="#">
			<fieldset>
				<legend>飲料訂購單</legend>
				姓名: <input type="text" name="userName" required /><p />
				電郵: <input type="email" name="email" required /><p />
				日期: <input type="date" name="orderDate" required /><p />
				數量: <input type="number" name="amount" min="1" max="10" required /><p />
				品名: <select name="beverageName">
						<option value="紅茶">紅茶</option>
						<option value="奶茶" selected>奶茶</option>
						<option value="綠茶">綠茶</option>
				     </select><p />
				冰塊: <input type="radio" name="ice" value="0"> 去冰  
				     <input type="radio" name="ice" value="0.5"> 少冰
				     <input type="radio" name="ice" value="1" checked> 正常冰<p />
				甜度: <input type="radio" name="sugar" value="0"> 無糖     
					 <input type="radio" name="sugar" value="0.5" checked> 半糖
				     <input type="radio" name="sugar" value="1"> 全糖<p />
				配料: <input type="checkbox" name="additional" value="珍珠"> 珍珠(+10)
					 <input type="checkbox" name="additional" value="芋圓"> 芋圓(+10)
					 <input type="checkbox" name="additional" value="綠豆"> 綠豆(+5)
					 <input type="checkbox" name="additional" value="布丁"> 布丁(+15)
					 <input type="checkbox" name="additional" value="椰果"> 椰果(+12)<p />
				備註:<br>
				<textarea rows="5" cols="10"></textarea><p />
				<button type="reset">重設</button>
				<button type="submit">傳送</button>
			</fieldset>
		</form>
		
	</body>
</html>