<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar</title>
</head>
<body>

<form action="altera">
	<fieldset>
		<legend>Alterar produto</legend>
			<input type="hidden" name="produto.id" value="${produto.id}">
			<label for="nome">Nome:</label>
			<input id="nome" type="text" name="produto.nome" value="${produto.nome}"/>
			<label for="descricao">Descrição:</label>
			<textarea id="descricao" name="produto.descricao">${produto.descricao}</textarea>
			<label for="preco">Valor:</label>
			<input id="preco" type="number" name="produto.preco" value="${produto.preco}"/>
			<button type="submit">Enviar</button>
			 
			
	</fieldset>

</form>

</body>
</html>