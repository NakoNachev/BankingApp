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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nickname")
	private String nickname;
	
	@Column(name="password")
	private String password;
	
	@Column(name="acc_balance")
	private double accBalance;
	
	@Column(name="email")
	private String email;

	public Users() {
		
	}
	
	public int getId() {
		return id;
	}
	public String getNickname() {
		return nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
		return "Users [id=" + id + ", nickname=" + nickname + ", password=" + password + "]";
	}
	
	
	

}
