<%@page import="model.Mmember"%>
<%@page import="model.MmemberDao"%>
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
	String id = (String)session.getAttribute("id");
	String pass = (String)session.getAttribute("pass");
	String msg ="";
	String url ="";
	
	if(id!=null && !id.equals("")){
		MmemberDao md = new MmemberDao();
		Mmember dbm = new MmemberDao().oneMmember(id);
		
		if(dbm!=null){
			if(dbm.getPass().equals(pass)){
				int num = md.deleteMmember(id);
				
				if(num>0){
					msg = dbm.getName()+"님의 탈퇴처리가 완료";
					url = "login.jsp";
					session.invalidate();
				}else{
					msg = "탈퇴 실패";
					url = "memberDeleteForm";
				}
			}else{
				msg = "비밀번호 확인";
				url = "memberDeleteForm.jsp";
			}
		}
			
		
		
	}else{
		msg = "로그인 해주세요";
		url = "loginForm.jsp";
	}
	
%>
</body>
</html>