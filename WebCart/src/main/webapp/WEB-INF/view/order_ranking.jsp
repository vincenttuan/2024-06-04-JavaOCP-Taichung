<%@ page import="model.dto.UserDto"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>訂單統計資料</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css" >
	</head>
	<body>
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		<div class="pure-form" style="padding: 15px">
			<fieldset>
				<legend>訂單統計資料</legend>
				${ productSalesSummaries }
			</fieldset>
		</div>
	</body>
</html>