package nselect.BankingApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import nselect.BankingApp.entities.Users;


/**
 * Implements the opening of sessions, transactions and builds the SessionFactory
 * 
 *
 */
public class SessionTransactionControl implements SessionControlInterface {

	Session currentSession;
	Transaction currentTransaction;
	
	private static SessionFactory getSessionFactory() {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();
		
		return factory;
	}
	
	
	
	@Override
	public Session openCurrentSession() {
		this.currentSession = getSessionFactory().openSession();
		return null;
	}

	@Override
	public Session openCurrentSessionWithTransaction() {
		this.currentSession = getSessionFactory().openSession();
		this.currentTransaction = this.currentSession.beginTransaction();
		return null;
	}

	@Override
	public void closeCurrentSession() {
		
		if (this.currentSession != null) {
			this.currentSession.close();
		}
		
	}

	@Override
	public void closeCurrentSessionWithTransaction() {
		this.currentTransaction.commit();
		this.currentSession.close();
		
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}
	
	

}
