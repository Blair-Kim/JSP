<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage = "true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>500 에러</title>
<style>
	body { background-color: deepskyblue;}
	h2 { font-size: 50px; text-align: center;}
	p { text-align: center; color: gold;}
</style>
</head>
<body>
	<h2>500 에러</h2>
	<p>에러 타입 : <%=exception.getClass().getName() %></p>
	<p>에러 페이지 : <%=exception.getMessage() %></p>
</body>
</html>