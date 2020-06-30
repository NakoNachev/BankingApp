package nselect.BankingApp.dao;

import org.hibernate.Session;

public interface SessionControlInterface {
	
	public Session openCurrentSession();
	public Session openCurrentSessionWithTransaction();
	public void closeCurrentSession();
	public void closeCurrentSessionWithTransaction();


}
