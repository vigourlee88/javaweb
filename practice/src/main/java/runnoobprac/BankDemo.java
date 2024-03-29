package runnoobprac;

//文件名称 BankDemo.java
//BankDemo 程序示范了如何调用 CheckingAccount 类的 deposit() 和 withdraw() 方法。
public class BankDemo {
	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount(101);
		System.out.println("Depositing $500...");
		c.deposit(500.00);
		try {
			System.out.println("\nWithdrawing $100...");
			c.withdraw(100.00);
			System.out.println("\nWithdrawing $600...");
			c.withdraw(600.00);
		}catch(InsufficientFundsException e) {
			System.out.println("Sorry, but you are short $" + e.getAmount());
			e.printStackTrace();
		}
	}
}