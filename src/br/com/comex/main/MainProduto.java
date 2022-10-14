package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.main.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;
//import br.com.comex.modelo.CrudProduto;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoIsento;

public class MainProduto {
	public static void main(String[] args) throws SQLException {
		System.out.println("---------  ESTOQUE  ------------"); 	
		Produto produto  = new ProdutoIsento(1, "Notebook Samsung", "Core i5, ssd de 1 Tera.", 3523.0, 360, "Informática");
//		Conta novaConta = new Conta(345L, "3321-9", "Dani", new BigDecimal("1500"));

//		Connection conexao = new ConnectionFactory().getConnection();
		try(Connection conexao = new ConnectionFactory().recuperarConexao()){
//			ContaDao contaDao = new ContaDao(conexao);			
            ProdutoDAO produtoDAO = new ProdutoDAO(conexao);
            produtoDAO.Inserir(produto);
//            conexao.close();            
            
//            contaDao.insere(novaConta);            
            
//            List<Produto> listaDeProdutos = produtoDAO.listar();
 //           listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		}
		System.out.println(produto);
	}
}








		
		
		//		produto.calculaValorEstoque((produto.getPrecounitario()*produto.getQtdestoque()));
//
//		Produto produto2 = new Produto(2, "Clean Architecture", "1500 folhas",102.9, 2, "Livros");			
//		produto2.calculaValorEstoque((produto2.getPrecounitario()*produto2.getQtdestoque()));
//
//		Produto produto3 = new ProdutoIsento(3, "Monitor Dell 27", "Com HDMI", 1889.0, 3, "Informática");
//		produto3.calculaValorEstoque((produto3.getPrecounitario()*produto3.getQtdestoque()));
//
//		System.out.println(produto.toString());
//		System.out.println(produto2.toString());
//		System.out.println(produto3.toString());		
//
//		System.out.println();
//		System.out.println("Valor Total em Estoque: " + Produto.getSoma());		
