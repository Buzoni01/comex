package br.com.comex.main;

import br.com.comex.modelo.Categoria;

public class MainCategoria {
	public static void main(String[] args) {
		/**
		 * @author claudinei.buzoni
		 * 
		 * Para testar as consistências exigidas pelo exercício, basta trocar
		 * os valores nas Categorias criadas abaixo:
		 */
		Categoria cat1 = new Categoria("INFORMATICA");
		Categoria cat2 = new Categoria("MOVEIS","INATIVA");		
		Categoria cat3 = new Categoria("LIVROS","ATIVA");
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		System.out.println(cat3.toString());
	}
}
