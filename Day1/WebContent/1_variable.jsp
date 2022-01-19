<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
<%
	String userid = "apple";
	String name = "김사과";
	int age = 20;
	double height = 160.5;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP의 변수</title>
</head>
<body>
	<p>아이디: <%= userid %></p>
	<p>이름: <%= name %></p>
	<p>나이: <%= age %></p>
	<p>키: <%= height %></p>
	<p>현재 시간은 : <%=new Date() %></p>
	
<%
	out.println("<p>아이디 : " + userid + "</p>");
	out.println("<p>이름 : " + name + "</p>");
	out.println("<p>나이 : " + age + "</p>");
	out.println("<p>키 : " + height + "</p>");
	
	if(age>19){
		out.println("<p> 성인입니다.</p> ");
	}else{
		out.println("<p> 청소년입니다.</p> ");
	}
%>
</body>
</html>