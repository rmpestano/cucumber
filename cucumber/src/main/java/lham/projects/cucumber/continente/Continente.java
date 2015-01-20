package lham.projects.cucumber.continente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import lham.projects.cucumber.infra.AbstractEntity;

@Entity
@Table(name = "CONTINENTE")
@NamedQueries(value = { @NamedQuery(name = "Continente.findByPk", query = "SELECT c FROM Continente c WHERE c.nome = :pk") })
public class Continente extends AbstractEntity<String> {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "NOME", nullable = false, length = 20)
	@NotBlank
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getPrimaryKey() {
		return this.getNome();
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		this.setNome(primaryKey);
	}
}
 