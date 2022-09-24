package comex;

public class Produto {
	private int id;
	private String nome;
    private String descricao;
    private double precounitario;
    private int qtdestoque; 
	private String categoria;
	private static int qtdProdutos;

	public Produto() {            
		Produto.qtdProdutos++;    
}                           
	public static int getProdutos() {
		return Produto.qtdProdutos;
}

	
	private static double soma;
	public void calculaValorEstoque(double valor) {
		Produto.soma = Produto.soma + valor;
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
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		this.precounitario = precounitario;
	}
	public int getQtdestoque() {
		return qtdestoque;
	}
	public void setQtdestoque(int qtdestoque) {
		this.qtdestoque = qtdestoque;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	// FIM SETs e GETs
    
}
