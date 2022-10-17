package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.EnumEstado;

public class MainCliente {

	public static void main(String[] args) throws SQLException {
		//String[] v_Id = { "id" };
		Cliente cliente = new Cliente (1,"Gabi Ruta","77777777766","11947493333","AV Siumare","1815","Apto.75",
				                       "Pacaembu","São Paulo",EnumEstado.SP);		
		ConnectionFactory criaConexao = new ConnectionFactory();
		try(Connection conexao = criaConexao.recuperarConexao()){
			String sql = "INSERT INTO comex.CLIENTE (NOME, CPF, TELEFONE, RUA, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF)"
		      		   + " VALUES (?,?,?,?,?,?,?,?,?)";
			try(PreparedStatement stm = conexao.prepareStatement(sql/*,v_Id*/);){
				adicionaCliente(
						cliente.getNomeCompleto(), 
				        cliente.getCpf(),
				        cliente.getNumeroCelular(),
				        cliente.getRua(),
				        cliente.getNumeroRua(),
				        cliente.getComplemento(),
				        cliente.getBairro(),
				        cliente.getCidade(),
				        cliente.getEstado().name(),			        
				        stm);	
			}
		}
		
	}
	private static void adicionaCliente(String nome, String cpf, String telefone, String rua, String numero, 
										String complemento, String bairro, String cidade, String uf, PreparedStatement stm)
										throws SQLException {	
		stm.setString(1, nome);
		stm.setString(2, cpf);
		stm.setString(3, telefone);
		stm.setString(4, rua);
		stm.setString(5, numero);
		stm.setString(6, complemento);
		stm.setString(7, bairro);
		stm.setString(8, cidade);
		stm.setString(9, uf);
		stm.execute();

		try(ResultSet rst = stm.getGeneratedKeys()) {
			while(rst.next()) {
				System.out.println("ID criado: " + rst.getInt(1));
			}			
		}
	}			
}	