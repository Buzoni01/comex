package br.com.comex.modelo;

public class Cliente {
	private int id;
	private String nomeCompleto;
	private String cpf;
	private String numeroCelular;
	private String rua;
	private String numeroRua;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private static int qtdClientes = 1;
	
	public Cliente(int id, String nomecompleto, String cpf, String numerocelular, String rua, String numerorua,
			String complemento, String bairro, String cidade, String estado) {

		if (id <= 0){throw new IllegalArgumentException("Id não pode ser menor ou igual a zero.");}
    	else this.id = id;
		
		if (nomecompleto.length() <=5 ){throw new IllegalArgumentException("Nome não pode ter menos que 6 caracteres.");}
    	else this.nomeCompleto = nomecompleto;		
		
		if (cpf.length() < 11 | cpf.length() > 14){throw new IllegalArgumentException("Cpf tem que conter de 11 a 14 digitos.");}
    	else this.cpf = cpf;
			
		if (numerocelular.length() != 0 && (numerocelular.length() < 11 | numerocelular.length() > 16)){throw new IllegalArgumentException("Celular tem que conter de 11 a 16 digitos.");}
    	else this.numeroCelular = numerocelular;

		if (rua.length() <=5 ){throw new IllegalArgumentException("Rua não pode ter menos que 6 caracteres.");}
    	else this.rua = rua;
		
		if (numerorua.length() <=1 ){throw new IllegalArgumentException("Rua não pode ter menos que 2 caracteres.");}
    	else this.numeroRua = numerorua;
		
		this.complemento = complemento;
		
		if (bairro.length() <=1 ){throw new IllegalArgumentException("Bairro não pode ter menos que 2 caracteres.");}
    	else this.bairro = bairro;
		
		if (cidade.length() <=1 ){throw new IllegalArgumentException("Cidade não pode ter menos que 2 caracteres.");}
    	else this.cidade = cidade;

		if (estado.length() != 2 ){throw new IllegalArgumentException("Estado deve ter exatamente 2 digitos.");}
    	else this.estado = estado;
				
		Cliente.qtdClientes++;
		System.out.println("Cliente: " + this.nomeCompleto + " ID: " + id + " Status: (Cadastrado).");  
	}
 
	
	public static int getClientes() {
		return Cliente.qtdClientes;
	}

	@Override
	public String toString() {
		return "Cliente ID: " + getId()        + " | Nome: "        + getNomeCompleto()  +
			   " | CPF: "     + getCpf()       + " | Celular: "     + getNumeroCelular() +
			   " | Estado: "  + getEstado()    + " | Cidade: "      + getCidade()        +
			   " | Bairro: "  + getBairro()    + " | Rua: " 	    + getRua()           +
			   " | Numero: "  + getNumeroRua() + " | Complemento: " + getComplemento();		
	}	
		
		
	 
	//****** SETs e GETs  ****	
	public int getId() {
		return id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getCpf() {
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
