package nselect.BankingApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Entity class for all the users in the app
 * @author Asus
 *
 */
@Entity
@Table(name="users")
public class Users {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="acc_balance")
	private double accBalance;
	
	@Column(name="email")
	private String email;

	public Users() {
		
	}
	

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		

	public double getAccBalance() {
		return accBalance;
	}

	public String getEmail() {
		return email;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", accBalance=" + accBalance + ", email="
				+ email + "]";
	}


	
	
	

}
