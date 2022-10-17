package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainListaProduto {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory criaConexao = new ConnectionFactory();
		try(Connection conexao = criaConexao.recuperarConexao()){
			String sql = "SELECT * FROM comex.PRODUTO";
			try(PreparedStatement stm = conexao.prepareStatement(sql);){
				stm.execute(sql);
				ResultSet rst = stm.getResultSet();
				while(rst.next()) {
					Integer id            = rst.getInt("ID");
					String  nome          = rst.getString("NOME");
					String  descricao     = rst.getString("DESCRICAO");
					Integer precounitario = rst.getInt("PRECO_UNITARIO");
					Integer qtdestoque    = rst.getInt("QUANTIDADE_ESTOQUE");
					Integer categoria     = rst.getInt("CATEGORIA_ID");
					String  tipo          = rst.getString("TIPO");
						
					System.out.println("Produto: "+id+" -- "+nome+" -- "+descricao+" -- Preço: "+precounitario+
							           " | Quantiade: "+qtdestoque+" | Categoria: "+categoria+" -- "+tipo);				
				}
			}
		};
	}
}
	
