package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;

public class PedidoMaisBaratoEMaisCaro {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidoCsv> leArquivoCsv = leitorPedidosCsv.leArquivoCsv();
		
		ComparadorDePedidos porValor = new ComparadorDePedidos();
		leArquivoCsv.sort(porValor);
		System.out.println("Pedido Mais Barato: "+leArquivoCsv.get(0));
		System.out.println("Pedido Mais Caro  : "+leArquivoCsv.get(leArquivoCsv.size()-1));
	}

}

class ComparadorDePedidos implements Comparator<PedidoCsv> {

	@Override
	public int compare(PedidoCsv p1, PedidoCsv p2) {
		double ValorP1 = Double.parseDouble(p1.getPreco()) * Double.parseDouble(p1.getQuantidade());
		double ValorP2 = Double.parseDouble(p2.getPreco()) * Double.parseDouble(p2.getQuantidade());
		if(ValorP1 == ValorP2 ){
			return 0;
		} else if(ValorP1 > ValorP2 ){
			return 1;
		} else {
		    return -1;
		}
	}
}	


	