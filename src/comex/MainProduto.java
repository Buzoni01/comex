package comex;

public class MainProduto {
	public static void main(String[] args) {
		System.out.println("---------  ESTOQUE  ------------"); 
		/**
		 * @author claudinei.buzoni
		 * 
		 * Para testar as consistências exigidas pelo exercício, basta trocar
		 * os valores nos Produtos criados abaixo:
		 */
		Produto produto  = new ProdutoIsento(1, "Notebook Samsung", "Core i5, ssd de 1 Tera.", 3523.0, 1, "Informática");
		produto.calculaValorEstoque((produto.getPrecounitario()*produto.getQtdestoque()));

		Produto produto2 = new Produto(2, "Clean Architecture", "1500 folhas",102.9, 2, "Livros");			
		produto2.calculaValorEstoque((produto2.getPrecounitario()*produto2.getQtdestoque()));

		Produto produto3 = new ProdutoIsento(3, "Monitor Dell 27", "Com HDMI", 1889.0, 3, "Informática");
		produto3.calculaValorEstoque((produto3.getPrecounitario()*produto3.getQtdestoque()));
		

		System.out.println("Categoria: " + 
    	    	produto.getId() + " -- " +
		    	produto.getNome()+ " -- " +
			    produto.getDescricao()+ " -- (Preço: " +
			    produto.getPrecounitario()+ " | Imposto: "+ (produto.calculaImposto()) + ") -- " +
			    produto.getQtdestoque()+ " -- " +
				produto.getCategoria());

		System.out.println("Categoria: " + 
    	    	produto2.getId() + " -- " +
		    	produto2.getNome()+ " -- " +
			    produto2.getDescricao()+ " -- (Preço: " +
			    produto2.getPrecounitario()+ " | Imposto: "+ (produto2.calculaImposto()) + ") -- " +
			    produto2.getQtdestoque()+ " -- " +
				produto2.getCategoria());
		
		System.out.println("Categoria: " + 
    	    	produto3.getId() + " -- " +
		    	produto3.getNome()+ " -- " +
			    produto3.getDescricao()+ " -- (Preço: " +
			    produto3.getPrecounitario()+ " | Imposto: "+ (produto3.calculaImposto()) + ") -- " +
			    produto3.getQtdestoque()+ " -- " +
				produto3.getCategoria());
				
		System.out.println();
		System.out.println("Valor Total em Estoque: " + Produto.getSoma());		
	}
}



/* CÓDIGO ANTIGO:
 * 		
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
*/		

