package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
//	public Connection Conect(){ //throws SQLException {
	public Connection recuperarConexao(){ //throws SQLException {
		try {return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "brx");} 
		catch (SQLException e) {throw new RuntimeException(e);}	
	}
}