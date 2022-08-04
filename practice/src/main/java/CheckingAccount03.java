public class CheckingAccount03 {
	private String name;
	private int balance;
	
	public CheckingAccount03(String inputName,int inputBalance) {
		name = inputName;
		balance = inputBalance;
	}
	
	public void addFunds(int fundsToAdd) {
		balance += fundsToAdd;
	}
	private void getInfo() {
		System.out.println("This checking account belongs to "+ name +". It has " + balance + "dollars in it.");
	}
	
	public static void main(String[] args) {
		CheckingAccount03 myAccount = new CheckingAccount03("Lisa",2000);
		System.out.println(myAccount.balance);
		myAccount.addFunds(5);
		System.out.println(myAccount.balance);
	}
}