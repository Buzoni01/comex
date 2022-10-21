package br.com.comex.modelo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Produto {
	private int id;
	private String nome;
    private String descricao;
    private BigDecimal precounitario;
    private int qtdestoque;     
	private int categoria;   
 	private EnumTipoIsento tipo;
	private static int qtdProdutos;
	
	public Produto(){
		super();
	}
	public Produto(String nome, String descricao, BigDecimal precounitario, int qtdestoque, int categoria,  EnumTipoIsento tipo) {
        super();
		if (nome.length() <=5 ){throw new IllegalArgumentException("Nome não pode ter menos que 5 caracteres.");}
		if (Character.isDigit(nome.charAt(0))){throw new IllegalArgumentException("0 1o. Digito do Nome não pode ser um número.");}
		else this.nome = nome;

        this.descricao = descricao;
        
    	if (precounitario.doubleValue() <= 0){throw new IllegalArgumentException("Preço Unitário não pode ser menor ou igual a zero.");}
    	else this.precounitario = precounitario;		
    	
    	if (qtdestoque <= 0){throw new IllegalArgumentException("Quantidade em Estoque não pode ser menor ou igual a zero.");}
    	else this.qtdestoque = qtdestoque;   	
     	
    	if (categoria <= 0 ){throw new IllegalArgumentException("Categoria não pode ficar vazio.");}
    	else this.categoria = categoria;

    	this.tipo = tipo;
    	Produto.qtdProdutos++; 
	}
	
	
	
	public Produto(String nome, String descricao, BigDecimal precounitario, int qtdestoque, int categoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.precounitario = precounitario;
		this.qtdestoque = qtdestoque;
		this.categoria = categoria;
	}
	
	//****** SETs e GETs  **********
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id <= 0){throw new IllegalArgumentException("Id não pode ser menor ou igual a zero.");}
		else this.id = id;		
	}/******************************/
	
	
	
	/*******************************/
	public String getNome() {
		return nome;
    }
	public void setNome(String nome) {
		if (nome.length() <=5 ){throw new IllegalArgumentException("Nome não pode ter menos que 5 caracteres.");}
		else this.nome = nome;		
	}/******************************/
	
	
	
	/*******************************/
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}/******************************/
	
	
	
	/*******************************/
	public BigDecimal getPrecounitario() {
		return precounitario;
	}		
	public void setPrecounitario(BigDecimal precounitario) {
		if (precounitario.doubleValue() <= 0){throw new IllegalArgumentException("Preço Unitário não pode ser menor ou igual a zero.");}
		else this.precounitario = precounitario;
	}/******************************/
	
	

	/*******************************/
	public int getQtdestoque() {
		return qtdestoque;
	}
	public void setQtdestoque(int qtdestoque) {
		if (qtdestoque <= 0){throw new IllegalArgumentException("Quantidade em Estoque não pode ser menor ou igual a zero.");}
		else this.qtdestoque = qtdestoque;
	}/******************************/
	
	
	
	/*******************************/
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}/*******************************/
	
	
	
	
	/*******************************/
	public EnumTipoIsento getTipo() {
		return tipo;
	}	
	public void setTipo(EnumTipoIsento tipo) {
		this.tipo = tipo;

	}/******************************/
	
	

	public static int getProdutos() {
		return Produto.qtdProdutos;
	}	
	public static double getSoma() {
		return soma;
	}	
		
//****** FIM dos GETs e SETs  ********** 
	

	
	private static double soma;
	public void calculaValorEstoque(double valor) {
		Produto.soma = (Produto.soma + valor);
	}
	
	public BigDecimal calculaImposto() {	
	    if (this.tipo == EnumTipoIsento.NAO_ISENTO)
	    {
		   BigDecimal imposto = this.precounitario.multiply(new BigDecimal(0.4));
		   return imposto;
		}else
			return new BigDecimal(0);		
	}

	@Override
	public String toString() {
		return "Produto: "   +getId()           +" -- "        +getNome()          +" -- " +getDescricao()+
			   " -- (Preço: "+getPrecounitario()+" | Imposto: "+(calculaImposto()) +") -- "+getQtdestoque()+
			   " -- "        +getCategoria();
	}	
}