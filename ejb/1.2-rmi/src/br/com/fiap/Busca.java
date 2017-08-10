package br.com.fiap;

import java.rmi.Naming;


//10.20.74.41

public class Busca {

	public static void main(String[] args) throws Exception {
		//System.setProperty(
		Carrinho carrinho = (Carrinho) Naming.lookup("rmi://10.20.74.41:1099/farmacia/carrinho");
		Item item = new Item();
		item.setNome("MINHA VEZ MINHA VEZ");
		item.setPreco(10.5);
		carrinho.cadastrarItem(item);
		System.out.println("Foi");
	}

}
