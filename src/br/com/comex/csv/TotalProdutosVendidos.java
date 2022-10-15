package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

public class TotalProdutosVendidos {
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv arquivoCsv = new LeitorPedidosCsv();
		List<PedidoCsv> listaArquivoCsv = arquivoCsv.leArquivoCsv();

		int totalProdutosVendidos = 0;
		for(int i=0; i<listaArquivoCsv.size(); i++) {
			totalProdutosVendidos = totalProdutosVendidos + Integer.parseInt(listaArquivoCsv.get(i).getQuantidade());
		}
		System.out.println("Total de produtos vendidos: " + totalProdutosVendidos);
	}				
}