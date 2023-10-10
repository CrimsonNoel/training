<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<title>Insert title here</title>
<script>
function enterkey(num){
	
	if(window.event.keyCode==13){ 
	// 윈도우에있는 이벤트 키코드값이 13(Enter키)인걸 누르면 실행
		commentPro(num)
}
}

function commentPro(num){
	
	let comment = document.querySelector("#comment").value
	console.log(comment)
	$.get("${pageContext.request.contextPath}/board/boardCommentPro?comment="+comment+"&num="+num,
			function(data, state){
			console.log("Data: "+ data+"\n Status: "+status)
			let commentList = document.querySelector("#commentList")
			commentList.innerHTML = data + commentList.innerHTML
			console.log(commentList.innerHTML)
	})
	document.querySelector('#comment').value='' // 입력후 comment창 리셋
}


</script>


</head>
<body>
	<div class="w3-container">
		<table class="w3-table-all">
		  <tr>
		    <td>글번호</td>
		    <td>${board.num}</td>
		    <td>조회수</td>
		    <td>${board.readcnt }</td>
		  </tr>
		  <tr>
		    <td>작성자</td>
		    <td>${board.name}</td>
		    <td>작성일</td>
		    <td>${board.regdate}</td>
		  </tr>
		  <tr>
		    <td>이미지</td>
			<td colspan="3">
			<img src="${pageContext.request.contextPath }/view/board/images/${board.file1}"
				style="width: 300px"/>	
				</td>	  	
		  </tr>
		  <tr>
		    <td>글제목</td>
		    <td colspan="3">
		    	${board.subject }
		    </td>
		  </tr>
		  <tr>
		    <td>글내용</td>
		    <td colspan="3">
		    	${board.content }
		    </td>
		  </tr>
		  
		  <tr>
		    <td colspan="4">
		    <p style="text-align: right">
		    <input type="button" value="글수정" onclick="document.location.href='<%=request.getContextPath() %>/board/boardUpdateForm?num=${board.num}'">
			<input type="button" value="글삭제" onclick="document.location.href='<%=request.getContextPath() %>/board/boardDeleteForm?num=${board.num}'">
			<input type="button" value="목록" onclick="document.location.href='<%=request.getContextPath() %>/board/boardList'">
		    </p>															 <!-- session 공지/자유/기타 에서 목록가기누르면 자기id페이지로감 -->
		    </td>
		  </tr>
		  
		  
		  
		  
		  
		  <tr>
		    <td colspan="4"><hr></td>
		  </tr>
		  <tr>
				<td colspan="3" class="w3-center"><textarea rows="1"
						class="w3-input w3-border" onkeyup="enterkey('${board.num}')"
						cols="50" name="content" id="comment"></textarea></td>
				<td><input type="button" value="입력(enter 입력)"
					onclick="commentPro('${board.num}')"></td>
			</tr>
			<tr>
			<td colspan="3" id="commentList" style="text-align:left">
			<c:forEach var="c" items="${commentLi }">
			${c.toHtml()}<br> <!-- c만찍으면 toString이 찍힌다 -->
			</c:forEach>
			</td>
			</tr>

		  
</table>

	</div>
</body>
</html>