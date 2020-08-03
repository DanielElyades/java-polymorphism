package entities;

public final class SavingsAccount extends Account {
	
	private Double interstRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, double interstRate) {
		super(number, holder, balance);
		this.interstRate = interstRate;
	}
	
	public double getInterstRate() {
		return interstRate;
	}
	
	public void setInterstRate(double interstRate) {
		this.interstRate = interstRate;
	}
	
	public void updateBalance() {
		balance += balance * interstRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
