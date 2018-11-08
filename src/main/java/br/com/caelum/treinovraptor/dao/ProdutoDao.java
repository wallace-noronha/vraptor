package br.com.caelum.treinovraptor.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.treinovraptor.infra.CriadorDeSession;
import br.com.caelum.treinovraptor.modelo.Produto;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class ProdutoDao {

	private final Session session;
	
	public ProdutoDao() {
		this.session = CriadorDeSession.getSession();
	}

	public void salva(Produto produto) {
		Transaction tx = session.beginTransaction();
		this.session.save(produto);
		tx.commit();
	}
	
	public void remove(Produto produto) {
		Transaction tx = session.beginTransaction();
		this.session.delete(produto);
		tx.commit();
	}

	public void atualiza(Produto produto) {
		Transaction tx = session.beginTransaction();
		this.session.update(produto);
		tx.commit();
	}
	
	public Produto carrega(Long id) {		
		return (Produto) this.session.load(Produto.class, id);
	}
	
	
	public List<Produto> lista(){
		return this.session.createCriteria(Produto.class).list();
	}

	private void imprime(Produto produto) {
		System.out.println("Id: " + produto.getId());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Valor: " + produto.getPreco());
		
	}
}
