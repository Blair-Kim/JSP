<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String product = request.getParameter("product") == null ? "" : request.getParameter("product");
	
	List list = (List)session.getAttribute("productList");
	
	if(list == null){
		list = new ArrayList();
	}
	list.add(product);
	
	session.setAttribute("productList", list);
%>

<script>
	alert("장바구니에 <%=product%> 상품이 추가되었습니다.")
	location.href="7_basket.jsp"
</script>