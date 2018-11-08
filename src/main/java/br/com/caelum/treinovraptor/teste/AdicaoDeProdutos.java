package br.com.caelum.treinovraptor.teste;

import org.hibernate.Session;

import br.com.caelum.treinovraptor.dao.ProdutoDao;
import br.com.caelum.treinovraptor.infra.CriadorDeSession;
import br.com.caelum.treinovraptor.modelo.Produto;

public class AdicaoDeProdutos {

	public static void main(String[] args) {
	
	//Criando o produto
	Produto produto = criaProduto();
	
	//Salvando o produto no banco
	new ProdutoDao().salva(produto);

	}

	private static Produto criaProduto() {
		Produto produto = new Produto();
		produto.setNome("cadeira");
		produto.setDescricao("cadeira reclinavel");
		produto.setPreco(250.0);
		return produto;
	}

}
