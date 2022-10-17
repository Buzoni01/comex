package br.com.comex.main;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.EnumTipoIsento;
import br.com.comex.modelo.Produto;

public class MainProduto {
	public static void main(String[] args) throws SQLException {
		String[] v_Id = { "id" };
		Produto produto = new Produto("Notebook Samsung","Core i5 ssd de 1 Tera.", new BigDecimal(3523), 1, 390, EnumTipoIsento.NAO_ISENTO);

		ConnectionFactory criaConexao = new ConnectionFactory();
		try(Connection conexao = criaConexao.recuperarConexao()){
			String sql = "INSERT INTO comex.PRODUTO (NOME, DESCRICAO, PRECO_UNITARIO, QUANTIDADE_ESTOQUE, CATEGORIA_ID, TIPO)"
		      		   + " VALUES (?,?,?,?,?,?)";
			try(PreparedStatement stm = conexao.prepareStatement(sql, v_Id);){
				adicionaProduto(
						produto.getNome(), 
				        produto.getDescricao(),
				        produto.getPrecounitario(),
				        produto.getQtdestoque(),
				        produto.getCategoria(),
				        produto.getTipo().name(),
				        stm);	
			}
		};
	}

	private static void adicionaProduto(String nome, String descricao, BigDecimal precounitario, int qtdestoq, int catego, 
										String status3, PreparedStatement stm) throws SQLException {		
		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.setBigDecimal(3, precounitario);
		stm.setInt(4, qtdestoq);
		stm.setInt(5, catego);
		stm.setString(6, status3);
		stm.execute();

		try(ResultSet rst = stm.getGeneratedKeys()) {
			while(rst.next()) {
				System.out.println("ID criado: " + rst.getInt(1));
			}			
		}
	}	
}		
