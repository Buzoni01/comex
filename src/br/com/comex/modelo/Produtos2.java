package br.com.comex.modelo;

public class Produtos2 {	
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setId(1);
    	produto.setNome("Notebook Samsung");
	    produto.setDescricao("Core i5, ssd de 1 Tera.");
	    produto.setPrecounitario(3523.0);
	    produto.setQtdestoque(1);
		produto.setCategoria("Informática");
		produto.calculaValorEstoque(produto.getPrecounitario());
	    	
		
		produto.setId(2);
    	produto.setNome("Clean Architecture");
	    produto.setDescricao("1500 folhas");
	    produto.setPrecounitario(102.9);
	    produto.setQtdestoque(2);
		produto.setCategoria("Livros");
		produto.calculaValorEstoque(produto.getPrecounitario());
		
		
		produto.setId(3);
    	produto.setNome("Monitor Dell 27");
	    produto.setDescricao("Com HDMI");
	    produto.setPrecounitario(1889.0);
	    produto.setQtdestoque(3);
		produto.setCategoria("Informática");
		produto.calculaValorEstoque(produto.getPrecounitario());
		
		
		System.out.println("Valor Total em Estoque: " + produto.getSoma());
		
		
		
	}

}
