package br.com.comex.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.ConnectionFactory;
 
public class Teste {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection conexao = criaConexao.recuperarConexao();
		
		Statement stm = conexao.createStatement();
	
		stm.execute("SELECT * FROM COMEX.categoria");
		
		ResultSet resultado = stm.getResultSet();
		while(resultado.next()) {
			Integer id = resultado.getInt("ID");
			String nome = resultado.getString("NOME");
			String status = resultado.getString("STATUS");
			System.out.println("ID:"+id+" -- Categoria: "+nome+" --  Status: "+status);
		}
	}
}
