<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>

<%@page contentType"text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String nom=request.getParameter("Nombre");
		String ed=request.getParameter("Edad");
		String tip=request.getParameter("Tipo");
		String est=request.getParameter("Estado");
		
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con=DriverManager.getConnection("","sa","123");
			PreparedStatement ps= con.preparedStatement(" insert into mascotas(nombre,edad,tipo,estado)values(nom,ed,tip,est)");
			
		}
		catch(Exception e){
			
		}
	%>
</body>
</html>