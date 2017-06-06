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
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ALUNO", catalog="dbtarefa")
public class Aluno implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_ALUNO", unique=true, nullable=false)
	private Integer idAluno;

	@Column(name="NOME_ALUNO", unique=false, nullable=false,
			length=45)
	private String nome;
	
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "aluno")
	private Set<Materia> materia = new LinkedHashSet<Materia>();

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Materia> getMateria() {
		return materia;
	}

	public void setMateria(Set<Materia> materia) {
		this.materia = materia;
	}

	    
    
}
