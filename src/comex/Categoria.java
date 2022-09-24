package comex;

public class Categoria {
    private int id;
	private String nome;
    private String Status;
    private static int qtdCategoria;  /* Quando crio uma Variável do tipo static, ela se torna uma 
                                         variável da classe e não de cada instância, como as demais.
                                         e ela é compartilhada entre as instâncias. */
	
    public Categoria() {            // Esse é o construtor, ele tem exatamente o mesmo nome que
    	Categoria.qtdCategoria++;   // a classe e no caso utilizo para contar o número de  
    }                               // categorias que serão criadas e guardar em qtdCategoria.
                                    // Ele também é enxergado por todas as estância.
    
    public static int getCategoria() { // Observe que este método é static e então ele se torna um
        return Categoria.qtdCategoria; // método da classe, assim como a variável qtdCategoria.
                                       // Ele trás informações estaticas da classe e não de cada 
                                       // instância.        
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
		Status = status;
	}
}
