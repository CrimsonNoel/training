<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form class="" action="joinPro.jsp" name ="f" method="post">
	<table>
	<caption>MODEL1으로 구현한 회원가입</caption>
  <tr>
    <td rowspan="4" valign="bottom" width="100px"><img src="" width="100" height="120"
    		id="pic"><br><font size="1"><a class="">사진등록</a></font></td>
    <td>아이디</td>
    <td><input type="text" name="id"></td>
  </tr><tr> <td>비밀번호</td><td><input type="password" name="pass"></td>
  </tr><tr> <td>이름</td><td><input type="text" name="name"></td>
  </tr><tr><td>성별</td>
 <td><input type="radio" name="gender" value="1" checked>남
   	 <input type="radio" name="gender" value="2">여</td> 
 </tr><tr><td>전화번호</td>
  <td colspan="2"><input type="text" name="tel"></td>
 </tr><tr><td>이메일</td> 
  <td colspan="2"><input type="text" name="email"></td>
  </tr><tr>
  <td colspan="3"><input type="submit" value="회원가입"></td>
  </tr>
  </table>
  
  </form>
</body>
</html>