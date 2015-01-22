package lham.projects.cucumber.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class BaseIT {

	private static EntityManagerFactory entityManagerFactory;
	protected static EntityManager entityManager;

	public void startConnection() {
		if (entityManagerFactory == null || !entityManagerFactory.isOpen()) {
			entityManagerFactory = Persistence.createEntityManagerFactory("CUCUMBER_TEST");
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
		}
	}

	public void closeConnection() {
		if (entityManagerFactory.isOpen()) {

			if (!entityManager.getTransaction().getRollbackOnly()) {
				this.commit();
			} else {
				this.rollback();
			}
		}
	}

	private void commit() {
		entityManager.getTransaction().commit();
		entityManagerFactory.close();
	}

	private void rollback() {
		entityManager.getTransaction().rollback();
		entityManagerFactory.close();
	}
}