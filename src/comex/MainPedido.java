package comex;
 
public class MainPedido {
	public static void main(String[] args) {
 
		Pedido ped1 = new Pedido(Pedido.getPedidos(), "21-09-2022", "Gabi Ruta");
		Pedido ped2 = new Pedido(Pedido.getPedidos(), "21-09-2022", "Eli Zangela");
		Pedido ped3 = new Pedido(Pedido.getPedidos(), "21-09-2022", "Ana Maria");
		Pedido ped4 = new Pedido(Pedido.getPedidos(), "22-09-2022", "Gabi Ruta");
		Pedido ped5 = new Pedido(Pedido.getPedidos(), "22-09-2022", "Ana Maria");

		System.out.println("Pedido: " + ped1.getId() + ", Cliente: " + ped1.getCliente()
				+ ", Data: " + ped1.getData() + ".");
		System.out.println("Pedido: " + ped2.getId() + ", Cliente: " + ped2.getCliente()
				+ ", Data: " + ped2.getData() + ".");
		System.out.println("Pedido: " + ped3.getId() + ", Cliente: " + ped3.getCliente()
				+ ", Data: " + ped3.getData() + ".");
		System.out.println("Pedido: " + ped4.getId() + ", Cliente: " + ped4.getCliente()
				+ ", Data: " + ped4.getData() + ".");
		System.out.println("Pedido: " + ped5.getId() + ", Cliente: " + ped5.getCliente()
				+ ", Data: " + ped5.getData() + ".");
	}
}
