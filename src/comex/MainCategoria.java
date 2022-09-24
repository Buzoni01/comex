package comex;

public class MainCategoria {
	public static void main(String[] args) {		
		for(int qtd = 1; qtd <= 3; qtd++) {
			Categoria categoria = new Categoria();
		    if(qtd== 1) {
		       categoria.setId(Categoria.getCategoria());
			   categoria.setNome("INFORMÁTICA");
			   categoria.setStatus("ATIVA");
		    } else { 	
		    	if(qtd == 2) { 
		    	   categoria.setId(Categoria.getCategoria());
				   categoria.setNome("MÓVEIS");
				   categoria.setStatus("INATIVA");
		        } else {
		    	    if(qtd == 3) { 
		    	       categoria.setId(Categoria.getCategoria());
					   categoria.setNome("LIVROS");
					   categoria.setStatus("ATIVA");
		            }
		        }
		    }
		System.out.println("Categoria: " + categoria.getNome()  + " ("  + 
										   categoria.getId()    + " - " +
										   categoria.getStatus().toLowerCase()+ ")");
		}
	}
}
