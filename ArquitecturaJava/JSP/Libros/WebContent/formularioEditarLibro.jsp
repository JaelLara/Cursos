<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.arquitecturajava.Libro"%>
<% Libro libro = Libro.buscarPorClave(request.getParameter("isbn")); %>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es" lang="es">
<head>
<title>Ejemplo01</title>
<link rel="stylesheet" type="text/css" href="css/formato.css" />
<script type="text/javascript">
	function validacion() {

		var isbn = document.getElementById("isbn");
		var miformulario = document.getElementById("miformulario");
		if (isbn.value == "") {
			alert("datos no validos");
			return false;
		} else {
			miformulario.submit();
		}
	}
</script>
</head>
<body>
	<form id="formularioEdicion" action="salvarLibro.jsp" onsubmit="return validacion();">
		<fieldset>
			<legend>Formulario alta libro</legend>
			<p>
				<label for="isbn">ISBN:</label> 
				<input id="isbn" type="text" name="isbn" value="<%=libro.getIsbn()%>"/>
			</p>
			<p>
				<label for="titulo">Titulo:</label> <input id="titulo" type="text"
					name="titulo"value="<%=libro.getTitulo()%>"/>
			</p>
			<p>
			<select name="categoria">
		<%
		List<String> listaDeCategoria = null;
		listaDeCategoria = Libro.buscarTodasLasCategorias();
		
		for(String categoria:listaDeCategoria){
			if(libro.getCategoria().equals(categoria)){
			%>
				<option value="<%=categoria%>" selected="selected"><%=categoria%></option>
			<%
			}
			else{
				%>
				<option value="<%=categoria%>"><%=categoria%></option>
			<%}
		}
		%>
		</select>
			</p>
			<p>
				<input type="submit" value="Salvar" />
			</p>
		</fieldset>
	</form>
</body>
</html>