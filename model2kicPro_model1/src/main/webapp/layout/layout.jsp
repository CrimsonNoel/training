<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- webapp/layout/layout.jsp -->
<meta charset="UTF-8">
<title>타이틀 :<sitemesh:write property='title' /> </title>
	<%@ include file="/common/login.jsp" %>
	<sitemesh:write property = 'head' />
</head>
<body>
	<div class='mainbody'>
		<sitemesh:write property = 'body' />
	</div>
	
	<div>
		<!-- footer -->
		<sitemesh:write property = 'footer' />
		<!-- /footer -->
	</div>
</body>
</html>