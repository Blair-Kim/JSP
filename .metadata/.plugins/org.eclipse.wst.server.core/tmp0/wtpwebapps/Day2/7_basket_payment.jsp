<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int sum=0;
	List<String> list = (List)session.getAttribute("productList");
	
	if(list != null){
		for(String product : list){
			if("가방".equals(product)){
				sum += 100000;
			}else if("라면".equals(product)){
				sum += 1500;
			}else if("라면".equals(product)){
				sum += 1500;
			}else if("계란".equals(product)){
				sum += 8000;
			}else if("다이슨청소기".equals(product)){
				sum += 150000;
			}else if("삼성핸드폰".equals(product)){
				sum += 1200000;
			}
		}
%>	
	<script>
		if(confirm('<%=sum%>원을 결제하시겠습니까?')){
			alert("결제가 성공적으로 완료되었습니다.\n장바구니를 초기화합니다");
			location.href="7_basket_invalid.jsp";
		}else{
			alert('결제를 취소합니다');
			history.back();
		}
	</script>

<%	
	}else{
%>
	<script>
		alert('결제할 상품이 없습니다');
		history.back();
	</script>
<%
	}
%>








