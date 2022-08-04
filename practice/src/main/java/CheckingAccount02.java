public class CheckingAccount02 {
	private String name;
	private int balance;
	private String id;
	
	public CheckingAccount02(String inputName,int inputBalance,String inputId) {
		name = inputName;
		balance = inputBalance;
		id = inputId;
	}
	
	public void addFunds(int fundsToAdd) {
		balance += fundsToAdd;
	}
	
	public void getInfo() {
		System.out.println("This checking account belongs to " + name + ". It has " + balance + " doolars in it.");
		
	}
	
}