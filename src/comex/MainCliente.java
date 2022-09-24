package comex;

public class MainCliente {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(Cliente.getClientes(), 999999999, "(11)947491111", "Ana Maria", "AV Faria Lima", "60", "Sobrado",
		"Pinheiros", "Foz do Iguaçu", "ES");
		Cliente cli2 = new Cliente(Cliente.getClientes(), 888888888, "(11)947492222", "Eli Zangela", "AV Francisco Morato", "145", "Casa", "Centro",
		"Santo André", "PR");
		Cliente cli3 = new Cliente(Cliente.getClientes(), 777777777, "(11)947493333", "Gabi Ruta", "AV Siumare", "1815", "Apto.75",
		"Pacaembu", "São Paulo", "SP");
  
		System.out.println(" ");
		System.out.println("Cliente ID: " + cli1.getId() + " | Nome: " + cli1.getNomeCompleto() + " | CPF: "
				+ cli1.getCpf() + " | Celular: " + cli1.getNumeroCelular() + " | Estado: "
				+ cli1.getEstado() + " | Cidade: " + cli1.getCidade() + " | Bairro: " + cli1.getBairro() + " | Rua: "
				+ cli1.getRua() + " | Numero: " + cli1.getNumeroRua() + " | Complemento: "
				+ cli1.getComplemento());
		System.out.println("Cliente ID: " + cli2.getId() + " | Nome: " + cli2.getNomeCompleto() + " | CPF: "
				+ cli2.getCpf() + " | Celular: " + cli2.getNumeroCelular() + " | Estado: "
				+ cli2.getEstado() + " | Cidade: " + cli2.getCidade() + " | Bairro: " + cli2.getBairro() + " | Rua: "
				+ cli2.getRua() + " | Numero: " + cli2.getNumeroRua() + " | Complemento: "
				+ cli2.getComplemento());
		System.out.println("Cliente ID: " + cli3.getId() + " | Nome: " + cli3.getNomeCompleto() + " | CPF: "
				+ cli3.getCpf() + " | Celular: " + cli3.getNumeroCelular() + " | Estado: "
				+ cli3.getEstado() + " | Cidade: " + cli3.getCidade() + " | Bairro: " + cli3.getBairro() + " | Rua: "
				+ cli3.getRua() + " | Numero: " + cli3.getNumeroRua() + " | Complemento: "
				+ cli3.getComplemento());
	}
}
