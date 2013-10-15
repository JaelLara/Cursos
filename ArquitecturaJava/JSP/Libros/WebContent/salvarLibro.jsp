<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="com.arquitecturajava.Libro"%>
<%
	String isbn = request.getParameter("isbn");
	String categoria = request.getParameter("categoria");
	String titulo = request.getParameter("titulo");
	
	Libro libro = new Libro(isbn, titulo, categoria);
	
	libro.salvar();
	
	response.sendRedirect("mostrarLibros.jsp");
%>