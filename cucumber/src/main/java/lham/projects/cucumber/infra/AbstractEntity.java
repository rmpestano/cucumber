package lham.projects.cucumber.infra;

import java.io.Serializable;

import javax.persistence.Transient;

/**
 * Classe base para as classes de entidade.
 * 
 * @author Luiz Henrique A. Mello
 * 
 * @param <K>
 *            tipo da chave primária da entidade.
 */
public abstract class AbstractEntity<K> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Retorna a chave primária da entidade.
	 * 
	 * @return a chave primária da entidade.
	 */
	public abstract K getPrimaryKey();

	/**
	 * Define a chave primária da entidade.
	 * 
	 * @param primaryKey
	 *            chave primária.
	 */
	public abstract void setPrimaryKey(final K primaryKey);

	@Transient
	private PropLista propLista = new PropLista();

	protected PropLista getPropLista() {
		return propLista;
	}

	protected void setPropLista(PropLista propLista) {
		this.propLista = propLista;
	}
}
