package runnoobprac;

public class Bank02 {
	private CheckingAccount02 accountOne;
	private CheckingAccount02 accountTwo;
	
	public Bank02() {
		accountOne = new CheckingAccount02("Zeus",100,"1");
		accountTwo = new CheckingAccount02("Hades",200,"2");
	}
	
	public static void main(String[] args) {
		Bank02 bankOfGods = new Bank02();
//		System.out.println(bankOfGods.accountOne.name);
		bankOfGods.accountOne.addFunds(5);
		bankOfGods.accountOne.getInfo();
		
	}
	
}