package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ATIVIDADES_MATERIA", catalog="dbtarefa")
public class Atividades_Materia implements Serializable{

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}

	public String getNotaAtividade() {
		return notaAtividade;
	}

	public void setNotaAtividade(String notaAtividade) {
		this.notaAtividade = notaAtividade;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_ATIVIDADE", unique=true, nullable=false)
	private Integer id;
	
	@Column(name="NOME_ATIVIDADE", unique=false, nullable=false,
			length=45)
	private String nomeAtividade;
	
	@Column(name="NOTA_ATIVIDADE", unique=false, nullable=false)
	private String notaAtividade;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MATERIA")
	private Materia materia;
	
}
