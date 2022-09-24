package comex;

public class MainIntemPedido {

	public static void main(String[] args) {
		ItemPedido c01 = new ItemPedido(ItemPedido.getItensPed(),100.00, 11, "Notebook ", 1, TipoDesconto.QUANTIDADE);
		ItemPedido c02 = new ItemPedido(ItemPedido.getItensPed(),100.00, 1, "Mouse USB", 1, TipoDesconto.PROMOCAO);
		ItemPedido c03 = new ItemPedido(ItemPedido.getItensPed(),100.00, 12, "MacBook X", 1, TipoDesconto.NENHUM);
		  
		System.out.println("Produto    | Preço s/ Desconto | Desconto | Preço c/ Desconto |");
		System.out.print(c01.getNomeProduto()+"  |            ");
		System.out.print(c01.precoTotalSemDesconto()+" |    ");
		System.out.print(c01.calculaDesconto(0)+" |             ");
		System.out.println(c01.precoTotalComDesconto(0)+" |");     
		
		System.out.print(c02.getNomeProduto()+"  |             ");
		System.out.print(c02.precoTotalSemDesconto()+" |     ");
		System.out.print(c02.calculaDesconto(0)+" |              ");
		System.out.println(c02.precoTotalComDesconto(0)+" |");     

		System.out.print(c03.getNomeProduto()+"  |            ");
		System.out.print(c03.precoTotalSemDesconto()+" |      ");
		System.out.print(c03.calculaDesconto(0)+" |            ");
		System.out.print(c03.precoTotalComDesconto(0)+" |");     
	}
}
