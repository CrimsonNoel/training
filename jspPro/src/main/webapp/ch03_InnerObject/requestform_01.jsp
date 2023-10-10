<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력된 숫자까지의 합 구하기</title>
<script >
   function calcsum(k, f) {
	   alert("ok:"+k)
	   f.kind.value=k;
	   f.submit(); //submit 버튼 클릭 효과 발생. 단 onsubmit 이벤트 발생 안됨.
   }
</script>
</head>
<body>
<form action="requestform_02.jsp" method = "post">
	<input type = "hidden" name="kind" value="0">
	<input type = "text" name="num"> 까지의 합 구하기
	<input type = "submit" value="합계구하기">
	<input type = "button" value="짝수합구하기" onclick="calcsum(2,this.form)">
	<input type = "button" value="홀수합구하기" onclick="calcsum(1,this.form)">
</form>

</body>
</html>