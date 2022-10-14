package br.com.comex.dao.main;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.CrudInsereProduto;

public class MainCrudListaProduto {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection conexao = criaConexao.recuperarConexao();
		
		Statement stm = conexao.createStatement();
	
		stm.execute("SELECT * FROM COMEX.produto");
		
		ResultSet resultado = stm.getResultSet();
		while(resultado.next()) {
			Integer id = resultado.getInt("ID");
			String nome = resultado.getString("NOME");
//			String status = resultado.getString("STATUS");
			System.out.println("ID:"+id+" -- Categoria: "+nome+" --  Status: "/*+status*/);
		}
	}
}



stm.execute("SELECT * FROM COMEX.categoria");

ResultSet resultado = stm.getResultSet();
while(resultado.next()) {
	Integer id = resultado.getInt("ID");
	String nome = resultado.getString("NOME");
	String descricao = resultado.getString("DESCRICAO");
	Integer precounitario = resultado.getInt("PRECO_UNITARIO");
	Integer qtdestoq = resultado.getInt("QUANTIDADE_ESTOQUE");
	String categoid = resultado.getString("CATEGORIA_ID");
	String tipo = resultado.getString("TIPO");
	System.out.println("ID:"+id+" -- Produto: "+nome+" --  Descrição: "+descricao+" --  Preço: "+precounitario+
		