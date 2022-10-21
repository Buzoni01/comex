package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EnumEstado;

public class ClienteDAO {
	private Connection conexao;

	public ClienteDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public List<Cliente> listaClientes() throws SQLException {
		List<Cliente> clientes = new ArrayList<Cliente>();
		String sql = "SELECT * FROM comex.cliente";
		try (PreparedStatement stm = conexao.prepareStatement(sql)) {
			stm.execute();
			try (ResultSet rst = stm.getResultSet()) {
				while (rst.next()) {
					clientes.add(this.criaClientes(rst));
				}
			}
		}
		return clientes;
	}

	public void inserir(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO comex.cliente (NOME, CPF, TELEFONE, RUA, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF) "
				   + "VALUES (?,?,?,?,?,?,?,?,?) ";		
		String[] v_id = { "id" };
		try(PreparedStatement stm = conexao.prepareStatement(sql, v_id)){
			stm.setString(1, cliente.getNomeCompleto());
			stm.setString(2, cliente.getCpf());
			stm.setString(3, cliente.getNumeroCelular());
			stm.setString(4, cliente.getRua());
			stm.setString(5, cliente.getNumeroRua());
			stm.setString(6, cliente.getComplemento());
			stm.setString(7, cliente.getBairro());
			stm.setString(8, cliente.getCidade());
			stm.setString(9, cliente.getEstado().name());
			stm.execute();
			try(ResultSet rst = stm.getGeneratedKeys()){
				rst.next();
				cliente.setId(rst.getInt(1));
				System.out.println("O ID criado foi: " + rst.getInt(1));
				Integer incidencias = stm.getUpdateCount();
				System.out.println("Registros Inseridos: " + incidencias);
			}
		}
	}
	
	private Cliente criaClientes(ResultSet registro) throws SQLException {
		Cliente cliente = new Cliente(registro.getString("nome"), registro.getString("cpf"),
				registro.getString("telefone"), registro.getString("rua"), registro.getString("numero"),
				registro.getString("complemento"), registro.getString("bairro"), registro.getString("cidade"),
				registro.getString("uf"));
		cliente.setId(registro.getInt("id"));
		cliente.setNomeCompleto(registro.getString("nome"));
		cliente.setCpf(registro.getString("cpf"));
		cliente.setNumeroCelular(registro.getString("telefone"));
		cliente.setRua(registro.getString("rua"));
		cliente.setNumeroRua(registro.getString("numero"));
		cliente.setComplemento(registro.getString("complemento"));
		cliente.setBairro(registro.getString("bairro"));
		cliente.setCidade(registro.getString("cidade"));
		EnumEstado estado = EnumEstado.valueOf(registro.getString("uf"));
		cliente.setEstado(estado);

		return cliente;
	}
}
