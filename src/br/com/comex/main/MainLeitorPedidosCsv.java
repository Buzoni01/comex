package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;


public class MainLeitorPedidosCsv {
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv arquivoCsv = new LeitorPedidosCsv();
		List<PedidoCsv> listaArquivoCsv = arquivoCsv.leArquivoCsv();
		System.out.println("Total de pedidos: "+listaArquivoCsv.size());
	}
}
