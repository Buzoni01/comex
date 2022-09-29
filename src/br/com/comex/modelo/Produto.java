package br.com.comex.modelo;

public class Produto {
	private int id;
	private String nome;
    private String descricao;
    private double precounitario;
    private int qtdestoque; 
	private String categoria;
	private static int qtdProdutos;

	public Produto(int id, String nome, String descricao, double precounitario,
			       int qtdestoque,String categoria) {            

		if (id <= 0){throw new IllegalArgumentException("Id não pode ser menor ou igual a zero.");}
    	else this.id = id;

		if (nome.length() <=5 ){throw new IllegalArgumentException("Nome não pode ter menos que 5 caracteres.");}
    	else this.nome = nome;		
		
		this.descricao = descricao;

		if (precounitario <= 0){throw new IllegalArgumentException("Preço Unitário não pode ser menor ou igual a zero.");}
    	else this.precounitario = precounitario;		
		
		if (qtdestoque <= 0){throw new IllegalArgumentException("Quantidade em Estoque não pode ser menor ou igual a zero.");}
    	else this.qtdestoque = qtdestoque;

		if (categoria.length() <=0 ){throw new IllegalArgumentException("Categoria não pode ficar vazio.");}
    	else this.categoria = categoria;
		
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

	
	public double calculaImposto() {
		double imposto = this.precounitario * 40 / 100;
		return imposto;
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
	public double getPrecounitario() {
		return precounitario;
	}
	public void setPrecounitario(double precounitario) {
		if (precounitario <= 0){throw new IllegalArgumentException("Preço Unitário não pode ser menor ou igual a zero.");}
    	else this.precounitario = precounitario;
	}
	public int getQtdestoque() {
		return qtdestoque;
	}
	public void setQtdestoque(int qtdestoque) {
		if (qtdestoque <= 0){throw new IllegalArgumentException("Quantidade em Estoque não pode ser menor ou igual a zero.");}
    	else this.qtdestoque = qtdestoque;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
    	if (categoria.length() <=0 ){throw new IllegalArgumentException("Categoria não pode ficar vazio.");}
    	else this.categoria = categoria;
	}
	// FIM SETs e GETs    
}
