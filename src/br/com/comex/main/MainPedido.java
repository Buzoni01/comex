package br.com.comex.main;

import br.com.comex.modelo.Pedido;

public class MainPedido {
	public static void main(String[] args) {
  
		Pedido ped1 = new Pedido(Pedido.getPedidos(), "21-09-2022", "Gabi Ruta");
		Pedido ped2 = new Pedido(Pedido.getPedidos(), "21-09-2022", "Eli Zangela");
		Pedido ped3 = new Pedido(Pedido.getPedidos(), "21-09-2022", "Ana Maria");
		Pedido ped4 = new Pedido(Pedido.getPedidos(), "22-09-2022", "Gabi Ruta");
		Pedido ped5 = new Pedido(Pedido.getPedidos(), "22-09-2022", "Ana Maria");
		System.out.println(ped1.toString());
		System.out.println(ped2.toString());
		System.out.println(ped3.toString());
		System.out.println(ped4.toString());
		System.out.println(ped5.toString());
		
		
	}
}
