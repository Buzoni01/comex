package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.TesteDeCrudeDAOemProduto;
import br.com.comex.modelo.Produto;

public class ProdutoDAO {
	private Connection conexao;
	
	public ProdutoDAO(Connection conexao) {
		this.conexao = conexao;		
	}
	public void Inserir(Produto produto) throws SQLException {
		String[] v_id = {"id"};
		String sql = "INSERT INTO comex.PRODUTO (NOME, DESCRICAO, PRECO_UNITARIO, QUANTIDADE_ESTOQUE, CATEGORIA_ID, TIPO) VALUES (?, ?, ?, ?, ?, ?)";
		try(PreparedStatement stm = conexao.prepareStatement(sql,v_id)){						
			stm.setString(1, produto.getNome());
			stm.setString(2, produto.getDescricao());
			stm.setBigDecimal(3, produto.getPrecounitario());
//			stm.setInt(3, produto.getPrecounitario());
			stm.setInt(4, produto.getQtdestoque());
			stm.setInt(5, produto.getCategoria());
			stm.setString(6, produto.getTipo().name());
			
			stm.execute();
			try(ResultSet rst = stm.getGeneratedKeys()){
				while(rst.next()) {
					produto.setId(rst.getInt(1));
				}

			}				
		}			
	}	
//	public void Inserir(CrudProduto produto) throws SQLException {
//		String[] v_id = {"id"};
//		String sql = "INSERT INTO comex.PRODUTO (NOME, DESCRICAO, PRECO_UNITARIO, QUANTIDADE_ESTOQUE, CATEGORIA_ID, TIPO) VALUES (?, ?, ?, ?, ?, ?)";
//		
//		try(PreparedStatement stm = conexao.prepareStatement(sql,v_id)){						
//			stm.setString(1, produto.getNome());
//			stm.setString(2, produto.getDescricao());
//			stm.setFloat(3, produto.getPrecoUnitario());
//			stm.setInt(4, produto.getqtdEstoq());
//			stm.setInt(5, produto.getCategoId());
//			stm.setString(6, produto.getTipo());
//			
//			stm.execute();
//			try(ResultSet rst = stm.getGeneratedKeys()){
//				while(rst.next()) {
//					produto.setId(rst.getInt(1));
//				}
//
//			}				
//		}	
//	}
	public List<TesteDeCrudeDAOemProduto> listar() throws SQLException{
		List<TesteDeCrudeDAOemProduto> produtos = new ArrayList<TesteDeCrudeDAOemProduto>();
		String[] v_id = {"id"};
		String sql = "SELECT * FROM COMEX.produto";
		try(PreparedStatement stm = conexao.prepareStatement(sql, v_id)){
			stm.execute();
			try(ResultSet rst = stm.getGeneratedKeys()){
//			try(ResultSet rst = stm.getResultSet()){		
				while(rst.next()) {
					TesteDeCrudeDAOemProduto produto = 
							    new TesteDeCrudeDAOemProduto(rst.getInt("ID"), rst.getString("NOME"), 
							    	rst.getString("DESCRICAO"), rst.getInt("PRECO_UNITARIO"), 
							    	rst.getInt("QUANTIDADE_ESTOQUE"), rst.getInt("CATEGORIA_ID"), 
							    	rst.getString("TIPO"));
					produtos.add(produto);
				}
			}	
		}
		return produtos;
	}
}
