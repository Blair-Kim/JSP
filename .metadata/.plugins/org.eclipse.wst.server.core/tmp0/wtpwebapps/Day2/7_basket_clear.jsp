<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.invalidate();
%>
<script>
	alert('장바구니를 비웠습니다.');
	location.href="7_basket.jsp";
</script>