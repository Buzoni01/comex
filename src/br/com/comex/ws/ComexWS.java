package br.com.comex.ws;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

import javax.jws.WebMethod;
import javax.jws.WebResult;
//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebResult;
import javax.jws.WebService;
//import javax.xml.ws.RequestWrapper;
//import javax.xml.ws.ResponseWrapper;
//
//import br.com.caelum.estoque.modelo.item.Filtro;
//import br.com.caelum.estoque.modelo.item.Filtros;
//import br.com.caelum.estoque.modelo.item.Item;
//import br.com.caelum.estoque.modelo.item.ItemDao;
//import br.com.caelum.estoque.modelo.item.ListaItens;
//
@WebService
public class ComexWS {
	//@WebMethod(operationName = "TodasCategorias")
	@WebResult(name = "LstCatego")
	public List<Categoria> getCategorias() throws SQLException {
		List<Categoria> categorias = new ArrayList<Categoria>();
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection conexao = criaConexao.recuperarConexao();
		PreparedStatement stm = conexao.prepareStatement("SELECT * FROM comex.categoria");
	    stm.execute();
	    ResultSet registros = stm.getResultSet();
	    while (registros.next()) {
	          categorias.add(this.criaCategoria(registros));
        }
	    registros.close();
	    stm.close();		
		return categorias;
	}
	//@WebMethod(operationName = "GeraCatego")
	@WebResult(name = "Catego")
	private Categoria criaCategoria(ResultSet registro) throws SQLException {
        Categoria categoria = new Categoria(registro.getString("nome"));
        categoria.setId(registro.getInt("id"));
        //jdbc nao suporta enum, queria saber como funciona quando usamos enum...
        System.out.println(categoria);
        return categoria;
    }
}	
//	private ItemDao dao = new ItemDao();
//	
//	@WebMethod(operationName = "TodosOsItens")
//	@ResponseWrapper(localName = "itens")
//	@WebResult(name = "ItensDaLoja")
//	@RequestWrapper(localName="ListaItens")
//
//	public ListaItens getItens(@WebParam(name = "filtros") Filtros filtros){
//		System.out.println("Chamando : getItens()");
//		
//		List<Filtro> lista = filtros.getLista();
//		List<Item> itensResultado = dao.todosItens(lista);
//		return new ListaItens(itensResultado);
//	}
//	
//	@WebMethod(operationName = "CadastrarItem")
//	@WebResult(name = "Item")
//	public Item cadastrarItem(@WebParam(name = "item")Item item){
//		System.out.println("Item Cadastrado: "+item);
//		this.dao.cadastrar(item);
//		return item;
//	}


//}



//import java.util.List;
//
//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebResult;
//import javax.jws.WebService;
//import javax.xml.ws.RequestWrapper;
//import javax.xml.ws.ResponseWrapper;
//
//import br.com.caelum.estoque.modelo.item.Filtro;
//import br.com.caelum.estoque.modelo.item.Filtros;
//import br.com.caelum.estoque.modelo.item.Item;
//import br.com.caelum.estoque.modelo.item.ItemDao;
//import br.com.caelum.estoque.modelo.item.ListaItens;
//
//@WebService
//public class EstoqueWS {
//	private ItemDao dao = new ItemDao();
//	
//	@WebMethod(operationName = "TodosOsItens")
//	@ResponseWrapper(localName = "itens")
//	@WebResult(name = "ItensDaLoja")
//	@RequestWrapper(localName="ListaItens")
//
//	public ListaItens getItens(@WebParam(name = "filtros") Filtros filtros){
//		System.out.println("Chamando : getItens()");
//		
//		List<Filtro> lista = filtros.getLista();
//		List<Item> itensResultado = dao.todosItens(lista);
//		return new ListaItens(itensResultado);
//	}
//	
//	@WebMethod(operationName = "CadastrarItem")
//	@WebResult(name = "Item")
//	public Item cadastrarItem(@WebParam(name = "item")Item item){
//		System.out.println("Item Cadastrado: "+item);
//		this.dao.cadastrar(item);
//		return item;
//	}
//}
//
