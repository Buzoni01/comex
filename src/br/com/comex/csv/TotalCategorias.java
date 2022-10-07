package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TotalCategorias {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv arquivoCsv = new LeitorPedidosCsv();
		List<PedidoCsv> listaArquivoCsv = arquivoCsv.leArquivoCsv();
		List<String> listaDeCategorias = new ArrayList<>();

		for(int i=0; i<listaArquivoCsv.size(); i++) {		
			String categoria = listaArquivoCsv.get(i).getCategoria();
			if(!listaDeCategorias.contains(categoria)) {
			   System.out.println("Categoria : "+listaArquivoCsv.get(i).getCategoria());
			   listaDeCategorias.add(categoria);			
			}
		}

	    // FAZER O FOREACH ABAIXO DEPOIS....
		
//		for(int i=0; i<listaArquivoCsv.size(); i++) {		
//		String categoria = listaArquivoCsv.get(i).getCategoria();
//		if(!listaDeCategorias.contains(categoria)) {
//		   System.out.println("Categoria : "+listaArquivoCsv.get(i).getCategoria());
//		   listaDeCategorias.add(categoria);			
//		}
//	}

		System.out.println();
		System.out.println("Total de Categorias: " + listaDeCategorias.size());
	}
}
