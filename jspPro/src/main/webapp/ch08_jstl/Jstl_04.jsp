<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>형식화 태그 예제</title>
</head>
<body>
	<h3>숫자 관련 형식 지정하기</h3>
	<!-- type="currency" : 해당 지역의 화폐 단위를 표시. -->
	<fmt:formatNumber value="500000" type="currency"/>
	<br>
	<%-- <fmt:setLocale value="en_US"/> --%>
	<fmt:setLocale value="en_US"/>
	<fmt:formatNumber value="500000" type="currency"/>
	<br>
	
	<fmt:formatNumber value="0.15" type="percent"/>
	<br>
	<fmt:formatNumber value="500000.12345" pattern="###,###.00"/>
	<br>
	
	<fmt:setLocale value="ko_KR"/>
	<h3>날짜 관련 형식 지정하기</h3>
	<% Date today = new Date(); 
	request.setAttribute("today",today);	%>
	년월일: <fmt:formatDate value="${today }" type="date"/>	 <br>
	시분초: <fmt:formatDate value="${today }" type="time"/>  <br>
	일시: <fmt:formatDate value="${today }" type="both"/>	 <br>
	형식 지정: <fmt:formatDate value="${today }" pattern="yyyy-MM-dd HH:mm:ss a E"/><br>
	일시1: <fmt:formatDate value="${today }" type="both" timeStyle="short" dateStyle="short"/> <br>
	일시2: <fmt:formatDate value="${today }" type="both" timeStyle="long" dateStyle="long"/> <br>
	일시3: <fmt:formatDate value="${today }" type="both" timeStyle="full" dateStyle="full"/> <br>
	일시4: <fmt:formatDate value="${today }" type="both" timeStyle="full" dateStyle="full" timeZone="GMT"/> <br>
	
	<title>형식 관련 태그 예제2</title>
</head>
<body>
<h3>Format 된 숫자를 일반 숫자로 변경</h3>
	<fmt:parseNumber value="20,000" var="num1" pattern="##,###"/>
	<fmt:parseNumber value="10,000" var="num2" pattern="##,###"/>
	합: ${num1+num2 }<br>
	합"<fmt:formatNumber value="${num1+num2 }" pattern="##,###"/><br>
	
<h3>Fromat 된 날짜를 일반 날짜로 변경</h3>
<fmt:parseDate value="2019-04-18 12:00:00" pattern="yyyy-MM-dd HH:mm:ss" var="day" />
날짜: ${day }<br>

<h5>2019-04-18 일자의 요일을 구하기</h5>
<fmt:formatDate value="${day }" pattern="yyyy-MM-dd E요일"/>
</body>
</html>