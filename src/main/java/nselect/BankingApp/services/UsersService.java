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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Users entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Users findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Users entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
