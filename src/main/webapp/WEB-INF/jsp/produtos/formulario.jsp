<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formul�rio</title>
</head>
<body>


<form action="adiciona">
<fieldset>
	<legend>Adicionar Produto</legend>
	<label for="nome">Nome:</label>
		<input id="nome" type="text" name="produto.nome"/><br/>
	<label for="descricao">Descri��o:</label>
		<textarea id="descricao" name="produto.descricao"></textarea><br/>
	<label for="preco">Pre�o:</label>
		<input id="preco" type="number" name="produto.preco"/><br/>
	<button type="submit">Enviar</button>
</fieldset>
</form>
</body>
</html>