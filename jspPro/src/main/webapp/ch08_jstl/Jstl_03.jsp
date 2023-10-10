<%@page import="java.util.Date"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core 태그 연습: 반복 구문</title>
</head>
<body>
	<h3> forEach 태그를 이용하여 List 객체 출력하기</h3>
	
	<%
	List<Integer> list = new ArrayList<Integer>();
	for(int i=1; i<10; i++)
		list.add(i*10);
	request.setAttribute("list", list);
	%>
	
	<c:forEach var="i" items="${list}">
	${i }&nbsp;&nbsp;&nbsp;
	</c:forEach>
	
	<c:forEach var="i" items="${list }" varStatus="stat">
		<c:if test="${stat.index==0 }">
			<h4>forEach 태그의 varStatus 속성 연습</h4>
		</c:if>
		${stat.count}-${stat.index}:${i}<br>
	</c:forEach>

	<%
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("name", "홍길동");
		map.put("today", new Date());
		map.put("age", 20);
		pageContext.setAttribute("map", map);
	%>
	<h3>forEach 태그를 이용하여 Map 객체 출력하기</h3>
	<c:forEach var="m" items="${map }" varStatus="stat">
		${stat.count}:${m.key }=${m.value }<br>	
	</c:forEach>
	
	<h3>EL을 이용하여 MAP 객체 출력하기</h3>
		name = ${map.name }<br>
		today=${map.today }<br>
		age=${map.age }<br>
		
		<%--주석 긁 필요 --%>
		
<c:set var="arr" value="<%=new int[] {10, 20, 30, 40, 50}%>"/>
<h3>배열 객체의 요소 출력</h3>
<c:forEach var="s" items="${arr }" varStatus="stat">
	arr[${stat.index}]=${s }<br>
</c:forEach>

<h3>배열 객체의 두번째 요소부터 세번쨰요소까지 출력하기</h3>
<c:forEach var="s" items="${arr }" varStatus="stat" begin="1" end="2">
	arr[${stat.index}]=${s }<br>
</c:forEach>

<h3>배열객체의 짝수 첨자 기준으로 출력하기</h3>
	<c:forEach var="s" items="${arr }" varStatus="stat" step="2">
	arr[${stat.index}]=${s }<br>
	</c:forEach>
<h3>배열객체의 홀수 첨자 기준으로 출력하기</h3>
	<c:forEach var="s" items="${arr }" varStatus="stat" step="2" begin="1">
	arr[${stat.index}]=${s }<br>
	</c:forEach>
	
	
	
	
	
	
	
	
	
	


</body>
</html>