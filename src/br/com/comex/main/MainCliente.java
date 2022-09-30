package br.com.comex.main;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EnumEstado;

public class MainCliente {

	public static void main(String[] args) {
//id = 0:
//		Cliente cli1 = new Cliente(1,"Ana Maria","99999999988","11947491111","AV Faria Lima","60","Sobrado",
//		"Pinheiros","Foz do Iguaçu",EnumEstado.ES);
//		Cliente cli2 = new Cliente(2,"Eli Zangela","88888888877","11947492222","AV Francisco Morato","145","Casa",
//		"Centro","Santo André",EnumEstado.PR);
		
		//Testa id diferente de zero:
		Cliente cli3 = new Cliente(1,"Gabi Ruta","77777777766","11947493333","AV Siumare","1815","Apto.75","Pacaembu","São Paulo",EnumEstado.SP);
//Testa nome maior que 5 caracteres:
		//Cliente cli3 = new Cliente(3,"Gabi","77777777766","(11)947493333","AV Siumare","1815","Apto.75","Pacaembu","São Paulo","SP");
//Testa cpf obrigatório, de 11 a 14 caracteres:
		//Cliente cli3 = new Cliente(3,"Gabi Ruta","777777777","(11)947493333","AV Siumare","1815","Apto.75","Pacaembu","São Paulo","SP");
//Testa telefone, opcional mas se tiver preenchido, de 11 a 16 caracteres:
		//Cliente cli3 = new Cliente(3,"Gabi Ruta","77777777766","947493333","AV Siumare","1815","Apto.75","Pacaembu","São Paulo","SP");
//Testa rua, obrigatório, maior que 5 caracteres:
		//Cliente cli3 = new Cliente(3,"Gabi Ruta","77777777766","(11)947493333","AV S","1815","Apto.75","Pacaembu","São Paulo","SP");
//Testa número, obrigatório, maior que 1 caracteres:
		//Cliente cli3 = new Cliente(3,"Gabi Ruta","77777777766","(11)947493333","AV Sumaré","1","Apto.75","Pacaembu","São Paulo","SP");
//Testa bairro, obrigatório, maior que 1 caracteres:
		//Cliente cli3 = new Cliente(3,"Gabi Ruta","77777777766","(11)947493333","AV Sumaré","1815","Apto.75","P","São Paulo","SP");
//Testa cidade, obrigatório, maior que 1 caracteres:
		//Cliente cli3 = new Cliente(3,"Gabi Ruta","77777777766","(11)947493333","AV Sumaré","1815","Apto.75","Pacaembu","S","SP");
//Testa estado, obrigatório, exatamente 2 caracteres:
		//Cliente cli3 = new Cliente(3,"Gabi Ruta","77777777766","(11)947493333","AV Sumaré","1815","Apto.75","Pacaembu","São Palo","S");

		System.out.println(" ");
		
//		System.out.println(cli1.toString());
//		System.out.println(cli2.toString());
		System.out.println(cli3.toString());
	}
}
