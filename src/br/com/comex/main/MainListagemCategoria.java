package br.com.comex.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.ConnectionFactory;
 
public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection conexao = criaConexao.recuperarConexao();
		
		Statement stm = conexao.createStatement();
//		stm.execute("INSERT INTO COMEX.categoria (nome, status) VALUES ('INFORMATICA', 'ATIVA')");
//		stm.execute("INSERT INTO COMEX.categoria (nome, status) VALUES ('MOVEIS', 'INATIVA')");
//		stm.execute("INSERT INTO COMEX.categoria (nome, status) VALUES ('LIVROS', 'ATIVA')");
//		stm.execute("COMMIT");
		
		stm.execute("SELECT * FROM COMEX.categoria");
		
		ResultSet resultado = stm.getResultSet();
		while(resultado.next()) {
			Integer id = resultado.getInt("ID");
//			System.out.println(id);
			String nome = resultado.getString("NOME");
//			System.out.println(nome);
			String status = resultado.getString("STATUS");
//			System.out.println(status);
			System.out.println("ID:"+id+" -- Categoria: "+nome+" --  Status: "+status);
		}
	}
}
