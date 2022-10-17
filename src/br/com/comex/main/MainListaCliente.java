package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainListaCliente {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory criaConexao = new ConnectionFactory();
		try(Connection conexao = criaConexao.recuperarConexao()){
			String sql = "SELECT * FROM comex.CLIENTE";
			try(PreparedStatement stm = conexao.prepareStatement(sql);){
				stm.execute(sql);
				ResultSet rst = stm.getResultSet();
				while(rst.next()) {
					Integer id          = rst.getInt("ID");
					String  nome        = rst.getString("NOME");
					String  cpf         = rst.getString("CPF");
					String  telefone    = rst.getString("TELEFONE");
					String  rua         = rst.getString("RUA");
					String  numero      = rst.getString("NUMERO");
					String  complemento = rst.getString("COMPLEMENTO");
					String  bairro      = rst.getString("BAIRRO");
					String  cidade      = rst.getString("CIDADE");
					String  uf          = rst.getString("UF");
						
					System.out.println("Cliente: "+id+"-"+nome+" Cpf: "+cpf+" Tel.: "+telefone+" Rua : "+rua+
							           ","+numero+" "+complemento+" "+bairro+" "+cidade+"-"+uf);				
				}
			}
		};
	}
}
	
