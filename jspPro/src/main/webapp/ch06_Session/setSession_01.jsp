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
	String id = "hongkd";
	String pw = "1234";
	session.setAttribute("id", id);
	session.setAttribute("pw", pw);
	
%>

세션에 id 와 pw 속성을 설졍하였습니다 <br>
<input type="button" value="세션의 설정된 속성확인" onclick="window.location='viewSession.jsp'">
</body>
</html>