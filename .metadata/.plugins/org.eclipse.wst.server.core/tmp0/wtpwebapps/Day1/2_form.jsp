<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>전송방식</h2>
	<form method="get" action="./2_form_ok.jsp">
		<p><label>아이디: <input type="text" name="userid"></label></p>
		<p><label>비밀번호: <input type="password" name="userpw"></label></p>
		<p>아이디: <input type="submit" value="로그인"></p>		
	</form>
	<p><a href="./2_form_ok.jsp?userid=banana&userpw=2222">데이터보내기</a></p>
</body>
</html>