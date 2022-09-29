package br.com.comex.main;

import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoIsento;

public class MainProduto {
	public static void main(String[] args) {
		System.out.println("---------  ESTOQUE  ------------"); 
		/**
		 * @author claudinei.buzoni
		 * 
		 * Para testar as consistências exigidas pelo exercício, basta trocar
		 * os valores nos Produtos criados abaixo:
		 */
		Produto produto  = new ProdutoIsento(1, "Notebook Samsung", "Core i5, ssd de 1 Tera.", 3523.0, 1, "Informática");
		produto.calculaValorEstoque((produto.getPrecounitario()*produto.getQtdestoque()));

		Produto produto2 = new Produto(2, "Clean Architecture", "1500 folhas",102.9, 2, "Livros");			
		produto2.calculaValorEstoque((produto2.getPrecounitario()*produto2.getQtdestoque()));

		Produto produto3 = new ProdutoIsento(3, "Monitor Dell 27", "Com HDMI", 1889.0, 3, "Informática");
		produto3.calculaValorEstoque((produto3.getPrecounitario()*produto3.getQtdestoque()));

		System.out.println(produto.toString());
		System.out.println(produto2.toString());
		System.out.println(produto3.toString());		

		System.out.println();
		System.out.println("Valor Total em Estoque: " + Produto.getSoma());		
	}
}
