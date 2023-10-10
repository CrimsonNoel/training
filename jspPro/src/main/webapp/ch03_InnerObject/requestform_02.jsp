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
String kind = request.getParameter("kind");
int num = Integer.parseInt(request.getParameter("num"));
int sum =0;
//0 전체, 1 홀수, 2 짝수;
 for (int i=1 ; i<=num ; i++) {
	  switch (kind) {
	  case "0" : sum+=i; break;
	  case "1" : if (i%2==1) sum+=i; break;
	  case "2" : if (i%2==0) sum+=i; break; 
	  }
  }

%>

kind : <%=kind %>
num : <%=num %>
<h2><%=num %>까지의 합
<%= (kind.equals("0")?"전체":(kind.equals("1")?"홀수":"짝수")) %>합 : 
<%=sum %></h2>
</body>
</html>