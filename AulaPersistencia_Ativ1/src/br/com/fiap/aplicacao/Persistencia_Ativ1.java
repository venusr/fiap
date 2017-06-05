package br.com.fiap.aplicacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;

import br.com.fiap.dao.ClientesDAO;
import br.com.fiap.dao.PedidosDAO;
import br.com.fiap.dao.DAOFactory;
import br.com.fiap.entity.Clientes;
import br.com.fiap.entity.Pedidos;


public class Persistencia_Ativ1 {
    	 
    public static void main(String[] args) {
     try {
    	List<Pedidos> listaPedidos = new ArrayList<>();
    	 
    	ClientesDAO clientesDAO = DAOFactory.getClientesDAO();   

        
        //Inserir Cliente 1 com 2 pedidos
		Clientes cliente = new Clientes();
		cliente.setNome("Cecilia Amaral");
		cliente.setEmail("cecilia_amaral@teste.com");
		cliente = clientesDAO.inserirClientes(cliente);
		
		PedidosDAO pedidosDAO = DAOFactory.getPedidosDAO();
		
		Pedidos pedido = new Pedidos();
		pedido.setData(new Date());
		pedido.setDescricao("Caderno");
		pedido.setValor(50);
		pedido.setIdCliente(cliente.getId());
		
		pedido = pedidosDAO.inserirPedidos(pedido);

		pedido = new Pedidos();
		pedido.setData(new Date());
		pedido.setDescricao("Lapis");
		pedido.setValor(10);
		pedido.setIdCliente(cliente.getId());
		
		pedido = pedidosDAO.inserirPedidos(pedido);

		//Buscar Cliente 1 com seus pedidos
		listaPedidos = pedidosDAO.listarPedidos(cliente.getId());
		System.out.println("Cliente: " + cliente.getId() + " - Nome: " + cliente.getNome() + " - EMail: " + cliente.getEmail());

		for (Pedidos pedidos : listaPedidos) {
			System.out.println("         " + "Produto: " + pedidos.getId() + " - Descricao: " + pedidos.getDescricao() + " - Valor: " + pedidos.getValor());
		}
		
        //Inserir Cliente 2 com 2 pedidos
		cliente = new Clientes();
		cliente.setNome("Mariana Pitton");
		cliente.setEmail("mariana_pitton@teste.com");
		cliente = clientesDAO.inserirClientes(cliente);
		
		pedidosDAO = DAOFactory.getPedidosDAO();
		
		pedido = new Pedidos();
		pedido.setData(new Date());
		pedido.setDescricao("Livro");
		pedido.setValor(110);
		pedido.setIdCliente(cliente.getId());
		
		pedido = pedidosDAO.inserirPedidos(pedido);

		pedido = new Pedidos();
		pedido.setData(new Date());
		pedido.setDescricao("Mochila");
		pedido.setValor(320);
		pedido.setIdCliente(cliente.getId());
		
		pedido = pedidosDAO.inserirPedidos(pedido);
		

		//Buscar Cliente 2 com seus pedidos
		listaPedidos = pedidosDAO.listarPedidos(cliente.getId());
		System.out.println("Cliente: " + cliente.getId() + " - Nome: " + cliente.getNome() + " - EMail: " + cliente.getEmail());

		for (Pedidos pedidos : listaPedidos) {
			System.out.println("         " + "Produto: " + pedidos.getId() + " - Descricao: " + pedidos.getDescricao() + " - Valor: " + pedidos.getValor());
		}
		
     } catch (Exception e) {
    	 e.printStackTrace();
     }
	}
}
