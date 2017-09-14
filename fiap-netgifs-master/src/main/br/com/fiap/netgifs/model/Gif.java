package br.com.fiap.netgifs.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.util.StringUtils;

@Entity
@Table(name="GIF")
public class Gif {

	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name = "DS_GIF", nullable = false)
	private String urlGif;
	
	@Column(name = "DS_DESCRICAO", nullable = false)
	private String descricao;

	@Column(name = "DS_GENERO", nullable = false)
	private String genero;

	@Column(name = "DS_FAIXA_ETARIA", nullable = false)
	private String faixaEtaria;

	@Column(name = "DS_IDIOMA", nullable = false)
	private String idioma;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getUrlGif() {
		return urlGif;
	}
	
	public void setUrlGif(String urlGif) {
		this.urlGif = urlGif;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
}
