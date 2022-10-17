package br.com.comex.modelo;

public class TesteDeCrudeDAOemProduto {

	private Integer id; //ID	NUMBER(38,0)
	private String nome; // NOME	VARCHAR2(255 BYTE)
	private String descricao; // DESCRICAO	VARCHAR2(1000 BYTE)
	private Integer  precoUnitario; //PRECO_UNITARIO	NUMBER(10,2)
	private Integer qtdEstoq; //QUANTIDADE_ESTOQUE	NUMBER(38,0)
	private Integer categoId; //CATEGORIA_ID	NUMBER(38,0)
	private String tipo; //TIPO	VARCHAR2(10 BYTE)

	public TesteDeCrudeDAOemProduto(String nome, String descricao, Integer precoUnitario, Integer qtdEstoq, 
			           Integer categoId, String tipo) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.qtdEstoq = qtdEstoq;
		this.categoId = categoId;
		this.tipo = tipo;
	}
	public TesteDeCrudeDAOemProduto(Integer id, String nome, String descricao, Integer precoUnitario, Integer qtdEstoq, 
					   Integer categoId , String tipo) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.qtdEstoq = qtdEstoq;
		this.categoId = categoId;
		this.tipo = tipo;
	}	
	
	public Integer getId() {
		return id;
	}
		
	public void setId(Integer id) {
		this.id = id;
	}	
	
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Integer getPrecoUnitario() {
		return precoUnitario;
	}
	
	public Integer getqtdEstoq() {
		return qtdEstoq;
	}
		
	public Integer getCategoId() {
		return categoId;
	}
	
	public String getTipo() {
		return tipo;
	}	
	
	@Override
	public String toString() {
		return String.format("Produto: %d, %s, %s, %s, %s, %s, %s", this.id, this.nome, this.descricao, 
							 this.precoUnitario, this.qtdEstoq, this.categoId, this.tipo);
	}
}
