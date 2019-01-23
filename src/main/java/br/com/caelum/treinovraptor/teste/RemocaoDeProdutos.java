package br.com.caelum.treinovraptor.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.treinovraptor.dao.ProdutoDao;
import br.com.caelum.treinovraptor.infra.CriadorDeSession;
import br.com.caelum.treinovraptor.infra.CriadorDeSessionFactory;
import br.com.caelum.treinovraptor.modelo.Produto;

public class RemocaoDeProdutos {

	public static void main(String[] args) {
		
		SessionFactory factory = new CriadorDeSessionFactory().getInstance();
		
		Session session = new CriadorDeSession(factory).getInstance();
		
		ProdutoDao dao = new ProdutoDao(session);
		
		Produto produto = new Produto();
		produto.setId(6L);
		
		dao.remove(produto);
		
	}
}
