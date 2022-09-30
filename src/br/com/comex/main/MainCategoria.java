package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.EnumCategStatus;

public class MainCategoria {
	public static void main(String[] args) {
		/**
		 * @author claudinei.buzoni
		 * 
		 * Para testar as consistências exigidas pelo exercício, basta trocar
		 * os valores nas Categorias criadas abaixo:
		 */
		Categoria cat1 = new Categoria(1,"INFORMÁTICA");
		Categoria cat2 = new Categoria(2,"MÓVEIS",EnumCategStatus.INATIVA);		
		Categoria cat3 = new Categoria(3,"LIVROS",EnumCategStatus.ATIVA);
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		System.out.println(cat3.toString());
	}
}
