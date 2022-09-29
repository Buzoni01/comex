package br.com.comex.modelo;

public class ProdutoIsento extends Produto {
	public ProdutoIsento(int id, String nome, String descricao, double precounitario, int qtdestoque,
			String categoria) {
		super(id, nome, descricao, precounitario, qtdestoque, categoria);
	}

	public double calculaImposto() {
		return 0;		
	}
}