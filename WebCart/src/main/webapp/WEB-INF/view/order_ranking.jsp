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
		
		<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	    <script type="text/javascript">
	      google.charts.load('current', {'packages':['corechart']});
	      google.charts.setOnLoadCallback(drawChart);
	
	      function drawChart() {
	
	        var data = google.visualization.arrayToDataTable([
	          ['product name', 'total'],
	          
	          <c:forEach var="pss" items="${productSalesSummaries}">
	          
	          	['${pss.productName}', ${pss.total}],
	          	
	          </c:forEach>
	          	
	        ]);
	
	        var options = {
	          title: 'My Daily Activities'
	        };
	
	        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
	
	        chart.draw(data, options);
	      }
	    </script>
	
	</head>
	<body>
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		<div class="pure-form" style="padding: 15px">
			<fieldset>
				<legend>訂單統計資料</legend>
				${ productSalesSummaries }
				
				<div id="piechart" style="width: 900px; height: 500px;"></div>
				
			</fieldset>
		</div>
	</body>
</html>