<%@page import="model.MemberDao"%>
<%@page import="model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@include file="login.jsp" %>
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
	<form class="w3-container" action="memberUpdatePro.jsp" name ="f" method="post">
	<table>
	<caption>회원 정보 수정</caption>
  <tr>
    <td rowspan="4" valign="bottom" width="100px"><img src="" width="100" height="120"
    		id="pic"><br><font size="1"><a class="w3-button w3-green">사진등록</a></font></td>
    <td>아이디</td>
    <td><%=m.getId()%></td>
  </tr><tr> <td>비밀번호</td><td><input type="password" name="pass" ></td>
  </tr><tr> <td>이름</td><td><input type="text" name="name"  value="<%=m.getName()%>"></td>
  </tr><tr><td>성별</td>
 <td><input type="radio" name="gender" value="1" <%=m.getGender()==1?"checked":""%>>남
   	 <input type="radio" name="gender" value="2"<%=m.getGender()==2?"checked":""%>>여</td> 
 </tr><tr><td>전화번호</td>
  <td colspan="2"><input type="text" name="tel"  value="<%=m.getTel()%>"></td>
 </tr><tr><td>이메일</td> 
  <td colspan="2"><input type="text" name="email"  value="<%=m.getEmail()%>"></td>
  </tr><tr>
  <td colspan="3" class="w3-center"><input type="submit" value="회원정보수정"></td>
  </tr>
  </table>
</form>
<%}else{ %>
<script>
alert("로그인을 하세요")
location.href="loginForm.jsp";
</script>

<%} %>
</body>
</html>