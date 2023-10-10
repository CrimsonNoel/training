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
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(id.equals(pw)){
		session.setAttribute("id",id);
		response.sendRedirect("sessionLoginconfirm.jsp");
	}else{%>
		<script>
		alert("아이디와 비밀번호가 맞지 않습니다.");
		history.go(-1)
		</script>
		
<%	}
%>

<%=id %>로 입력 되었습니다.
</body>
</html>