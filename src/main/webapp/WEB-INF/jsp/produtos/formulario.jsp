<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário</title>
</head>
<body>


<form action="<c:url value="/produtos"/>" method="POST">
<fieldset>
	<legend>Adicionar Produto</legend>
	<label for="nome">Nome:</label>
		<input id="nome" type="text" name="produto.nome" value="${produto.nome}"/><br/>
	<label for="descricao">Descrição:</label>
		<textarea id="descricao" name="produto.descricao" >${produto.descricao}</textarea><br/>
	<label for="preco">Preço:</label>
		<input id="preco" type="number" name="produto.preco" value="${produto.preco}"/><br/>
	<button type="submit">Enviar</button>
</fieldset>
</form>
</body>
</html>