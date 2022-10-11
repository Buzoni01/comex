package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
 
import br.com.comex.modelo.ConnectionFactory;


public class MainTestaConexao {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection conexao = criaConexao.recuperarConexao();
		
		
		System.out.println("Conexão efetuada com sucesso");
		
		Statement stm = conexao.createStatement();
		boolean resultado = stm.execute("select * from COMEX.categoria");
		
		System.out.println(resultado);
		
		conexao.close();
		System.out.println("Conexão Fechada com sucesso");
	}
}