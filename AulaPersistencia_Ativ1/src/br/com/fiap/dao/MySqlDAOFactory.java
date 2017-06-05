package br.com.fiap.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlDAOFactory extends DAOFactory{

	public static final String URL = "jdbc:mysql://localhost:3306/vendas";

	public static Connection criarConexao() throws Exception{ 
		return DriverManager.getConnection(URL,"root","root");
	}

}
