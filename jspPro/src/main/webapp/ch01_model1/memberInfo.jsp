<%@page import="model.MmemberDao"%>
<%@page import="model.Mmember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ include file = "/ch00_model1/login.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = (String)session.getAttribute("id");
 if(!id.equals("") && id!=null){
	Mmember mem = new MmemberDao().oneMmember(id);
%>
<div class = "w3-container">
<table class = "w3-table-all">
<tr> <td>아이디</td><td><%=mem.getId() %></td></tr>
<tr> <td>이름</td><td><%=mem.getName() %></td></tr>
<tr> <td>성별</td><td><%=mem.getGender()==1?'남':'여' %></td></tr>
<tr> <td>전화번호</td><td><%=mem.getTel() %></td></tr>
<tr> <td>이메일</td><td><%=mem.getEmail() %></td></tr>
<tr><td colspan="2" class="w3-center">
<a class = "w3-button w3-black" href="memberUpdateForm.jsp">회원정보수정</a>
<a class = "w3-button w3-black" href="memberDeleteForm.jsp">회원탈퇴</a>
<a class = "w3-button w3-black" href="memberPassForm.jsp">비밀번호수정</a>
</td></tr>
</table>
</div>
<%}else{ %>
<script>
alert("로그인을 하세요")
location.href="loginForm.jsp";
</script>
<%} %>
</body>
</html>