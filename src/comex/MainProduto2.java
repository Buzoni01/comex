package comex;

public class MainProduto2 {
	public static void main(String[] args) { 
		System.out.println("---------  ESTOQUE  ------------"); 
		ProdutoIsento produtoisento = new ProdutoIsento();
		Produto produto = new Produto();
		for(int id = 1; id <= 3; id++) {
		    if(id == 1) {
		    	produto.setId(id);
		    	produto.setNome("Notebook Samsung");
			    produto.setDescricao("Core i5, ssd de 1 Tera.");
			    produto.setPrecounitario(3523.0);
			    produto.setQtdestoque(1);
				produto.setCategoria("Informática");
				produto.calculaValorEstoque(produto.getPrecounitario());
		    } else { 	
		    	if(id == 2) { 
		    		produto.setId(id);
			    	produto.setNome("Clean Architecture");
				    produto.setDescricao("1500 folhas");
				    produto.setPrecounitario(102.9);
				    produto.setQtdestoque(2);
					produto.setCategoria("Livros");
					produto.calculaValorEstoque(produto.getPrecounitario());
		       } else {
		    	    if(id == 3) { 
		    	    	produto.setId(id);
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
		    		produto.getPrecounitario()+ " | Imposto: "+ (produtoisento.calculaImposto()+ ") -- " +
		    		produto.getQtdestoque()+ " -- " +
		    		produto.getCategoria()));
		}
		System.out.println(" ");
		System.out.println("Valor Total em Estoque: " + produto.getSoma());
		
	}
}



/*		System.out.println("Categoria: " + 
produto.getId() + " -- " +
produto.getNome()+ " -- " +
produto.getDescricao()+ " -- (Preço: " +
//produto.getPrecounitario()+ " | Imposto: "+ (produto.getPrecounitario() * 40 /100) + ") -- " +
//produto.getPrecounitario()+ " | Imposto: "+ (produtoisento.calculaImposto(produtoisento.getPrecounitario())+ ") -- " +
produto.getQtdestoque()+ " -- " +
produto.getCategoria());


	    System.out.println(produto.calculaImposto(100.0));    
	    
	    
	    
//	    double xy = produto.getPrecounitario(); 
//	double xx = produto.calcImp(xy);
	
//    vimposto = produto.calcImp(100.0);
    
//	System.out.println(xy);
//	System.out.println(produto.calcImp(xy));
*/	
/*		Produto produto = new Produto();
produto.setId(1);
produto.setNome("Notebook Samsung");
produto.setDescricao("Core i5, ssd de 1 Tera.");
produto.setPrecounitario(3523.0);
produto.setQtdestoque(1);
produto.setCategoria("Informática");
produto.calculaValorEstoque(produto.getPrecounitario());

System.out.println(produto.calculaImposto());




}
}
*/ 