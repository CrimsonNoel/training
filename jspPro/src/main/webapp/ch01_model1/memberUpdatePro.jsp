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
	String msg="로그인이 필요합니다";
	String url="loginForm.jsp";
	String id = (String)session.getAttribute("id");
	if(id!=null && !id.equals("")){
		request.setCharacterEncoding("utf-8");
		Mmember newm = new Mmember();
		newm.setId(id);
		newm.setPass(request.getParameter("pass"));
		newm.setName(request.getParameter("name"));
		newm.setGender(Integer.parseInt(request.getParameter("gender")));
		newm.setTel(request.getParameter("tel"));
		newm.setEmail(request.getParameter("email"));
		newm.setPicture(request.getParameter("picture"));
		
		MmemberDao md = new MmemberDao();
		Mmember dbm = new MmemberDao().oneMmember(id);
		
		if(dbm!=null){
			if(dbm.getPass().equals(newm.getPass())){
				//수정 완료
				msg=newm.getName() + "님의 정보 수정이 되었습니다.";
				url="memberinfo.jsp";

			}else{
				//수정 실패
				msg="정보수정이 실패 하였습니다.";
				url="memberUpdateForm.jsp";
			}
		}else{
			// 비밀번호 틀림
			msg="비밀번호가 틀렸습니다.";
			url="memberUpdateForm.jsp";
		}
	}

%>
<script>
alert("<%=msg%>")
location.href="<%=url%>";
</script>

</body>
</html>