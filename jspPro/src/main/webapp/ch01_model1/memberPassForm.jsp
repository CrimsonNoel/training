<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form class="w3-container" action="memberPassPro.jsp" method="post"
	onsubmit="return passChk(this)">
	<p>
		<label>현재 비밀번호</label>
		<input class="w3-input" type="password" name="pass">
	</p> 
	<p>
		<label>변경 비밀번호</label>
		<input class="w3-input" type="password" name="chgpass1">
	</p>
	<p>
		<label>변경 비밀번호 확인</label>
		<input class="w3-input" type="password" name="chgpass2">
	</p>
	
	<p>
	<input class= "w3-input" type="submit" value="비밀번호 변경">
	</p>
	</form>
	<script>
	alert("로그인을 하세요")
	location = "login.jsp";
	</script>
</body>
</html>