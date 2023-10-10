<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	// 한글깨짐 해결법. getParameter 등 값을 가져오기 전에 실행해야된다.
	// get으로 불러오다가 깨지는 브라우저도 있다.

	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String hobby = request.getParameter("hobby");
	String year	= request.getParameter("year");
	String gender = request.getParameter("gender");
	%>
이름 : [<%=name %>]<br>
age : [<%=age %>]<br>
성별	: [<%=gender %>]
취미 : [<%=hobby %>]<br>
년도 : [<%=year %>]<br>

<% String[] hobbies = request.getParameterValues("hobby");
for( String h : hobbies){%>
<%=h+"," %>
<%} %><br>

<table>
<tr><th>파라미터 이름(Enumeration)</th><th>파라미터값</th></tr>
<% //Iterator의 구버전 : 반복자.
	Enumeration e = request.getParameterNames()	;
	while(e.hasMoreElements()){
		String ParamName = (String)e.nextElement(); // 파라미터 이름
		String[] ParamValues = request.getParameterValues(ParamName);
%>
<tr><td><%=ParamName%></td>
	<td><% for(String v : ParamValues){ %>
		<%=v %>&nbsp;&nbsp;&nbsp;<%} %></td>
</tr><%} %>
</table>

<table>
<tr><th>Map</th><th>파라미터값</th></tr>
<% //Iterator의 구버전 : 반족자.
	Map<String, String[]> map = request.getParameterMap();
	Iterator<Map.Entry<String,String[]>> it = map.entrySet().iterator();
	while(it.hasNext()){
		Entry<String, String[]> en = it.next();	// 파라미터 이름    %>
<% // Map 잡고, Map.Entry 도 import 잡아야한다 %>
<tr><td><%=en.getKey()%></td>
	<td><% for(String v : en.getValue()){ %>
		<%=v%>&nbsp;&nbsp;&nbsp;<%} %></td>
</tr><%} %>
</table>


/request.jsp?name=aaaa&id=bbbb&pwd=ppp
</body>
</html>

