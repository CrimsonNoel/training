<%@page import="model.MemberDao"%>
<%@page import="model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class = "w3-container">
<table class = "w3-table-all">
<caption>회원정보확인${sessionScope.id }</caption>
<tr> <td>아이디</td><td>${m.id }</td>
<td rowspan="4" valign="bottom" width="100px">
<img src="${pageContext.request.contextPath }/view/member/picture/${m.picture}" width="100" height="120" id="pic">
<c:if test="${m.picture!=null }">
	<td>
	<a target="blank" href="${pageContext.request.contextPath }/view/member/picture/${m.picture}">링크</a></td>
	</c:if>
	<a href="#none"></a>
<tr> <td>이름</td><td>${m.name}</td></tr>
<tr> <td>성별</td><td>${m.gender==1?"남":"여"}

</td></tr>
<tr> <td>전화번호</td><td>${m.tel}</td></tr>
<tr> <td>이메일</td><td>${m.email}</td></tr>
<tr><td colspan="2" class="w3-center">
<a class = "w3-button w3-black" href="${pageContext.request.contextPath}/member/memberUpdateForm">회원정보수정</a>
<a class = "w3-button w3-black" href="${pageContext.request.contextPath}/member/memberDeleteForm">회원탈퇴</a>
<a class = "w3-button w3-black" href="${pageContext.request.contextPath}/member/memberPassForm">비밀번호수정</a>
</td></tr>
</table>
</div>

</body>
</html>