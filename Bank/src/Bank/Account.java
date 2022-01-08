package Bank;
import java.util.Date;
public class Account {
	
	private int id=0;
	private double balance=0;
	private Date dateCreated;
	
	public Account() {

	}
	public Account(int id,double balance) {
		this.id=id;
		this.balance=balance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public double Withdraw (double money) {
		return balance=balance-money;
	}
	public double Deposit (double money) {
		return balance=balance+money;
	}
	
}
