package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection recuperarConexao(){ 
//		try {return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "brx");} 
//		try {return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "SYSTEM", "admin");} 
		try {return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "SYSTEM", "admin");}		
		catch (SQLException e) {throw new RuntimeException(e);}	
	}
}
