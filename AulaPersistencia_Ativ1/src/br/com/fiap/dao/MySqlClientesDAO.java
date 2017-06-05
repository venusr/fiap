//AulaPersistencia_Ativ1

package br.com.fiap.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fiap.entity.Clientes;
import br.com.fiap.dao.MySqlDAOFactory;


public class MySqlClientesDAO implements ClientesDAO {

	Connection cn = null;
	PreparedStatement stmt;
	ResultSet rs = null;
	
	@Override
	public Clientes inserirClientes(Clientes cliente) throws Exception {
		
		cn = MySqlDAOFactory.criarConexao();
		
		String sql="INSERT INTO CLIENTES (NOME,EMAIL) VALUES (?,?)";
		stmt = cn.prepareStatement(sql,  Statement.RETURN_GENERATED_KEYS);
		stmt.setString(1, cliente.getNome());
		stmt.setString(2, cliente.getEmail());
		stmt.execute();
		
		//Chave gerada (Identity Keys)
		rs = stmt.getGeneratedKeys();
		if (rs.next()){
			cliente.setId(rs.getInt(1));
		}
		cn.close();
		if (stmt != null) stmt.close();
		return cliente;
	}
	
}
