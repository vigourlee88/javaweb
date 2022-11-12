package runnoobprac;


public class CheckingAccount01 {
	private String name;
	private int balance;
	private String id;
	private double interestRate;
	
	public CheckingAccount01(String inputName,int inputBalance,String inputId) {
		this.name = inputName;
		this.balance = inputBalance;
		this.id = inputId;
		this.interestRate = 0.02;
	}
	
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int newBalance) {
		this.balance = newBalance;
	}
	public double getMonthlyInterest() {
		return this.interestRate * this.balance;
	}
}