<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 삭제 확인</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/board/boardDeletePro" name="f" method="post">
			
			<input type="hidden" name="num" value="${num }">
			<table class="w3-table-all">
				<caption style="font-size:200%; font-family:verdana;"> 게시글 삭제 화면 </caption>				<tr>
					<td>게시글비밀번호</td>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="게시글삭제"></td>
				</tr>
			</table>
	
	</form>
</body>
</html>