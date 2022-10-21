package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.dao.main.CategoriaDAO;
import br.com.comex.dao.main.ClienteDAO;
import br.com.comex.dao.main.ProdutoDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;

@WebService
public class ComexWS {
	Connection conexao = new ConnectionFactory().recuperarConexao();

	private CategoriaDAO catDao = new CategoriaDAO(conexao);
	private ClienteDAO cliDao = new ClienteDAO(conexao);	
	private ProdutoDAO proDao = new ProdutoDAO(conexao);	
	
	@WebMethod(operationName="AdicionaCategoria")
	@WebResult(name="Categoria")
	public Categoria adicionarCategoria(Categoria categoria) throws SQLException{
		this.catDao.inserir(categoria);
		return categoria;
	}
	
	@WebMethod(operationName="AdicionaClientes")
	@WebResult(name="Cliente")
	public Cliente adicionarCliente(Cliente cliente) throws SQLException{
		this.cliDao.inserir(cliente);
		return cliente;
	}
	@WebMethod(operationName="listarCategorias")
	@WebResult(name="Categoria")
	public List<Categoria> getCategorias() throws SQLException {
		System.out.println("Operação: getCategorias");
		List<Categoria> listar = catDao.listaCategorias();
		return listar;
	}	
	
	@WebMethod(operationName="listarClientes")
	@WebResult(name="Cliente")
	public List<Cliente> listarClientes() throws SQLException {
		System.out.println("Operação: listarClientes");
		List<Cliente> listar = cliDao.listaClientes();
		return listar;
	}	
	
	@WebMethod(operationName="listarProdutos")
	@WebResult(name="Produto")
	public List<Produto> listarProdutos() throws SQLException {
		System.out.println("Operação: listarProdutos");
		List<Produto> listar = proDao.listarProdutos();
		return listar;
	}	
}	
