package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizacaoCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection conexao = criaConexao.recuperarConexao();
		
		Statement stm = conexao.createStatement();
		stm.execute("UPDATE COMEX.categoria SET NOME ='LIVROS TÉCNICOS'WHERE nome = 'LIVROS'");
//		"UPDATE COMEX.CATEGORIA SET NOME ='LIVROS TÉCNICOS' WHERE NOME = 'LIVROS'"
		
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Numero de registros alterados: "+linhasModificadas);
	}
}
