package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.EnumCategStatus;

public class CategoriaDAO {

	private Connection conexao;

	public CategoriaDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public void inserir(Categoria categoria) throws SQLException {
		String sql = "INSERT INTO comex.categoria " + "(NOME,STATUS) " + "VALUES " + "(?, ?) ";
		String[] v_id = { "id" };
		try(PreparedStatement stm = conexao.prepareStatement(sql, v_id)){
			stm.setString(1, categoria.getNome());
			stm.setString(2, categoria.getStatus().name());
			stm.execute();
			try(ResultSet rst = stm.getGeneratedKeys()){
				rst.next();
				categoria.setId(rst.getInt(1));
				System.out.println("O ID criado foi: " + rst.getInt(1));
				Integer incidencias = stm.getUpdateCount();
				System.out.println("Registros Inseridos: " + incidencias);
			}
		}
	}

	public List<Categoria> listaCategorias() throws SQLException {
		List<Categoria> categorias = new ArrayList<Categoria>();
		String sql = "SELECT * FROM comex.categoria";
		try(PreparedStatement stm = conexao.prepareStatement(sql)){
			stm.execute();
			try(ResultSet rst = stm.getResultSet()){
				while (rst.next()) {
					categorias.add(this.criaCategoria(rst));
				}
			}
		}
		return categorias;
	}

	public void excluir(Integer id) throws SQLException {
		String sql = "DELETE FROM comex.categoria WHERE ID = ?";
		try(PreparedStatement stm = conexao.prepareStatement(sql)){
			stm.setInt(1, id);
			stm.execute();
			Integer incidencias = stm.getUpdateCount();
			System.out.println("Registros Excluidos: " + incidencias);
		}
	}

	public void alterar(Categoria categoria) throws SQLException {
		String sql = "UPDATE comex.categoria SET nome=? ,status=? WHERE id=?";
		try(PreparedStatement stm = conexao.prepareStatement(sql)){
			stm.setString(1, categoria.getNome());
			stm.setString(2, categoria.getStatus().name());
			stm.setInt(3, categoria.getId());
			stm.execute();
			Integer incidencias = stm.getUpdateCount();
			System.out.println("Registros Modificados: " + incidencias);
			System.out.println(
				"Categoria" + " " + categoria.getId() + " " + categoria.getNome() + " " + categoria.getStatus());
		}
	}

	public Categoria buscaPorId(Integer id) throws SQLException {
		String sql = "SELECT * FROM comex.categoria WHERE ID = ?";
		try (PreparedStatement stm = this.conexao.prepareStatement(sql)) {
			stm.setInt(1, id);
			try (ResultSet rst = stm.executeQuery()) {
				Categoria categoria = null;
				if (rst.next()) {
					categoria = this.criaCategoria(rst);
				}
				return categoria;
			}
		}
	}

	private Categoria criaCategoria(ResultSet registro) throws SQLException {
		Categoria categoria = new Categoria(registro.getString("nome"));
		categoria.setId(registro.getInt("id"));
		EnumCategStatus status = EnumCategStatus.valueOf(registro.getString("status"));
		categoria.setStatus(status);
		System.out.println(categoria);
		return categoria;
	}
}
