package comex;

public class ProdutoIsento extends Produto {
	public ProdutoIsento(int id, String nome, String descricao, double precounitario, int qtdestoque,
			String categoria) {
		super(id, nome, descricao, precounitario, qtdestoque, categoria);
	}

	public double calculaImposto() {
		return 0;		
	}
}

	
	
/*	CÓDIGO ANTIGO:
	
//	public ProdutoIsento() {            
//		ProdutoIsento.qtdProdutos++;    
//   }                           
	private static int qtdProdutos;
	public static int getProdutos() {
		return ProdutoIsento.qtdProdutos;
    }

	
	private static double soma;
	public void calculaValorEstoque(double valor) {
		ProdutoIsento.soma = ProdutoIsento.soma + valor;
	}
	public static double getSoma() {
		return soma;
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
 */
