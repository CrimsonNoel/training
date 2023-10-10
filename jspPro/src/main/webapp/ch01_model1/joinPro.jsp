<%@page import="model.MmemberDao"%>
<%@page import="model.Mmember"%>
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
	request.setCharacterEncoding("utf-8");
	Mmember mem = new Mmember();
	mem.setId(request.getParameter("id"));
	mem.setPass(request.getParameter("pass"));
	mem.setName(request.getParameter("name"));
	mem.setGender(Integer.parseInt(request.getParameter("gender")));
	mem.setTel(request.getParameter("tel"));
	mem.setEmail(request.getParameter("email"));
	/* mem.setPic(request.getParameter("pic")); */
	
	MmemberDao md = new MmemberDao();
	String msg = "";
	String url = "";
	int num = md.insertMmember(mem);
	if(num>0){ //ok
		msg=mem.getName()+"님이 가입하였습니다.";
		url="loginForm.jsp";
	}else{//no
		msg="가입에 실패하였습니다";
		url="joinForm.jsp";
	}
%>

<%= mem %>
<script>
alert('<%=msg%>');
location.href="<%=url%>";
</script>
</body>
</html>