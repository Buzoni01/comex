package br.com.comex.main;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.EnumTipoIsento;
import br.com.comex.modelo.Produto;

public class MainAlteraProduto {
	public static void main(String[] args) throws SQLException {
		String[] v_Id = { "id" };
//		Produto produto = new Produto("Notebook Samsung","Core i5 ssd de 1 Tera.", new BigDecimal(3523), 1, 390, EnumTipoIsento.NAO_ISENTO);
		Produto produto = new Produto("Notebook Dell","Core i5 ssd de 1 Tera.", new BigDecimal(3523), 1, 390, EnumTipoIsento.NAO_ISENTO);
		produto.setId(488);
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		try(Connection conexao = criaConexao.recuperarConexao()){
			String sql = "UPDATE comex.PRODUTO SET NOME=?, DESCRICAO=?, PRECO_UNITARIO=?, QUANTIDADE_ESTOQUE=?, "
					   + "CATEGORIA_ID =?, TIPO=? WHERE ID = ?";
			try(PreparedStatement stm = conexao.prepareStatement(sql, v_Id);){
				stm.setString(1, produto.getNome());
				stm.setString(2, produto.getDescricao());
				stm.setBigDecimal(3, produto.getPrecounitario());
				stm.setInt(4, produto.getQtdestoque());
				stm.setInt(5, produto.getCategoria());
				stm.setString(6, produto.getTipo().name());
				stm.setInt(7, produto.getId());
				stm.execute();
				try(ResultSet rst = stm.getGeneratedKeys()) {
					while (rst.next()) {
						System.out.println("ID do Produto Alterado: " + rst.getInt(1));
					}			
				}	
			}
		};
	}
}		
