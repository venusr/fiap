package web.security;

import java.security.Principal;

public class PerfilEntidade implements Principal{

	private String descricao;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public PerfilEntidade(String groupName) {
		this.descricao = groupName;
	}

}
