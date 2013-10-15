<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<%@ page import="com.arquitecturajava.Libro"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	
	</head>
	<body>

		<form name="filtroCategoria">
<select name="categoria">
<option value="seleccionar">seleccionar</option>

<% 
	List<String> listaDeCategorias=null;
	listaDeCategorias=Libro.buscarTodasLasCategorias();
		 
	 for(String categoria:listaDeCategorias) { %>
	 
	   <option value="<%=categoria%>"><%=categoria%></option>
		
 	<% } %>
 	
	</select>
<input type="submit" value="filtrar">

</form>
	<br/>
		<%	
			List<Libro> listaDeLibros = null;
			if (request.getParameter("categoria") == null || request.getParameter("categoria").equals("seleccionar")){
				listaDeLibros = Libro.buscarTodos();
			}
			else{
				listaDeLibros = Libro.buscarPorCategoria(request.getParameter("categoria"));
			}
			for(Libro libro:listaDeLibros){%>
	
				<%=libro.getIsbn()%>
				<%=libro.getTitulo()%>
				<%=libro.getCategoria()%>
				<a href="borrarLibro.jsp?isbn=<%=libro.getIsbn() %>">Borrar</a>
				<a href="formularioEditarLibro.jsp?isbn=<%=libro.getIsbn() %>">Editar</a>
				<br />
				
			
			<%}%>
		<a href="formularioInsertarLibro.jsp">Insertar Libro</a>
	
	</body>
</html>