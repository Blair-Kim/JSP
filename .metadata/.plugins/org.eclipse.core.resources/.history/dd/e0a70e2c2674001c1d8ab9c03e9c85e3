<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie[] cookies = request.getCookies();
	String userid = null;
	
	if(cookies != null){
		for(Cookie cookie : cookies){
			if("userid".equals(cookie.getName())){
				userid = cookie.getValue();	// admin
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<p>로그인</p>
<%
	if(userid == null){
%>
	<form method="post" action="3_login_ok.jsp">
		<p>아이디 : <input type="text" name="userid"></p>
		<p>비밀번호 : <input type="password" name="userpw"></p>
		<p><input type="submit" value="로그인"></p>
	</form>
<%
	}else{
%>
	<h3><%=userid%>님 환영합니다!</h3>
	<p><input type="button" value="로그아웃" onclick="location.href='3_logout.jsp'"></p>
<%
	}
%>
</body>
</html>