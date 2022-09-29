package br.com.comex.main;

public class MainTestaValidacao {

	public static void main(String[] args) {
		public class teste {
			private String nome;
			private String cpf;
			private String telefone;
			
			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public teste (String nome, String cpf, String telefone) {
				
				if(nome.startsWith("0") || nome.startsWith("1") || nome.startsWith("2") || nome.startsWith("3") || nome.startsWith("4") ||
						nome.startsWith("5") || nome.startsWith("6") || nome.startsWith("7") || nome.startsWith("8") || nome.startsWith("9")) {
//				if(!nome.matches("^[0-9]{1}")) {	
				throw new IllegalArgumentException("O nome nao pode comecar com numeros");}
				else {
					this.nome = nome;
				}
				
				if(!cpf.matches("[0-9]{11}")) {
					throw new IllegalArgumentException("O cpf está incorreto");
				}else {
					String cpf1 = cpf.substring(0,3);
					String cpf2 = cpf.substring(3,6);
					String cpf3 = cpf.substring(6,9);
					String cpf4 = cpf.substring(9,11);
					
					cpf = cpf1+"."+cpf2+"."+cpf3+"-"+cpf4;
				}
				
				if(!telefone.matches("[0-9]{11}")) {
					throw new IllegalArgumentException("O telefone está incorreto");
				}else {
					String tel1 = telefone.substring(0,2);
					String tel2 = telefone.substring(2,3);
					String tel3 = telefone.substring(3,7);
					String tel4 = telefone.substring(7,11);
					
					telefone = "("+tel1+") "+tel2+" "+tel3+"-"+tel4;
				}
				
				this.cpf = cpf;
				this.telefone = telefone;
			}

			public String getCpf() {
				return cpf;
			}

			public void setCpf(String cpf) {
				this.cpf = cpf;
			}

			public String getTelefone() {
				return telefone;
			}

			public void setTelefone(String telefone) {
				this.telefone = telefone;
			}

			@Override
			public String toString() {
				return "teste nome = "+getNome() +", cpf = " + getCpf() + ", telefone = " + getTelefone() + " .";
			}
			
		}

	}

}
