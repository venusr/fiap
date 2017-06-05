//AulaPersistencia_Ativ1
package br.com.fiap.dao;
import java.util.List;

import br.com.fiap.entity.Pedidos;


	public interface PedidosDAO {
	    Pedidos inserirPedidos(Pedidos pedido) throws Exception;
	    List<Pedidos> listarPedidos(int idCliente) throws Exception;
	}
	
	
