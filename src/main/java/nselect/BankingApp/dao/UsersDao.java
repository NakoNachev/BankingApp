package nselect.BankingApp.dao;

import java.util.List;

import nselect.BankingApp.entities.Users;

public class UsersDao extends SessionTransactionControl implements GenericDao<Users> {

	@Override
	public void persist(Users entity) {
		super.getCurrentSession().save(entity);
		
	}

	@Override
	public void update(Users entity) {
		super.getCurrentSession().saveOrUpdate(entity);
		
	}

	@Override
	public Users findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Users findByUsername(String username) {
		
		Users user = super.currentSession.find(Users.class, username);
		return user;
	}

	@Override
	public void delete(Users entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Users> findAll() {
		
		List<Users> users = super.getCurrentSession().createQuery("from Users u").getResultList();
		return users;
	}



}
