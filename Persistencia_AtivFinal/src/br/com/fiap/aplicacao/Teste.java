package br.com.fiap.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.Materia;
import br.com.fiap.entity.Atividades_Materia;
import br.com.fiap.helper.Helper;


public class Teste {
	
	//private static final Int idAluno = 1234";
	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("jpaPU");
		EntityManager createEntityManager = emf.createEntityManager();
		
		incluirAluno(createEntityManager);
		//listarFuncionarios(createEntityManager);
		//buscarFuncionario(createEntityManager, MATRICULA);
	}
	
	private static void incluirAluno(EntityManager em){
		Helper dao = new Helper(em);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Cecilia R do Amaral");
		Materia materia = new Materia();
		materia.setNomeMateria("Matematica");
		materia.setAluno(aluno);
		
		
		try {
			dao.salvarAluno(aluno);
			dao.salvarMateria(materia);
			System.out.println("Aluno OK");
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/*private static void listarFuncionarios(EntityManager em){
		Helper dao = new Helper(em);
		List<Funcionario> funcionarios = dao.listarTodos();
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getMatricula() + ": " + funcionario.getNome());
		}
	}
	private static void buscarFuncionario(EntityManager em, String
			matricula){
		Helper dao = new Helper(em);
		Funcionario f = dao.buscarFuncionario(matricula);
		System.out.println(f.getMatricula() + ": " + f.getNome());
	}
	*/
}