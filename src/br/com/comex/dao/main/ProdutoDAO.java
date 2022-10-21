package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.EnumTipoIsento;
import br.com.comex.modelo.Produto;

public class ProdutoDAO {
	private Connection conexao;

	public ProdutoDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public List<Produto> listarProdutos() throws SQLException {
		List<Produto> produtos = new ArrayList<Produto>();
		String sql = "SELECT * FROM comex.produto";
		try (PreparedStatement stm = conexao.prepareStatement(sql)) {
			stm.execute();
			try (ResultSet rst = stm.getResultSet()) {
				while (rst.next()) {
					produtos.add(this.criaProdutos(rst));
				}
			}
		}
		return produtos;
	}
	private Produto criaProdutos(ResultSet registro) throws SQLException {
	Produto produto = new Produto(registro.getString("nome"), registro.getString("descricao"),
								  registro.getBigDecimal("preco_unitario"), registro.getInt("quantidade_estoque"), 
								  registro.getInt("categoria_id"));

	produto.setId(registro.getInt("id"));
	produto.setNome(registro.getString("nome"));
	produto.setDescricao(registro.getString("descricao"));
	produto.setPrecounitario(registro.getBigDecimal("preco_unitario"));
	produto.setQtdestoque(registro.getInt("quantidade_estoque"));
	produto.setCategoria(registro.getInt("categoria_id"));
	EnumTipoIsento tipo = EnumTipoIsento.valueOf(registro.getString("tipo"));
	produto.setTipo(tipo);

	return produto;
	}
}
