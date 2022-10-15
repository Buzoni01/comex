package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TotalCategorias {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv arquivoCsv = new LeitorPedidosCsv();
		List<PedidoCsv> listaArquivoCsv = arquivoCsv.leArquivoCsv();
		Set<String> listaDeCategorias = new HashSet<>();

		for(int i=0; i<listaArquivoCsv.size(); i++) {		
			String categoria = listaArquivoCsv.get(i).getCategoria();
			if(!listaDeCategorias.contains(categoria)) {
			   System.out.println("Categoria : "+listaArquivoCsv.get(i).getCategoria());
			   listaDeCategorias.add(categoria);			
			}
		}
		System.out.println();
		System.out.println("Total de Categorias: " + listaDeCategorias.size());
	}
}
