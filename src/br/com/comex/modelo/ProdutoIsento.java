package br.com.comex.modelo;

import java.math.BigDecimal;

public class ProdutoIsento extends Produto {
	public ProdutoIsento(String nome, String descricao, BigDecimal precounitario, int qtdestoque,int categoria, EnumTipoIsento tipo) {
		super(nome, descricao, precounitario, qtdestoque, categoria, tipo);
	}

	public BigDecimal calculaImposto() {
		return new BigDecimal(0);		
	}	
}