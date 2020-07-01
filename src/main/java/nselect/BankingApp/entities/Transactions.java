package nselect.BankingApp.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactions")
public class Transactions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="sender")
	private String sender;
	
	@Column(name="receiver")
	private String receiver;
	
	@Column(name="issueDate")
	private Date issueDate;
	
	@Column(name="amount")
	private double amount;
	
	public Transactions() {
		
	}
	
	public int getId() {
		return id;
	}
	public String getSender() {
		return sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transactions [id=" + id + ", sender=" + sender + ", receiver=" + receiver + ", issueDate=" + issueDate
				+ ", amount=" + amount + "]";
	}
	
	
	

}
