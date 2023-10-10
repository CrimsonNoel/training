<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<font color="red"><%= request.getParameter("name") %></font>
<br>
<font color="blue"><%= request.getParameter("city") %></font>
</body>
</html>