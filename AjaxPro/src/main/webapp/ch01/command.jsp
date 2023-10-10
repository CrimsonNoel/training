<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
List<String>  li = new ArrayList();
li.add("AJAX");
li.add("AJAX실전프로그래밍");
li.add("자바서버페이지");
li.add("자바스터디");
li.add("자바서비스");
li.add("java program ");
li.add("jsp program ");
li.add("자바 재미 있나요 ");
li.add("언어를 배웁시다 ");
li.add("스프링은 무었인가요 ");
li.add("spring ");
li.add("자바캔");

String keyword = request.getParameter("keyword");

String send = "";
for (String str : li) {
   if (str.contains(keyword)) {
   send += "<p><a href='https://www.google.co.kr/search?q="+str+"'>"+str+"</a></p>";
   }
}
%><%=send%>