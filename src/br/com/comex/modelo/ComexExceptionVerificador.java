package br.com.comex.modelo;

public class ComexExceptionVerificador {
	private int id;
	private String nome;
	private StatusCateg status;

	public ComexExceptionVerificador(int id, String nome) {
		if (id <= 0){throw new ComexException("ID deve ser maior que zero.");}
		else{this.id = id;}
		
		if (nome.length() <= 3){throw new ComexException("Nome deve ter mas que três digitos.");}
		else{this.nome = nome;}
		this.status = StatusCateg.ATIVO;
	}

	public ComexExceptionVerificador(int id, String nome, StatusCateg status) {
		if (id <= 0){throw new ComexException("ID deve ser maior que zero.");}
		else{this.id = id;}
		
		if (nome.length() <= 3){throw new ComexException("Nome deve ter mas que três digitos.");}
		else{this.nome = nome;}
		
		if (status == null){throw new ComexException("O Status da Categoria é obrigatório.");}
		else{this.status = status;}
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

	public StatusCateg getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Categoria " 
				+ getNome() + " ( " 
				+ getId() + " - " 
				+ getStatus() + " ). ";
	}
}
