package comex;

public class MainCategoria {

	public static void main(String[] args) {
		Categoria categoria = new Categoria();
		
		for(int id = 1; id <= 3; id++) {
		    if(id == 1) {
		       categoria.setId(id);
			   categoria.setNome("INFORMÁTICA");
			   categoria.setStatus("ATIVA");
		    } else { 	
		    	if(id == 2) { 
		    	   categoria.setId(id);
				   categoria.setNome("MÓVEIS");
				   categoria.setStatus("INATIVA");
		        } else {
		    	    if(id == 3) { 
			    	   categoria.setId(id);
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
