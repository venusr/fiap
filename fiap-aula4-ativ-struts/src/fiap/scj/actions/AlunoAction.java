package fiap.scj.actions;


import java.util.ArrayList;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import fiap.scj.bean.Aluno;

@Namespace("/aluno")
public class AlunoAction extends ActionSupport {

	private static final long serialVersionUID = -5479343830975507511L;

	private Aluno aluno;
	private String mensagem;
	private ArrayList<Aluno> alunoList = new ArrayList();
	
	public AlunoAction() {
		aluno = new Aluno();
	}
	
	@Action(value = "/cadastrarAluno", results = {
			@Result(name = "success", location = "/listaalunos.jsp"),
			@Result(name = "error", location = "/erro.jsp"), })
	
	public String cadastrarAluno() {
		System.out.println(this.aluno);
		alunoList.add(aluno);
		
		this.mensagem = "Tudo certo com seu cadastro";
		return SUCCESS;
	}
	
	public Aluno getAluno() {
		return aluno;
		
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public ArrayList<Aluno> getAlunoList() {
		return alunoList;
	}

	public void setAlunoList(ArrayList<Aluno> alunoList) {
		this.alunoList = alunoList;
	}
	
	
}
