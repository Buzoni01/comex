package comex;

public class Pedido {
	private int id;
	private String data;
	private String cliente;
	private static int qtdPedidos = 1;

	public Pedido(int id, String data, String cliente) {
		Pedido.qtdPedidos++;
		this.id = id;
		this.data = data;
		this.cliente = cliente;
	}
	public static int getPedidos() {
		return Pedido.qtdPedidos;
	}

	 
	//****** SETs e GETs  ****	
	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}
	// FIM SETs e GETs	
}
