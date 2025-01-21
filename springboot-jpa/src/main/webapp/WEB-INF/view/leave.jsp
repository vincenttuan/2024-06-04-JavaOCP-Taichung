<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>查詢請假</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		<link rel="stylesheet" href="/css/buttons.css">
		<script type="text/javascript">
			function validateDates() {
				// 取得 startDate 與 endDate 的值
				const startDate = document.getElementById('startDate').value;
				const endDate = document.getElementById('endDate').value;
				
				// 如果任一日期是空的則不進行驗證
				if(!startDate || !endDate) {
					alert('請輸入完整的日期範圍');
					return false; // 阻止表單提交到後端
				}
				
				// 將日期字串轉為 javascript date 物件
				const start = new Date(startDate);
				const end = new Date(endDate);
				
				// 比較日期
				if(end < start) {
					alert('結束日期必須大於開始日期');
					return false; // 阻止表單提交到後端
				}
				
				return true; // 允許表單提交到後端
				
			}
		</script>
	</head>
	<body>
		<!-- menu bar include -->
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		
		<!-- body content -->
		<div style="padding: 15px">
			<!-- 查詢請假 -->
			<div class="pure-form">
				<fieldset>
					<legend>
						查詢 ${ startDate } ~ ${ endDate } 間的請假人員: ${ fn:length(employeeDTOs) } 人 
					</legend>
					指定日期:
					<form method="get" action="/leave_request/find">
						<input type="date" name="startDate" value="${ startDate }" />
						<button type="submit">查詢</button>
					</form>
					<p />
					日期區間:
					<form method="get" action="/leave_request/find" onsubmit="return validateDates()">
						<input type="date" id="startDate" name="startDate" value="${ startDate }" />
						<input type="date" id="endDate" name="endDate" value="${ endDate }" />
						<button type="submit">查詢</button>
					</form>
					<p />
					<table class="pure-table pure-table-bordered">
						<thead>
							<tr>
								<th>請假人員</th>
								<th>請假資訊</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="employeeDTO" items="${ employeeDTOs }">
								<tr>
									<td valign="top">
										${ employeeDTO.username }
									</td>
									<td valign="top">
										<c:forEach var="leaveRequestDTO" items="${ employeeDTO.leaveRequests }">
											[ ${leaveRequestDTO.type} ]
											[ ${leaveRequestDTO.status} ]
											請假日期: ${ leaveRequestDTO.startDate } ~ ${ leaveRequestDTO.endDate }
											請假理由: ${ leaveRequestDTO.reason }<p />
										</c:forEach> 
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</fieldset>
			
			</div>
		</div>
	</body>
</html>