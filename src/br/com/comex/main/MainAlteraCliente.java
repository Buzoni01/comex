package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.EnumEstado;

public class MainAlteraCliente {

	public static void main(String[] args) throws SQLException {
		String[] v_Id = { "id" };
		Cliente cliente = new Cliente (1,"Gabi Ruta da Silva e Melo","77777777766","11947493333","AV Siumare","1815","Apto.75",
				                       "Pacaembu","São Paulo",EnumEstado.SP);	
		cliente.setId(28);
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		try(Connection conexao = criaConexao.recuperarConexao()){
			String sql = "UPDATE comex.CLIENTE SET NOME=?, CPF=?, TELEFONE=?, RUA=?, NUMERO=?, COMPLEMENTO=?, BAIRRO=?, "
					   + "CIDADE=?, UF=? WHERE ID=?";
			try(PreparedStatement stm = conexao.prepareStatement(sql,v_Id);){
				stm.setString(1, cliente.getNomeCompleto());
				stm.setString(2, cliente.getCpf());
				stm.setString(3, cliente.getNumeroCelular());
				stm.setString(4, cliente.getRua());
				stm.setString(5, cliente.getNumeroRua());
				stm.setString(6, cliente.getComplemento());
				stm.setString(7, cliente.getBairro());
				stm.setString(8, cliente.getCidade());
				stm.setString(9, cliente.getEstado().name());
				stm.setInt(10, cliente.getId());
				stm.execute();

				try(ResultSet rst = stm.getGeneratedKeys()) {
					while(rst.next()) {
						System.out.println("ID Alterado: " + rst.getInt(1));
					}			
				}	
			}
		}		
	}			
}	