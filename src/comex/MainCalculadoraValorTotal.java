package comex;

public class MainCalculadoraValorTotal {

	public static void main(String[] args) {
		Produto produto = new Produto();

    	produto.setId(1);
    	produto.setNome("Notebook Samsung");
	    produto.setDescricao("Core i5, ssd de 1 Tera.");
	    produto.setPrecounitario(3523.0);
	    produto.setQtdestoque(1);
		produto.setCategoria("Informática");
	     
   		produto.setId(2);
    	produto.setNome("Clean Architecture");
	    produto.setDescricao("1500 folhas");
	    produto.setPrecounitario(102.9);
	    produto.setQtdestoque(2);
		produto.setCategoria("Livros");
 
    	produto.setId(3);
    	produto.setNome("Monitor Dell 27");
	    produto.setDescricao("Com HDMI");
	    produto.setPrecounitario(1889.0);
	    produto.setQtdestoque(3);
		produto.setCategoria("Informática");
	
		System.out.println("Categoria: " + 
    	    	produto.getId() + " -- " +
		    	produto.getNome()+ " -- " +
			    produto.getDescricao()+ " -- (Preço: " +
			    /*produto.getPrecounitario()+ " | Imposto: "+ (produto.getPrecounitario() * 40 /100) + ") -- " +*/
			    produto.getQtdestoque()+ " -- " +
				produto.getCategoria());
		
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
