package br.com.fiap.helper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.Materia;
import br.com.fiap.entity.Atividades_Materia;

public class Helper {
	private EntityManager em;
	public Helper(EntityManager em){
		this.em = em;
	}
	public void salvarAluno(Aluno aluno) throws Exception {
		try {
			
			em.getTransaction().begin();
			em.persist(aluno);
			em.getTransaction().commit();
		}
		catch (Exception e) {
			throw e;
		} finally {
		}
	}
	public void salvarMateria(Materia materia) throws Exception {
		try {
			
			em.getTransaction().begin();
			em.persist(materia);
			em.getTransaction().commit();
		}
		catch (Exception e) {
			throw e;
		} finally {
		}
	}
	
	
	//JPQL: Usando Query
	//public List<Funcionario> listarFuncionarios(){
	//	Query query = em.createQuery("select f from Funcionario f");
	//	return query.getResultList();
	//}
	
	//public Funcionario buscarFuncionario(String numMatricula){
	//	Query query = em.createQuery("select f from Funcionario f where matricula = :matricula");
	//			query.setParameter("matricula", numMatricula);
	//			Funcionario f = (Funcionario)query.getSingleResult();
	//			return f;
	//}
	
	//public Funcionario buscarFuncionario(int id){
	//	Funcionario funcionario = this.em.find(Funcionario.class, id);
	//	return funcionario;
	//}
	
	//JPQL: usando NamedQuery
	//public List<Funcionario> listarTodos(){
	//	Query query = em.createNamedQuery("Funcionario.findAll");
	//	return query.getResultList();
	//} 
}	