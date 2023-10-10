<%@page import="model.MemberDao"%>
<%@page import="model.Member"%>
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
String msg="로그인이 필요합니다.";
String url="loginForm.jsp";
String id = (String)session.getAttribute("id");
if(id!=null&&!id.equals("")){
	request.setCharacterEncoding("utf-8");
	Member newm = new Member();
	newm.setId(id);
	newm.setPass(request.getParameter("pass"));
	newm.setName(request.getParameter("name"));
	newm.setGender(Integer.parseInt(request.getParameter("gender")));
	newm.setTel(request.getParameter("tel"));
	newm.setEmail(request.getParameter("email"));
	newm.setPicture(request.getParameter("picture"));
	MemberDao md = new MemberDao();
	Member dbm = new MemberDao().oneMember(id); // password 확인.

	if(dbm!=null){
		if(dbm.getPass().equals(newm.getPass())){
			int num = md.updateMember(newm);
			
			if(num>0){
				msg=newm.getName() + "님의 정보 수정이 되었습니다.";
				url="memberinfo.jsp";
			}else{
				msg="정보수정이 실패 하였습니다.";
				url="memberUpdateForm.jsp";		
			}
		}else{
			msg="비밀번호가 틀렸습니다.";
			url="memberUpdateForm.jsp";		
		}
		
	}//password 확인
}%>

<script>
alert("<%=msg%>")
location.href="<%=url%>";
</script>


</body>
</html>