package fiap.scj.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
public class CrudExemploAction extends ActionSupport {

	private static final long serialVersionUID = 8360086864170205447L;
	private String mensagem;

	@Action(value = "welcome", results = { @Result(name = "success", location = "/success.jsp") })
	public String execute() throws Exception {
		this.mensagem = "Bem-vindo";
		return SUCCESS;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
