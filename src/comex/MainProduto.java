package comex;

public class MainProduto {
	public static void main(String[] args) {
		System.out.println("---------  ESTOQUE  ------------"); 
		for(int qtd = 1; qtd <= 3; qtd++) {
			Produto produto = new Produto();
		    if(qtd == 1) {
		    	produto.setId(Produto.getProdutos());
		    	produto.setNome("Notebook Samsung");
			    produto.setDescricao("Core i5, ssd de 1 Tera.");
			    produto.setPrecounitario(3523.0);
			    produto.setQtdestoque(1);
				produto.setCategoria("Informática");
				produto.calculaValorEstoque(produto.getPrecounitario());
		    } else { 	
		    	if(qtd == 2) { 
		    		produto.setId(Produto.getProdutos());
			    	produto.setNome("Clean Architecture");
				    produto.setDescricao("1500 folhas");
				    produto.setPrecounitario(102.9);
				    produto.setQtdestoque(2);
					produto.setCategoria("Livros");
					produto.calculaValorEstoque(produto.getPrecounitario());
		        } else {
		    	    if(qtd == 3) { 
		    	    	produto.setId(Produto.getProdutos());
				    	produto.setNome("Monitor Dell 27");
					    produto.setDescricao("Com HDMI");
					    produto.setPrecounitario(1889.0);
					    produto.setQtdestoque(3);
						produto.setCategoria("Informática");
						produto.calculaValorEstoque(produto.getPrecounitario());
		            }
		        }
		    }  
		System.out.println("Categoria: " + 
    	    	produto.getId() + " -- " +
		    	produto.getNome()+ " -- " +
			    produto.getDescricao()+ " -- (Preço: " +
			    produto.getPrecounitario()+ " | Imposto: "+ (produto.getPrecounitario() * 40 /100) + ") -- " +
			    produto.getQtdestoque()+ " -- " +
				produto.getCategoria());
		}
		System.out.println();
		System.out.println("Valor Total em Estoque: " + Produto.getSoma());		
	}
}
