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
	
	//입력값 받아오기
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	//db연결
	MmemberDao md = new MmemberDao();
	Mmember mem = md.oneMmember(id);

	String msg = "";
	String url = "";
		
	
	if(mem==null){
		msg = "아이디가 없습니다.";
		url = "loginForm.jsp";
	}else {
		if(pass.equals(mem.getPass())){
			session.setAttribute("id", id);
			msg = mem.getName()+"님이 로그인 되었습니다";
			url="login.jsp";
		}else{	
		msg = "비밀번호를 확인 하세요.";
		url = "loginForm.jsp";
	}
	}
%>
 <script>
alert('<%=msg%>');
location.href="<%=url%>";
</script>
</body>
</html>