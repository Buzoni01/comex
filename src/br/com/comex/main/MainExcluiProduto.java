package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainExcluiProduto {
	public static void main(String[] args) throws SQLException {
		long id = 469;
		ConnectionFactory criaConexao = new ConnectionFactory();
		try(Connection conexao = criaConexao.recuperarConexao()){
			String sql = "DELETE FROM comex.PRODUTO WHERE ID = ?";
			try(PreparedStatement stm = conexao.prepareStatement(sql);){
				stm.setLong(1, id);
				stm.execute();
				System.out.println("ID do Produto Excluido: " + id);	
			}
		};
	}
}		
