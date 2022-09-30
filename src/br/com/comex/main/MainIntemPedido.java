package br.com.comex.main;

import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.EnumTipoDesconto;

public class MainIntemPedido {

	public static void main(String[] args) {
		ItemPedido c01 = new ItemPedido(ItemPedido.getItensPed(),100.00, 11, "Notebook ", 1, EnumTipoDesconto.QUANTIDADE);
		ItemPedido c02 = new ItemPedido(ItemPedido.getItensPed(),100.00, 1, "Mouse USB", 1, EnumTipoDesconto.PROMOCAO);
		ItemPedido c03 = new ItemPedido(ItemPedido.getItensPed(),100.00, 12, "MacBook X", 1, EnumTipoDesconto.NENHUM);

		System.out.println("Produto   | Preço s/ Desconto | Desconto | Preço c/ Desconto |");		
		System.out.println(c01.toString());
		System.out.println(c02.toString());
		System.out.println(c03.toString());     
	}
}
