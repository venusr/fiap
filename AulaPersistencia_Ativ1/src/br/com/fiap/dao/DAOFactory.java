//AulaPersistencia_Ativ1
package br.com.fiap.dao;

public abstract class DAOFactory {
    
	 public static ClientesDAO getClientesDAO() {
		 return new MySqlClientesDAO();
	
	 
	 }
	 
	 public static PedidosDAO getPedidosDAO(){
		 return new MySqlPedidosDAO();
	 }
	 
}
