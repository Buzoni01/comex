package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;

public class MontanteTotalVendas {
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv arquivoCsv = new LeitorPedidosCsv();
		List<PedidoCsv> listaArquivoCsv = arquivoCsv.leArquivoCsv();

		Double totalDeVendas = 0.;
		for(int i=0; i<listaArquivoCsv.size(); i++) {
			listaArquivoCsv.get(i);
			totalDeVendas = totalDeVendas + (Double.parseDouble(listaArquivoCsv.get(i).getQuantidade())) * (Double.parseDouble(listaArquivoCsv.get(i).getPreco()));
		}
		System.out.println("Montante de Vendas: " + totalDeVendas);
		System.out.format(new Locale("pt","BR"),"%s R$ %,8.2f %n","Montante de Vendas:",totalDeVendas);;
	}
}
