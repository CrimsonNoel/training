<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="login.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<div class="w3-container">
	<div class="w3-container w3-blue">
	<h2>로그인</h2>
	</div>
	
	<form class="w3-container" action="loginPro.jsp" method="post">
	<p><label>회원 ID</label>
	<input class="w3-input" type="text" name="id"></p>
	<p><label>비밀번호</label>
	<input class="w3-input" type="password" name="pass"></p>
	<p>
	<input class="w3-input" type="submit" value="확인"></p>
	
	</form>
	
	</div>
</body>
</html>