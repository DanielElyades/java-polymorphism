package entities;

public class Account {
	
	private Integer number;
	private String holder;
	//private Double balance;
	protected Double balance;
public Account() {
	
}

public Account(Integer number, String holder, Double balance) {
	//super();
	this.number = number;
	this.holder = holder;
	this.balance = balance;
}

public Integer getNumber() {
	return number;
}

public String getHolder() {
	return holder;
}

public Double getBalance() {
	return balance;
}

public void setNumber(Integer number) {
	this.number = number;
}

public void setHolder(String holder) {
	this.holder = holder;
}

//public void setBalance(Double balance) {
//	this.balance = balance;
//}
public void withdraw(double amount) {
//	if (amount < balance) {
//		
//	}
	balance -= amount + 5.0;
}
public void deposit(double amount) {
	balance += amount;
}

}
