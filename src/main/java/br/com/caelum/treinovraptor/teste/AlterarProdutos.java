package br.com.caelum.treinovraptor.teste;

import br.com.caelum.treinovraptor.dao.ProdutoDao;
import br.com.caelum.treinovraptor.modelo.Produto;

public class AlterarProdutos {

	public static void main(String[] args) {
			
		Produto produto = new Produto();
		produto.setId(6L);
		produto.setDescricao("Alterado");
		produto.setNome("Nome alterado");
		produto.setPreco(50.0);
		new ProdutoDao().atualiza(produto);
		
		
	}
	
}
