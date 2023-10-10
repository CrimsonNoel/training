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
String id = (String)session.getAttribute("id");
if(id!=null&&!id.equals("")){
	
Member m = new MemberDao().oneMember(id);
%>
<div class = "w3-container">
<table class = "w3-table-all">

<tr> <td>아이디</td><td><%=m.getId() %></td></tr>
<tr> <td>이름</td><td><%=m.getName() %></td></tr>
<tr> <td>성별</td><td><%=(m.getGender()==1)?"남":"여"%>

</td></tr>
<tr> <td>전화번호</td><td><%=m.getTel() %></td></tr>
<tr> <td>이메일</td><td><%=m.getEmail() %></td></tr>
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