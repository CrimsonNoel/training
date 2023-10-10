<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
pageContext.setAttribute("page", "page test 입니다");
request.setAttribute("request", "request test 입니다.");
session.setAttribute("session", "session test 입니다.");
application.setAttribute("application", "application test 입니다.");
%>
<%=pageContext.getAttribute("page") %><br>
<%=request.getAttribute("request") %><br>
<%=session.getAttribute("session") %><br>
<%=application.getAttribute("application") %><br>
<%-- <jsp:forward page="Jsparea_02.jsp"/> --%>
<%--<jsp:forward page="Application_01.jsp"/> --%>
</body>
</html>