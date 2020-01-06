package utils;

import java.io.Serializable;

import javax.persistence.EntityManager;

public abstract class RepositorioGenerico<E extends Serializable, PK extends Serializable> {

	private final transient Class<E> entityClass;

	public RepositorioGenerico(final Class<E> entityClass) {
		this.entityClass = entityClass;
	}

	protected abstract EntityManager getEntityManager();

	public void create(final E entity) {
		final EntityManager entityManager = getEntityManager();
		entityManager.persist(entity);
	}

	public final E find(final PK id) {
		return getEntityManager().find(entityClass, id);
	}

	// Other common operations

}
