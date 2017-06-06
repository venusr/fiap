package br.com.fiap.entity;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MATERIA", catalog="dbtarefa")
public class Materia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_MATERIA", unique=true, nullable=false)
	private Integer idMateria;

	@Column(name="NOME_MATERIA", unique=false, nullable=false,
			length=45)
	private String nomeMateria;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ALUNO")
	private Aluno aluno;
	
	//@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="materia")
	//private Set<Atividades_Materia> atividadesMateria = new LinkedHashSet<Atividades_Materia>();

	public Integer getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

		
	//public Set<Atividades_Materia> getAtividadesMateria() {
	//	return atividadesMateria;
	//}

	//public void setAtividadesMateria(Set<Atividades_Materia> atividadesMateria) {
	//	this.atividadesMateria = atividadesMateria;
	//}
	
}
