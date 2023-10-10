<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% // http://localhost:8080/jspPro/ch03_InnerObject/request.jsp?name=안정관 
   // 이 가능하다
	String name = request.getParameter("name"); 
%>

이름 : <%=name %>
</body>
</html>