package br.com.comex.modelo;

public class Teste3 {

}
/***********/
package br.com.comex.modelo;

import java.math.BigDecimal;

public class XProduto {
    private int id;    
 	private String nome;    
 	private String descricao;    
 	private BigDecimal precoUnitario;    
 	private int qtdEstoque;    
 	private Categoria categoria;    
 	private Tipo tipo;

    public XProduto(String nome, BigDecimal precoUnitario, int qtdEstoque, Categoria categoria, Tipo tipo) {
	    super();        
	    if (nome.startsWith("9") || nome.startsWith("8") || nome.startsWith("7") || nome.startsWith("6")
	    		                 || nome.startsWith("5") || nome.startsWith("4") || nome.startsWith("3") 
	    		                 || nome.startsWith("2") || nome.startsWith("1") 
	    		                 || nome.startsWith("0")) {throw new IllegalArgumentException("Nome Invalido, nao pode comecar com NUMERO");}

        if (nome.length() < 5) {throw new IllegalArgumentException("Nome do Produto Invalido");} 
        else {this.nome = nome;}
 		if (precoUnitario.doubleValue() <= 0) {throw new IllegalArgumentException("Preco Invalido");} 
 		else {this.precoUnitario = precoUnitario;}
 		if (qtdEstoque <= 0) {throw new IllegalArgumentException("Quantidade Invalida");} 
 		else {this.qtdEstoque = qtdEstoque;}
// this.categoria = categoria;        if (categoria == null) {            throw new IllegalArgumentException("Categoria Invalida");        } else {            this.categoria = categoria;        }

 		this.tipo = tipo;
    }

 
 
    public XProduto(String nome, BigDecimal precoUnitario, int qtdEstoque, Categoria categoria) {
	    super();
	    if (nome.startsWith("9") || nome.startsWith("8") || nome.startsWith("7") || nome.startsWith("6")
	    		                 || nome.startsWith("5") || nome.startsWith("4") || nome.startsWith("3") 
	    		                 || nome.startsWith("2") || nome.startsWith("1") 
	    		                 || nome.startsWith("0")) {throw new IllegalArgumentException("Nome Invalido, nao pode comecar com NUMERO");}

        if (nome.length() < 5) {throw new IllegalArgumentException("Nome do Produto Invalido");} 
        else {this.nome = nome;}        
        if (precoUnitario.doubleValue() <= 0) {throw new IllegalArgumentException("Preco Invalido");} 
        else {this.precoUnitario = precoUnitario;}
        if (qtdEstoque <= 0) {throw new IllegalArgumentException("Quantidade Invalida");}
        else {this.qtdEstoque = qtdEstoque;}
// this.categoria = categoria;        if (categoria == null) {            throw new IllegalArgumentException("Categoria Invalida");        } else {            this.categoria = categoria;        }

        this.tipo = Tipo.NAO_ISENTO;    }

    public int getId() {        
	    return id;    
	}

    public void setId(int id) {        
	    this.id = id;    
	}

    public String getNomeProduto() {
	    return nome;    
	}

    public void setNomeProduto(String nomeProduto) {
	    this.nome = nomeProduto;    
	}

    public String getDescricao() {
	    return descricao;    }

    public void setDescricao(String descricao) {
	    this.descricao = descricao;    
	}

    public BigDecimal getPrecoUnitario() {
	    return precoUnitario;    
	}

    public void setPrecoUnitario(BigDecimal precoUnitario) {
	    this.precoUnitario = precoUnitario;    
	}

    public int getQtdEstoque() {
	    return qtdEstoque;    
	}

    public void setQtdEstoque(int qtdEstoque) {
	    this.qtdEstoque = qtdEstoque;    
	}

    public Categoria getCategoria() {
	    return categoria;    
	}

    public BigDecimal calculaValorTotalEmEstoque() {
	    BigDecimal total = this.precoUnitario.multiply(new BigDecimal(this.qtdEstoque));
	    return total;    
	}

    public BigDecimal calculaImposto() {
	    if (this.tipo == Tipo.NAO_ISENTO){
	       BigDecimal imposto = this.precoUnitario.multiply(new BigDecimal(0.4));
	       return imposto;} 
	    else{
	    	return new BigDecimal(0);}    
	    }

    @Override    
    public String toString() {
	    return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + 
	    	   ", precoUnitario="  + precoUnitario + ", qtdEstoque=" + qtdEstoque + 
	    	   ", categoria=" + categoria + ", tipo=" + tipo + "]";    }
    
}

