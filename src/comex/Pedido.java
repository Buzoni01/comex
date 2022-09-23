package comex;

public class Pedido {
	private int id;
	private String data;
	private String cliente;

	public Pedido(int id, String data, String cliente) {
		this.id = id;
		this.data = data;
		this.cliente = cliente;

	}

	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

}
