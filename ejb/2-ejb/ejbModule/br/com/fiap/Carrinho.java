package br.com.fiap;

import java.util.List;

public interface Carrinho {

	void cadastrarItem(Item item);

	List<Item> obterItens();

	int obterQuantidadeItens();

	void adicionarEmail(int matricula, String email);
}
