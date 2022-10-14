package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.dao.main.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.CrudProduto;

public class MainCrudInsereProduto {
	public static void main(String[] args) throws SQLException {
//		String[] v_id = {"id"};
		CrudProduto vproduto = new CrudProduto("Comoda", "Comoda Vertical", 1099, 1, 361, "NAO_ISENTO");
		
		try(Connection conexao = new ConnectionFactory().recuperarConexao()){
            ProdutoDAO produtoDAO = new ProdutoDAO(conexao);
            produtoDAO.Inserir(vproduto);
            
            List<CrudProduto> listaDeProdutos = produtoDAO.listar();
            listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		}
		System.out.println(vproduto);
	}
}

            
            
            
            
            //Lista = PesistenciaProduto.listar();
            
//			String sql = "INSERT INTO comex.PRODUTO (NOME, DESCRICAO, PRECO_UNITARIO, QUANTIDADE_ESTOQUE, CATEGORIA_ID, TIPO) VALUES (?, ?, ?, ?, ?, ?)";
//		
//			try(PreparedStatement stm = conexao.prepareStatement(sql,v_id)){						
//				stm.setString(1, vproduto.getNome());
//				stm.setString(2, vproduto.getDescricao());
//				stm.setFloat(3, vproduto.getPrecoUnitario());
//				stm.setInt(4, vproduto.getqtdEstoq());
//				stm.setInt(5, vproduto.getCategoId());
//				stm.setString(6, vproduto.getTipo());
//				
//				stm.execute();
//				try(ResultSet rst = stm.getGeneratedKeys()){
//					while(rst.next()) {
//						vproduto.setId(rst.getInt(1));
//					}
//				}				
//			}
		
