//package br.com.comex.ws;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.List;
//
//import javax.jws.WebMethod;
//import javax.jws.WebResult;
//import javax.jws.WebService;
//
//import br.com.comex.dao.main.CategoriaDAO;
//import br.com.comex.modelo.Categoria;
//import br.com.comex.modelo.ConnectionFactory;
//
//@WebService
//public class ComexWSAntigo {
//	Connection conexao = new ConnectionFactory().Conect();
//	private CategoriaDAO catDao = new CategoriaDAO(conexao);
//	
//	@WebMethod(operationName="AdicionaClientes")
//	@WebResult(name="Cliente")
//	public Categoria adicionarCategoria(Categoria categoria) throws SQLException{
//		this.catDao.insere(categoria);
//		return categoria;
//	}
//	
//	@WebMethod(operationName="listarCategorias")
//	@WebResult(name="Categoria")
//	public List<Categoria> getCategorias() throws SQLException {
//		System.out.println("getCategorias");
//		List<Categoria> lista = catDao.listaCategorias();
//		return lista;
//	}	
	
//	public Categoria getCategorias() throws SQLException{
//		this.catDao.listaCategorias();
//		return categoria;
//	}
	
		
//	@WebResult(name = "LstCatego")	
//	public List<Categoria> getCategorias() throws SQLException {
//		List<Categoria> categorias = new ArrayList<Categoria>();
//		
//		ConnectionFactory criaConexao = new ConnectionFactory();
//		Connection conexao = criaConexao.Conect();
//		PreparedStatement stm = conexao.prepareStatement("SELECT * FROM comex.categoria");
//	    
//		
//		stm.execute();
//		
//		
//	    ResultSet registros = stm.getResultSet();
//	 
//	    
//	    while (registros.next()) {
//	          categorias.add(this.printaCategoria(registros));
//        }
//	    registros.close();
//	    stm.close();		
//		return categorias;
//	}
//
//	@WebResult(name = "PrintCatego")
//	private Categoria printaCategoria(ResultSet registro) throws SQLException {
//        Categoria categoria = new Categoria(registro.getString("nome"));
//        categoria.setId(registro.getInt("id"));
//        //StatusCategoria.valueOf((rst.getString("status")))
//        EnumCategStatus.valueOf((registro.getString("status")));
//        System.out.println(categoria);
//        return categoria;
//    }
//	
//	@WebResult(name = "InsertCatego")
//	public void adicionarCategorias() throws SQLException {
//		String nome = "";
//		EnumCategStatus status;
//		String[] v_Id = { "id" };
//		String sql = "INSERT INTO comex.categoria(NOME,STATUS) VALUES (?,?)";
//		Categoria categoria = new Categoria(nome, status);
//		ConnectionFactory criaConexao = new ConnectionFactory();				
//		try(Connection conexao = criaConexao.recuperarConexao()){         			
//		   try(PreparedStatement stm = conexao.prepareStatement(sql,v_Id)){
//			   stm.setString(1, categoria.getNome());
//			   stm.setString(2, categoria.getStatus().name());
//			   stm.execute();
//			   try (ResultSet rst = stm.getGeneratedKeys()) {
//					rst.next();
//				    categoria.setId(rst.getInt(1));
//					System.out.println("ID criado: " + rst.getInt(1));
//					Integer modific = stm.getUpdateCount();
//					System.out.println("Registros Inseridos: " + modific);								
//			   }
//		   }			   
//	    }
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@WebResult(name = "SetCatego")
//	private static void addCatego(String nome, EnumCategStatus status, PreparedStatement stm) throws SQLException {		
//		stm.setString(1, nome);
//		stm.setString(2, status.name());	
//		stm.execute();
//		try (ResultSet rst = stm.getGeneratedKeys()) {
//			 rst.next();
//			 categoria.setId(rst.getInt(1));
//				System.out.println("ID criado: " + rst.getInt(1));
//						
//		}
//	}

/****Cicero

public void insere(Categoria categoria) throws SQLException {
		String sql = "INSERT INTO comex.categoria " + "(NOME,STATUS) " + "VALUES " + "(?, ?) ";

		String[] colunaId = { "id" };
		PreparedStatement state = conexao.prepareStatement(sql, colunaId);
		state.setString(1, categoria.getNome());
		state.setString(2, categoria.getStatus().name());
		state.execute();

		ResultSet rs = state.getGeneratedKeys();
		rs.next();
		categoria.setId(rs.getInt(1));
		System.out.println("O ID criado foi: " + rs.getInt(1));
		Integer modificacoes = state.getUpdateCount();
		System.out.println("Registros Inseridos: " + modificacoes);
		state.close();

	}




/*********/
	
	
	
	
	
	
	
	
	
	
	
	
	
//	******* Buz

//	public class MainInsercaoCategoria {
//	public static void main(String[] args) throws SQLException {
//		String[] v_Id = { "id" };
//		Categoria cat1 = new Categoria("INFORMATICA");
//		Categoria cat2 = new Categoria("MOVEIS",EnumCategStatus.INATIVA);
//		Categoria cat3 = new Categoria("LIVROS");
//		
//		ConnectionFactory criaConexao = new ConnectionFactory();				
//		try(Connection conexao = criaConexao.recuperarConexao()){
//           String sql = "INSERT INTO comex.categoria(NOME,STATUS) VALUES (?,?)";			
//		   try(PreparedStatement stm = conexao.prepareStatement(sql,v_Id)){
//			  adicionaCategoria(cat1.getNome(), cat1.getStatus(), stm);
//			  adicionaCategoria(cat2.getNome(), cat2.getStatus(), stm);
//		   	  adicionaCategoria(cat3.getNome(), cat3.getStatus(), stm); 
//		   }			   
//	    }
//	}
//	
//	private static void adicionaCategoria(String nome, EnumCategStatus status, PreparedStatement stm) throws SQLException {		
//		stm.setString(1, nome);
//		stm.setString(2, status.name());	
//		stm.execute();
//		try (ResultSet rst = stm.getGeneratedKeys()) {
//			while (rst.next()) {
//				System.out.println("ID criado: " + rst.getInt(1));
//			}			
//		}
//	}
//}
	//****Steph
//	public Categoria adicionarCategoria() throws SQLException {	    
		//        String sql = "insert into COMEX.CATEGORIA (nome, status) values (?, ?)";
		//        String[] colunaParaRetornar = {"id"};    
		//    
		//    try (PreparedStatement stm = conexao.prepareStatement(sql, colunaParaRetornar)){
		//         
		//    stm.setString(1,categoria.getNome());
		//    stm.setString(2, categoria.getStatus().name());
		//    stm.execute();
		//    
		//    
		//    ResultSet rst = stm.getGeneratedKeys();
		//    rst.next();
		//    
		//    categoria.setId(rst.getLong(1));
		//
		//
		//
		//   stm.close();
//	}
	
	
//	*******
//}	
