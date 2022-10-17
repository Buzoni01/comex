package br.com.comex.dao.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;


public class CategoriaDAO {
	private Connection conexao;
	public CategoriaDAO(Connection conexao) {
        this.conexao = conexao;
    }

	public void inserir(Categoria categoria) throws SQLException {
        String sql = "INSERT INTO comex.categoria (NOME, STATUS) VALUES (?, ?) ";
        String[] v_id = { "id" };
        try(PreparedStatement stm = conexao.prepareStatement(sql, v_id)){
        	stm.setString(1, categoria.getNome());
        	stm.setString(2, categoria.getStatus().name());
        	stm.execute();        
        	try(ResultSet rst = stm.getGeneratedKeys()){
        		rst.next();
        		categoria.setId(rst.getInt(1));
        		System.out.println("ID criado : " + rst.getInt(1));
        		Integer insidencias = stm.getUpdateCount();
        		System.out.println("Numero de Registros Inseridos: " + insidencias);
        	}
        }
   }

   public List<Categoria> listaCategorias() throws SQLException {
       List<Categoria> categorias = new ArrayList<Categoria>();
       try(PreparedStatement stm = conexao.prepareStatement("SELECT * FROM comex.categoria")){
    	   stm.execute();
    	   try(ResultSet rst = stm.getResultSet()){
    		   while(rst.next()) {
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
           Integer insidencias = stm.getUpdateCount();
           System.out.println("Numero de Registros Excluidos: " + insidencias);
       }
   }

   public void alterar(Categoria categoria) throws SQLException {
       try(PreparedStatement stm = conexao.prepareStatement("UPDATE comex.categoria SET NOME = ?, STATUS = ?"+ 
    		   											    "WHERE id = ?")){
    	   stm.setString(1, categoria.getNome());
    	   stm.setString(2, categoria.getStatus().name());
    	   stm.setInt(3, categoria.getId());
    	   stm.execute();
    	   Integer insidencias = stm.getUpdateCount();
    	   System.out.println("Numero de Registros Modificados: " + insidencias);
    	   System.out.println("Categoria" + " " + categoria.getId() + " " + categoria.getNome() + " " + categoria.getStatus());
       }
   }

   public Categoria buscaPorId(Integer id) throws SQLException {
       String sql = "SELECT * FROM comex.categoria WHERE ID = ?";
       try(PreparedStatement stm = this.conexao.prepareStatement(sql)) {
           stm.setInt(1, id);
           try(ResultSet rst = stm.executeQuery()) {
               Categoria categoria = null;
               if(rst.next()) {
                  categoria = this.criaCategoria(rst);
               }
               return categoria;
           }
       }
   }

   private Categoria criaCategoria(ResultSet registro) throws SQLException {
       Categoria categoria = new Categoria(registro.getString("nome"));
       categoria.setId(registro.getInt("id"));
       System.out.println(categoria);
       return categoria;
   }
}