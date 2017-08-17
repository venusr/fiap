package web.security;

import java.security.Principal;

public class UsuarioEntidade implements Principal{

	private String nome;
	private String login;
	private String senha;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public UsuarioEntidade(String login) {
		this.login = login;
	}
}
