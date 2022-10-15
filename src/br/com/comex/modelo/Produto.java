package br.com.comex.modelo;

import java.math.BigDecimal;

public class Produto {
	private int id;
	private String nome;
    private String descricao;
//    private double precounitario;
//    private BigDecimal precounitario;
    private int precounitario;
    private int qtdestoque; 
	private int categoria;
//	private Categoria categoria;    
 	private EnumTipoIsento tipo;
	private static int qtdProdutos;
	
	public Produto(String nome, String descricao, int precounitario,
		       int qtdestoque, int categoria, EnumTipoIsento tipo) {            

//	if (id <= 0){throw new IllegalArgumentException("Id não pode ser menor ou igual a zero.");}
//	else this.id = id;

	if (nome.length() <=5 ){throw new IllegalArgumentException("Nome não pode ter menos que 5 caracteres.");}
	if (Character.isDigit(nome.charAt(0))){throw new IllegalArgumentException("0 1o. Digito do Nome não pode ser um número.");}
	else this.nome = nome;		
	
	this.descricao = descricao;

	if (precounitario <= 0){throw new IllegalArgumentException("Preço Unitário não pode ser menor ou igual a zero.");}
//	if (d.doubleValue() <= 0){throw new IllegalArgumentException("Preço Unitário não pode ser menor ou igual a zero.");}
	else this.precounitario = precounitario;		
	
	if (qtdestoque <= 0){throw new IllegalArgumentException("Quantidade em Estoque não pode ser menor ou igual a zero.");}
	else this.qtdestoque = qtdestoque;

//	if (categoria.length() <=0 ){throw new IllegalArgumentException("Categoria não pode ficar vazio.");}
//	else this.categoria = categoria;
	
	this.tipo = tipo;
	
	Produto.qtdProdutos++; 
}
	// Fim do Construtor 2 acima
	

	
	
	
	
	public Produto(int id, String nome, String descricao, int precounitario,
			       int qtdestoque,String categoria) {            

		if (id <= 0){throw new IllegalArgumentException("Id não pode ser menor ou igual a zero.");}
    	else this.id = id;

		if (nome.length() <=5 ){throw new IllegalArgumentException("Nome não pode ter menos que 5 caracteres.");}
		if (Character.isDigit(nome.charAt(0))){throw new IllegalArgumentException("0 1o. Digito do Nome não pode ser um número.");}
		else this.nome = nome;		
		
		this.descricao = descricao;

//		if (precounitario.doubleValue() <= 0){throw new IllegalArgumentException("Preço Unitário não pode ser menor ou igual a zero.");}
		if (precounitario <= 0){throw new IllegalArgumentException("Preço Unitário não pode ser menor ou igual a zero.");}

		else this.precounitario = precounitario;		
		
		if (qtdestoque <= 0){throw new IllegalArgumentException("Quantidade em Estoque não pode ser menor ou igual a zero.");}
    	else this.qtdestoque = qtdestoque;

//		if (categoria.length() <=0 ){throw new IllegalArgumentException("Categoria não pode ficar vazio.");}
//    	else this.categoria = categoria;
		this.tipo = EnumTipoIsento.NAO_ISENTO;
		
		Produto.qtdProdutos++; 
	}                           

	public static int getProdutos() {
		return Produto.qtdProdutos;
	}

	
	private static double soma;
	public void calculaValorEstoque(double valor) {
		Produto.soma = (Produto.soma + valor);
	}
	public static double getSoma() {
		return soma;
	}
	
//	public BigDecimal calcula () {
//		
//		    if (this.tipo == EnumTipoIsento.NAO_ISENTO)
//		    {
//			   BigDecimal imposto = this.precounitario.multiply(new BigDecimal(0.4));
//			   return imposto;
//			}else
//				return new BigDecimal(0);		
//		}
	
	
	public double calculaImposto() {
		double imposto = this.precounitario * 40 / 100;
		return imposto;
	}
	
	
//	public BigDecimal calculaImposto() {
//		if (this.tipo == Tipo.NAO_ISENTO)
//
//		{
//			BigDecimal imposto = this.precoUnitario.multiply(new BigDecimal(0.4));
//			return imposto;
//		} else
//
//		{
//			return new BigDecimal(0);
//		}
//	}
	
	

	@Override
	public String toString() {
		return "Categoria: " +getId()           +" -- "        +getNome()          +" -- " +getDescricao()+
			   " -- (Preço: "+getPrecounitario()+" | Imposto: "+(calculaImposto()) +") -- "+getQtdestoque()+
			   " -- "        +getCategoria();
	}	

	
	
	//****** SETs e GETs  ****
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id <= 0){throw new IllegalArgumentException("Id não pode ser menor ou igual a zero.");}
    	else this.id = id;		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
    	if (nome.length() <=5 ){throw new IllegalArgumentException("Nome não pode ter menos que 5 caracteres.");}
    	else this.nome = nome;		
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPrecounitario() {
		return precounitario;
	}
	public void setPrecounitario(int precounitario) {
//		if (precounitario.doubleValue() <= 0){throw new IllegalArgumentException("Preço Unitário não pode ser menor ou igual a zero.");}
		if (precounitario  <= 0){throw new IllegalArgumentException("Preço Unitário não pode ser menor ou igual a zero.");}

		else this.precounitario = precounitario;
	}
	public int getQtdestoque() {
		return qtdestoque;
	}
	public void setQtdestoque(int qtdestoque) {
		if (qtdestoque <= 0){throw new IllegalArgumentException("Quantidade em Estoque não pode ser menor ou igual a zero.");}
    	else this.qtdestoque = qtdestoque;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
//    	if (categoria.length() <=0 ){throw new IllegalArgumentException("Categoria não pode ficar vazio.");}
//    	else this.categoria = categoria;
		this.categoria = categoria;
	}
	public EnumTipoIsento getTipo() {
		return tipo;
	}
	// FIM SETs e GETs    






	
}
