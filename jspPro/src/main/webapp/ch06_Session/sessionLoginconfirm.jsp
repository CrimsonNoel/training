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
	try{
		if(session.getAttribute("id")!=null){
		}else{
		response.sendRedirect("sessionMemberLogin.jsp");}
		
		}catch(Exception e){}%>
		
<head>
<title>세션을 사용한 간단한 회원인증</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet"  href="https://www.w3schools.com/w3css/4/w3.css">
</head><body>
<form method="post" action="sesseionLogout.jsp">
<table class="w3-table-all">
<tr>
	<td align="center"><b><%=session.getAttribute("id") %></b>님이 로그인 하셨씁니다.
	</td> </tr>
	
<tr>
<td align="center">
<input type="submit" value="로그아웃">
</td>
</tr>
</table>
</form>
</body>

</body>
</html>