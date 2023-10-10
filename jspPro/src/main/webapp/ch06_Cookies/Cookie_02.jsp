<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹 브라우저에 저장된 쿠키를 가져오는 예제</title>
</head>
<body>
<h2>웹 브라우저에 저장된 쿠키를 가져오는 예제</h2>

<%
Cookie[] cookies = request.getCookies();
if(cookies!=null){
	for(int i=0; i<cookies.length; ++i){
		if(cookies[i].getName().equals("id")){  %>
			쿠키의 이름은 "<%= cookies[i].getName()%>" 이고
			<%-- 쿠키의 값"<%=cookies[i].getValue()%> 입니다. --%>
			쿠키의 값 "<%URLDecoder.decode(cookies[i].getValue(), "utf-8");%>"입니다.
			
<%		}
	}
}
%>

</body>
</html>