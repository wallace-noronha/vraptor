package br.com.caelum.treinovraptor.controller;

import java.util.List;

import br.com.caelum.treinovraptor.dao.ProdutoDao;
import br.com.caelum.treinovraptor.modelo.Produto;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ProdutosController {

	private final ProdutoDao dao;
	private final Result result;
	//Construtor da Classe ProdutosController
	public ProdutosController(ProdutoDao dao, Result result) {
		this.dao = dao;
		this.result = result;
	}
	
	public void formulario() {
	}
	
	
	public List<Produto> lista(){
		return dao.lista();
	}
	
	public void adiciona(Produto produto) {
		dao.salva(produto);
		result.forwardTo(this).lista();
	}
	
	public Produto edita(Long id) {
		return dao.carrega(id);	
	}
	
	public void altera(Produto produto) {
		dao.atualiza(produto);
		result.redirectTo(this).lista();
	}
	
	public void remove(Long id) {
		Produto produto = dao.carrega(id);
		dao.remove(produto);
		result.redirectTo(this).lista();
	}
}
