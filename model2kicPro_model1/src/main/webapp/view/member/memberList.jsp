<%@page import="model.Member"%>
<%@page import="java.util.List"%>
<%@page import="model.MemberDao"%>
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

	<div class="w3-container">
	<table class="w3-table-all" style="color:#000">
	<tbody><tr>
	<th>id</th> <th>비밀번호</th> <th>이름</th> <th>성별</th> 
	<th>전화번호</th>	<th>이메일</th> <th>사진명</th><th>사진보기</th>
	</tr>
	</tbody><tbody>
	<c:forEach var="m" items="${li }">
	<tr>
	<td>${m.id }</td>
	<td>${m.pass }</td>
	<td>${m.name }</td>
	<td>${m.gender==1?"남":"여" }</td>
	<td>${m.tel }</td>
	<td>${m.email }</td>
	<td>${m.picture }</td>
	<c:if test="${m.picture!=null }">
	<td><a target="blank" href="${pageContext.request.contextPath }/view/member/picture/${m.picture}">링크</a></td>
	</c:if>
	<a href="#none"></a>
	</tr>
	</c:forEach>
	</tbody>
	</table>
	</div>
	
	<!-- <script>
	function link(){
		var pictures = document.querySelectorAll('picture');
		var contextPath = "${pageContext.request.contextPath}";
		var picture = "${m.picture}";
		if(pictures.length==0){
			location.href = contextPath+"/view/member/picture/"+picture
		}else{
			location.href = "#none"
		}
		
	}
	</script> -->

</body>
</html>