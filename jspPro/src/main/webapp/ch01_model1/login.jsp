<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Insert title here</title>
</head>
<body>
<div class="w3-bar w3-light-grey">
    <a href="index.jsp" class="w3-bar-item w3-button w3-green">KIC Campus</a>
  <%if(session.getAttribute("id")==null) {%>
     <a href="joinForm.jsp" class="w3-bar-item w3-button w3-hide-small">회원가입</a>
     <a href="loginForm.jsp" class="w3-bar-item w3-button w3-hide-small">로그인</a>
 <%} else { %>
     <a href="memberInfo.jsp" class="w3-bar-item w3-button w3-hide-small">회원정보확인[<%=session.getAttribute("id")%>]</a>
     <a href="logoutForm.jsp" class="w3-bar-item w3-button w3-hide-small">로그아웃</a>
 <%} %>
 <%String admin = (String)session.getAttribute("id");
 	if(admin!=null && admin.equals("admin")){ %>
 	<a href="memberList.jsp" class="w3-bar-item w3-button w3-hide-small">회원정보</a>
 	<%} %>
    <div class="w3-dropdown-hover">
      <button class="w3-button">
        DropDown <i class="fa fa-caret-down"></i>
      </button>
      <div class="w3-dropdown-content w3-bar-block w3-white w3-card-4">
        <a href="javascript:voi	d(0)" class="w3-bar-item w3-button w3-text-black">Link 1</a>
        <a href="javascript:void(0)" class="w3-bar-item w3-button w3-text-black">Link 2</a>
        <a href="javascript:void(0)" class="w3-bar-item w3-button w3-text-black">Link 3</a>
      </div>
    </div>
    <a href="javascript:void(0)" class="w3-bar-item w3-button w3-right"><i class="fa fa-search"></i></a>
  </div>
</body>
</html>