package br.com.comex.modelo;

import java.math.BigDecimal;

public class ProdutoIsento extends Produto {
	public ProdutoIsento(String nome, String descricao, BigDecimal precounitario, int qtdestoque,
	Categoria categoria, EnumTipoIsento tipo) {
super(nome, descricao, precounitario, qtdestoque, categoria, tipo);
}

public double calculaImposto() {
return 0;		
}	
//	public ProdutoIsento(int id, String nome, String descricao, double precounitario, int qtdestoque,
//			String categoria) {
//		super(id, nome, descricao, precounitario, qtdestoque, categoria);
//	}
//
//	public double calculaImposto() {
//		return 0;		
//	}
}