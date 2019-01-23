<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem de produtos</title>
</head>
<body>


<h1>Lista de produtos</h1>
<table>
	<thead>
		<tr>
			<td>Id</td>
			<td>Nome</td>
			<td>Descrição</td>
			<td>Preço</td>
			<td>Editar</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${produtoList}" var="produto">
			<tr>
				<td>${produto.id}</td>
				<td>${produto.nome}</td>
				<td>${produto.descricao}</td>
				<td>${produto.preco}</td>
				<td><a href="<c:url value="/produtos/${produto.id}"/>">Editar</a></td>
				<td>
					<form action="<c:url value="/produtos/${produto.id}"/>" method="POST"> 
						<button class="link" name="_method" value="DELETE"> Remover </button> 
					</form> 
				</td>
			</tr>
</c:forEach>
	</tbody>
</table>
</body>
</html>