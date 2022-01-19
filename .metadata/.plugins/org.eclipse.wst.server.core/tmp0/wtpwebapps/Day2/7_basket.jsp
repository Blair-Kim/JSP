<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
</head>
<body>
	<h2>장바구니</h2>
	<form method="post" action="7_basket_ok.jsp">
		<p>
			<select name="product">
				<option value="가방">가방</option>
				<option value="라면">라면</option>
				<option value="계란">계란</option>
				<option value="청소기">청소기</option>
				<option value="삼성핸드폰">삼성핸드폰</option>
			</select>
		</p>
		<hr>
		<p>
			<input type="submit" value="추가"> 
			<input type="button" value="결제" onclick="location.href='7_basket_payment.jsp'"> 
			<input type="button" value="장바구니 비우기" onclick="location.href='7_basket_clear.jsp'">
		</p>
		<hr>
	<%
		request.setCharacterEncoding("UTF-8");
		List<String> list = (List)session.getAttribute("productList");
		session.setAttribute("productList", list);
		if(list != null){
			out.print("현재 담긴 상품 : ");
			for(String product : list){
			out.println(product);
			}
		}else{
			out.println("장바구니가 비었습니다.");
		}
	%>
	</form>
</body>
</html>