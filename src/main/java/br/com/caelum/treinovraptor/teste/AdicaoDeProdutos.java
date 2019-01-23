package br.com.caelum.treinovraptor.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.treinovraptor.dao.ProdutoDao;
import br.com.caelum.treinovraptor.infra.CriadorDeSession;
import br.com.caelum.treinovraptor.infra.CriadorDeSessionFactory;
import br.com.caelum.treinovraptor.modelo.Produto;

public class AdicaoDeProdutos {

	public static void main(String[] args) {
	SessionFactory factory = new CriadorDeSessionFactory().getInstance();
	
	Session session = new CriadorDeSession(factory).getInstance();
	
	ProdutoDao dao = new ProdutoDao(session);
	
	//Criando o produto
	Produto produto = criaProduto();
	
	//Salvando o produto no banco
	dao.salva(produto);

	}

	private static Produto criaProduto() {
		Produto produto = new Produto();
		produto.setNome("cadeira");
		produto.setDescricao("cadeira reclinavel");
		produto.setPreco(250.0);
		return produto;
	}

}
