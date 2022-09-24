package comex;

public class Cliente {
	private int id;
	private String nomeCompleto;
	private int cpf;
	private String numeroCelular;
	private String rua;
	private String numeroRua;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private static int qtdClientes = 1;
	

	public Cliente(int id, int cpf, String numeroCelular, String nomeCompeto, String rua, String numeroRua,
			String complemento, String bairro, String cidade, String estado) {
		Cliente.qtdClientes++;
		this.id = id;
		this.cpf = cpf;
		this.nomeCompleto = nomeCompeto;
		this.numeroCelular = numeroCelular;
		this.rua = rua;
		this.numeroRua = numeroRua;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;   
		this.estado = estado;
		System.out.println("Cliente: " + nomeCompeto + " ID: " + id + " Status: (Cadastrado).");  
	}
                     
	public static int getClientes() {
		return Cliente.qtdClientes;
	}
	
	 
	//****** SETs e GETs  ****	
	public int getId() {
		return id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public int getCpf() {
		return cpf;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public String getRua() {
		return rua;
	}

	public String getNumeroRua() {
		return numeroRua;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setId(int id) {
		this.id = id;
	}
	// FIM SETs e GETs	
}
