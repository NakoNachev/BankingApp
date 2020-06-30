package nselect.BankingApp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import nselect.BankingApp.dao.GenericDao;
import nselect.BankingApp.dao.UsersDao;
import nselect.BankingApp.entities.Users;

@Service
public class UsersService implements GenericDao<Users> {
	
	private UsersDao usersDao;
	
	public UsersService() {
		
		this.usersDao = new UsersDao();
	}

	@Override
	public void persist(Users entity) {
		usersDao.openCurrentSessionWithTransaction();
		usersDao.persist(entity);
		usersDao.closeCurrentSessionWithTransaction();
		
	}

	@Override
	public void update(Users entity) {
		usersDao.openCurrentSessionWithTransaction();
		usersDao.update(entity);
		usersDao.closeCurrentSessionWithTransaction();
		
	}
	
	/**
	 * Not being used, just a implementation of the interface method
	 */
	@Override
	public Users findByID(int id) {
		
		return null;
	}
	
	public Users findByUsername(String username) {
		
		usersDao.openCurrentSession();
		Users user = usersDao.findByUsername(username);
		usersDao.closeCurrentSession();
		return user;
	}

	@Override
	public void delete(Users entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Users> findAll() {
		
		usersDao.openCurrentSessionWithTransaction();
		List<Users> users = usersDao.findAll();
		usersDao.closeCurrentSessionWithTransaction();
		
		return users;
	}

}
