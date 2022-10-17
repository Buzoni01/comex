package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.EnumCategStatus;

public class MainInsercaoCategoria {
	public static void main(String[] args) throws SQLException {
		String[] v_Id = { "id" };
		Categoria cat1 = new Categoria("INFORMATICA");
		Categoria cat2 = new Categoria("MOVEIS",EnumCategStatus.INATIVA);
		Categoria cat3 = new Categoria("LIVROS");
		
		ConnectionFactory criaConexao = new ConnectionFactory();				
		try(Connection conexao = criaConexao.recuperarConexao()){
           String sql = "INSERT INTO comex.categoria(NOME,STATUS) VALUES (?,?)";			
		   try(PreparedStatement stm = conexao.prepareStatement(sql,v_Id)){
			  adicionaCategoria(cat1.getNome(), cat1.getStatus(), stm);
			  adicionaCategoria(cat2.getNome(), cat2.getStatus(), stm);
		   	  adicionaCategoria(cat3.getNome(), cat3.getStatus(), stm); 
		   }			   
	    }
	}
	
	private static void adicionaCategoria(String nome, EnumCategStatus status, PreparedStatement stm) throws SQLException {		
		stm.setString(1, nome);
		stm.setString(2, status.name());	
		stm.execute();
		try (ResultSet rst = stm.getGeneratedKeys()) {
			while (rst.next()) {
				System.out.println("ID criado: " + rst.getInt(1));
			}			
		}
	}
}
