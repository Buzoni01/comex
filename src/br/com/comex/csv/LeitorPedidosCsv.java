package br.com.comex.csv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorPedidosCsv {
	public List<PedidoCsv> leArquivoCsv() throws FileNotFoundException {
		List<PedidoCsv> pedidos = new ArrayList<PedidoCsv>();

		// InputStream é um fluxo de entrada de dados abstrato, que pode ser de qualquer
		// coisa, teclado, arquivo, url, etc.,
		// mas na linha abaixo vai apontar para um arquivo através de seu método
		// FileInputStream(),
		InputStream xinputstream = new FileInputStream("pedidos.csv");

		// Scanner faz a leitura do arquivo apontado.
		Scanner xscanner = new Scanner(xinputstream);

		xscanner.nextLine();
		while(xscanner.hasNextLine()) {
	    	String linha = xscanner.nextLine();
			String[] valores = linha.split(",");	
	        String categoria = valores[0];
	        String produto = valores[1];
	        String cliente = valores[5];
	        String preco = valores[2];
	        String quantidade = valores[3];
	        String data = valores[4];
       
	        PedidoCsv pedido = new PedidoCsv(categoria, produto, cliente, preco, quantidade, data);
	        pedidos.add(pedido);
		}		
		return pedidos;
	}
}
