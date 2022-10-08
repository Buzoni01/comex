package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class PedidoMaisBaratoEMaisCaro {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidoCsv> leArquivoCsv = leitorPedidosCsv.leArquivoCsv();
		
		ComparadorDePedidos porValor = new ComparadorDePedidos();
		leArquivoCsv.sort(porValor);
		
		double preco = Double.parseDouble(leArquivoCsv.get(0).getPreco());
		double quantidade = Double.parseDouble(leArquivoCsv.get(0).getQuantidade());
		
		System.out.println("Pedido Mais Barato: "+ (preco * quantidade) +" ("+leArquivoCsv.get(0).getProduto()+")");
		System.out.format(new Locale("pt","BR"),"%s R$ %,5.2f %s %s %s %n","Pedido Mais Barato:",(preco * quantidade),"(",leArquivoCsv.get(0).getProduto(),")");;
		System.out.println();
		
		preco = Double.parseDouble(leArquivoCsv.get(leArquivoCsv.size()-1).getPreco());
		quantidade = Double.parseDouble(leArquivoCsv.get(leArquivoCsv.size()-1).getQuantidade());
		
		System.out.println("Pedido Mais Caro  : "+ (preco * quantidade) +" ("+leArquivoCsv.get(leArquivoCsv.size()-1).getProduto()+")");
		System.out.format(new Locale("pt","BR"),"%s R$ %,5.2f %s %s %s %n","Pedido Mais Barato:",(preco * quantidade),"(",leArquivoCsv.get(leArquivoCsv.size()-1).getProduto(),")");;	
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


	