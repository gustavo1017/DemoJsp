<%@page import="com.prueba.web.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		Alien a1 = (Alien) session.getAttribute("alien");
		out.println(a1.getAname());
	%>
	
	
</body>
</html>