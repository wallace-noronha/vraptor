package br.com.caelum.treinovraptor.teste;

import br.com.caelum.treinovraptor.dao.ProdutoDao;
import br.com.caelum.treinovraptor.modelo.Produto;

public class RemocaoDeProdutos {

	public static void main(String[] args) {
	
		new ProdutoDao().remove(6L);
		
	}
}
