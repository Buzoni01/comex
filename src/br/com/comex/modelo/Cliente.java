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
	private EnumEstado estado;
	private static int qtdClientes = 1;
	
	public Cliente(int id, String nomecompleto, String cpf, String numerocelular, String rua, String numerorua,
			String complemento, String bairro, String cidade, EnumEstado estado) {

		if (id <= 0){throw new IllegalArgumentException("Id não pode ser menor ou igual a zero.");}
    	else this.id = id;
		
		if (nomecompleto.length() <=5 ){throw new IllegalArgumentException("Nome não pode ter menos que 6 caracteres.");}
		if (Character.isDigit(nomecompleto.charAt(0))){throw new IllegalArgumentException("0 1o. Digito do Nome não pode ser um número.");}
		this.nomeCompleto = nomecompleto;		
		
		if (!cpf.matches("[0-9]{11}")){throw new IllegalArgumentException("Cpf tem que conter 11 digitos.");}
    	else {
			String cpf1 = cpf.substring(0,3);
			String cpf2 = cpf.substring(3,6);
			String cpf3 = cpf.substring(6,9);
			String cpf4 = cpf.substring(9,11);
			
			cpf = cpf1+"."+cpf2+"."+cpf3+"-"+cpf4;
    		this.cpf = cpf;
		}
		
		if (!numerocelular.matches("[0-9]{11}")){throw new IllegalArgumentException("Celular tem que ser digitado dessa forma: (00) 0 0000-0000.");}
		else {
			String tel1 = numerocelular.substring(0,2);
			String tel2 = numerocelular.substring(2,3);
			String tel3 = numerocelular.substring(3,7);
			String tel4 = numerocelular.substring(7,11);
			
			numerocelular = "("+tel1+") "+tel2+" "+tel3+"-"+tel4; 
			this.numeroCelular = numerocelular;
		}    	

		if (rua.length() <=5 ){throw new IllegalArgumentException("Rua não pode ter menos que 6 caracteres.");}
    	else this.rua = rua;
		
		if (numerorua.length() <=1 ){throw new IllegalArgumentException("Rua não pode ter menos que 2 caracteres.");}
    	else this.numeroRua = numerorua;
		
		this.complemento = complemento;
		
		if (bairro.length() <=1 ){throw new IllegalArgumentException("Bairro não pode ter menos que 2 caracteres.");}
    	else this.bairro = bairro;
		
		if (cidade.length() <=1 ){throw new IllegalArgumentException("Cidade não pode ter menos que 2 caracteres.");}
    	else this.cidade = cidade;

		this.estado = estado;
				
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
			   " | Rua: " 	  + getRua()       + " | Numero: "      + getNumeroRua()     +
			   " | Complemento: " + getComplemento() + " | Bairro: "      + getBairro()  +
			   " | Cidade: "      + getCidade()+ " | Estado: "  + getEstado();		
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

	public EnumEstado getEstado() {
		return estado;
	}

	public void setId(int id) {
		this.id = id;
	}
	// FIM SETs e GETs	
}
