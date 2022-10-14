package br.com.comex.modelo;

public class Categoria { 
    private int id; 
	private String nome;
    private String Status;
    private static int qtdCategoria;  /* Quando crio uma Variável do tipo static, ela se torna uma 
                                         variável da classe e não de cada instância, como as demais.
                                         e ela é compartilhada entre as instâncias. */
	
    public Categoria(String nome) {
  	
    	if (nome.length() <=3 ){throw new IllegalArgumentException("Nome não pode ter menos que 3 caracteres.");}
    	if (Character.isDigit(nome.charAt(0))){throw new IllegalArgumentException("0 1o. Digito do Nome não pode ser um número.");}    	
    	else this.nome = nome;	
    	
    	this.Status = "ATIVA";
    	Categoria.qtdCategoria++; 
    }
    public Categoria(String nome, String status) {
    	if (nome.length() <=3 ){throw new IllegalArgumentException("Nome não pode ter menos que 3 caracteres.");}
    	else this.nome = nome;  
    	
    	this.Status = status;    	
    }
    
    
    public static int getCategoria() { // Observe que este método é static e então ele se torna um
        return Categoria.qtdCategoria; // método da classe, assim como a variável qtdCategoria.
    }                                  // Ele trás informações estaticas da classe e não de cada 
                                       // instância.
    
	@Override
	public String toString() {
		return "Categoria: " + getNome()  + " ("  + 
                 			   getId()    + " - " +
                 			   getStatus()+ ")";
	}	
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
 		this.Status = status;
	}
}
