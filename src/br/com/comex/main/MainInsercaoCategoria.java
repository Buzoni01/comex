package br.com.comex.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.ConnectionFactory;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection conexao = criaConexao.recuperarConexao();
		 
		Statement stm = conexao.createStatement();
		stm.execute("INSERT INTO COMEX.categoria (nome, status) VALUES ('INFORMATICA', 'ATIVA')");
		stm.execute("INSERT INTO COMEX.categoria (nome, status) VALUES ('MOVEIS', 'INATIVA')");
		stm.execute("INSERT INTO COMEX.categoria (nome, status) VALUES ('LIVROS', 'ATIVA')");		
//		stm.execute("COMMIT");
//		Integer linhasModificadas = stm.getUpdateCount();
//		System.out.println("Numero de registros Inseridos: "+linhasModificadas);
		
//  	stm.execute("INSERT INTO COMEX.categoria (nome, status) VALUES ('LIVROS', 'ATIVA')", 
//		Statement.RETURN_GENERATED_KEYS);
		
//		ResultSet resultado = stm.getGeneratedKeys();		
//		ResultSet resultado = stm.getResultSet();		
//		while(resultado.next()) {
//			Integer id = resultado.getInt(1);
//			Integer id = resultado.getInt("ID");			
//			System.out.println(id);			
//		}
//
//		stm.execute("INSERT INTO COMEX.categoria (nome, status) VALUES ('LIVROS', 'ATIVA')", 
//				Statement.RETURN_GENERATED_KEYS);
//		
//		ResultSet resultado = stm.getResultSet();
//		ResultSet resultado = stm.getGeneratedKeys();
//		while(resultado.next()) {
//			Integer id = resultado.getInt(1);
//			Integer id = resultado.getInt("ID");			
//			System.out.println(id);
//			
//			Integer nome = resultado.getInt(2);
//			String nome = resultado.getString("NOME");
//			System.out.println(nome);
//			
//			Integer status = resultado.getInt(3);
//			String status = resultado.getString("STATUS");
//			System.out.println("ID:"+id+" Categoria: "+nome+" Status: "+status);
//		}
//		
//		stm.execute("COMMIT");
		
//		stm.execute("SELECT * FROM COMEX.categoria");
//		
//		ResultSet resultado = stm.getResultSet();
//		while(resultado.next()) {
//			Integer id = resultado.getInt("ID");
//			System.out.println(id);
//			String nome = resultado.getString("NOME");
//			System.out.println(nome);
//			String status = resultado.getString("STATUS");
//			System.out.println(status);
//		}
	}
}
