package br.com.comex.modelo;

public class ItemPedido {
	private int id;
	private double precoProdutoNoPedido;
	private int quantidadeNoPedido;
	private String nomeProduto;
	private int numeroPedido;
	private double desconto;
	private TipoDesconto tipoDesconto;
	private static int qtdItens = 1;
	
	public ItemPedido(int itens, double precoProdutoNoPedido, int quantidadeNoPedido, String nomeProduto,
			          int numeroPedido, TipoDesconto tipoDesconto) {
		ItemPedido.qtdItens++;
		this.id = itens;
		this.precoProdutoNoPedido = precoProdutoNoPedido;
		this.quantidadeNoPedido = quantidadeNoPedido;
		this.nomeProduto = nomeProduto;
		this.numeroPedido = numeroPedido;
		this.tipoDesconto = tipoDesconto;			
	}
	public static int getItensPed() {
		return ItemPedido.qtdItens;
	}
	
	
	public double precoTotalSemDesconto() {
		return getPrecoProdutoNoPedido() * getQuantidadeNoPedido();
	}

	public double calculaDesconto(double totalDesconto) {
		if (tipoDesconto == TipoDesconto.PROMOCAO) {
			totalDesconto = (getPrecoProdutoNoPedido() * getQuantidadeNoPedido()) * 0.2;
		}

		else if (tipoDesconto == TipoDesconto.QUANTIDADE)
			if(getQuantidadeNoPedido()>10){
			totalDesconto = (getPrecoProdutoNoPedido() * getQuantidadeNoPedido()) * 0.1;

		} else
			return 0;

		return totalDesconto;
	}
	public double precoTotalComDesconto(double totalComDesconto) {
		totalComDesconto = precoTotalSemDesconto() - calculaDesconto(0);
		return totalComDesconto;
	}

	
	//****** SETs e GETs  ****	
	public int getId() {
		return id;
	}

	public double getPrecoProdutoNoPedido() {
		return precoProdutoNoPedido;
	}

	public int getQuantidadeNoPedido() {
		return quantidadeNoPedido;
	}
  
	public String getNomeProduto() {
		return nomeProduto;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public double getDesconto() {
		return desconto;
	}
	// FIM SETs e GETs
}
