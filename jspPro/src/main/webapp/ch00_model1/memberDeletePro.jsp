<%@page import="model.Member"%>
<%@page import="model.MemberDao"%>
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
	if(id!=null && !id.equals("")){
		MemberDao md = new MemberDao();
		Member dbm = new MemberDao().oneMember(id);
		String pass = request.getParameter("pass");
				

		if(dbm!=null){
			if(dbm.getPass().equals(pass)){
				int num = md.deleteMember(id);
				
				if(num>0){
					msg=dbm.getName() + "님의 탈퇴 처리 되었습니다.";
					session.invalidate(); // 로그아웃
					url="loginForm.jsp";
				}else{
					msg="회원탈퇴가 실패 하였습니다.";
					url="memberDeleteForm.jsp";		
				}
			}else{
				msg="비밀번호가 틀렸습니다.";
				url="memberDeleteForm.jsp";		
			}
			
		}//password 확인

}
%>
<script>
alert("<%=msg%>")
location.href="<%=url%>";
</script>

</body>
</html>