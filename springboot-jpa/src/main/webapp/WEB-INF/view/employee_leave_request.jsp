<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>員工請假</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		<link rel="stylesheet" href="/css/buttons.css">
	</head>
	<body>
		<!-- menu bar include -->
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		
		<!-- body content -->
		<div style="padding: 15px">
			<!-- 員工請假 -->
			<sp:form class="pure-form" modelAttribute="leaveRequestDTO" method="post" action="/leave_request">
			    <input type="hidden" name="_method" value="${ _method }" >
			    <sp:hidden path="id" />
			    <fieldset>
			    	請假類別: <sp:input type="text" path="type" /><p />
			    	開始日期: <sp:input type="date" path="startDate" /><p />
			    	結束日期: <sp:input type="date" path="endDate"  /><p />
			    	請假理由: <sp:input type="text" path="reason"  /><p />
			    	假單狀態: <sp:input type="text" path="status"  /><p />
			    	<button class="button-${ _method } pure-button" 
			    			type="submit">
			    			${ _method eq 'POST' ? '新增' : (_method eq 'PUT' ? '修改' : '刪除') }
			    	</button>
			    </fieldset>
			</sp:form>
		</div>
	</body>
</html>