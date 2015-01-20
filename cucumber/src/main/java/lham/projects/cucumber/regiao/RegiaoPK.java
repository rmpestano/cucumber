package lham.projects.cucumber.regiao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lham.projects.cucumber.pais.Pais;

@Embeddable
public class RegiaoPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "NOME", length = 100, nullable = false)
	private String nomeRegiao;

	@JoinColumn(name = "PAIS", nullable = false)
	@ManyToOne
	private Pais pais;

	public String getNomeRegiao() {
		return nomeRegiao;
	}

	public void setNomeRegiao(String nomeRegiao) {
		this.nomeRegiao = nomeRegiao;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
