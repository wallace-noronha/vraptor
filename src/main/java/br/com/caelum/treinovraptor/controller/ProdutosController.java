package br.com.caelum.treinovraptor.controller;

import java.util.List;

import br.com.caelum.treinovraptor.dao.ProdutoDao;
import br.com.caelum.treinovraptor.modelo.Produto;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class ProdutosController {

	private final ProdutoDao dao;
	private final Result result;
	private Validator validator;
	
	//Construtor da Classe ProdutosController
	public ProdutosController(ProdutoDao dao, Result result,Validator validator) {
		this.dao = dao;
		this.result = result;
		this.validator = validator;
	}
	
	public void formulario() {
	}
	
	@Get("/produtos")
	public List<Produto> lista(){
		return dao.lista();
	}
	
	@Post("/produtos")
	public void adiciona(final Produto produto) {
//		if(produto.getNome() == null || produto.getNome().length() < 3) {
//			validator.add(new ValidationMessage("nome é obrigatório e precisa ter mais de 3 letras","produto.nome"));
//		}
//		
//		if(produto.getDescricao() == null || produto.getDescricao().length() > 40) {
//			validator.add(new ValidationMessage("descrição é obrigatório e não pode conter mais de 40 letras", "produto.descricao"));
//		}
//		
//		if(produto.getPreco()<=0) {
//			validator.add(new ValidationMessage("Valor do produro não pode ser negativo nem 0", "produto.preco"));
//		}
		
		validator.validate(produto);
		validator.onErrorUsePageOf(ProdutosController.class).formulario();
		
		dao.salva(produto);
		result.redirectTo(this).lista();
	}
	
	@Get("/produtos/{id}")
	public Produto edita(Long id) {
		return dao.carrega(id);	
	}
	
	@Put("/produtos/{produto.id}")
	public void altera(Produto produto) {
		dao.atualiza(produto);
		result.redirectTo(this).lista();
	}
	
	@Delete("/produtos/{id}")
	public void remove(Long id) {
		Produto produto = dao.carrega(id);
		dao.remove(produto);
		result.redirectTo(this).lista();
	}
}
