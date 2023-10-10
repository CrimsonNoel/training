<%@page import="model.MemberDao"%>
<%@page import="model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file = "login.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	Member mem = new Member();
	mem.setId(request.getParameter("id"));
	mem.setPass(request.getParameter("pass"));
	mem.setName(request.getParameter("name"));
	mem.setGender(Integer.parseInt(request.getParameter("gender")));
	mem.setTel(request.getParameter("tel"));
	mem.setEmail(request.getParameter("email"));
	
	MemberDao md = new MemberDao();
	int num = md.insertMember(mem);
	String msg = "";
	String url = "";
	if(num>0){
		//insert ok
		msg = mem.getName()+"님이 가입하였습니다";
		url = "loginForm.jsp";
	}else{
		//insert error
		msg = "회원가입에 실패하였습니다";
		url = "joinForm.jsp";
	}
	
%>

<%= mem %>
<script>
alert('<%=msg%>');
location.href="<%=url%>";
</script>
</body>
</html>