package nselect.BankingApp.dao;

import java.util.List;


/**
 * Base model DAO to be used by the entity DAO's
 * @author Asus
 *
 * @param <T>
 */
public interface GenericDao<T> {
	
	
	public void persist(T entity);
	
	public void update(T entity);
	
	public T findByID(int id);
	
	public void delete(T entity);
	
	public List<T> findAll();

}
