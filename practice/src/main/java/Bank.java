/*Access,Encapsulation,Scope
 * public and private关键字用于定义代码的哪些部分
 * 可以访问其他类、方法、构造函数和实例变量。
 * 
 * 封装是一种用于对其他类隐藏实现细节的技术。
 * 它的目的是创建小的逻辑捆绑。
 *
 *局部变量只能在定义它们的范围内使用。
 *this关键字可用于在编写类时调用方法。
 */

public class Bank {
	private CheckingAccount01 accountOne;
	private CheckingAccount01 accountTwo;
	
	public Bank() {
		accountOne = new CheckingAccount01("Zeus",100,"1");
		accountTwo = new CheckingAccount01("hades",200,"2");	
	}
	
	public static void main(String[] args) {
		Bank bankOfGods = new Bank();
		System.out.println(bankOfGods.accountOne.getBalance());
		bankOfGods.accountOne.setBalance(5000);
		System.out.println(bankOfGods.accountOne.getBalance());
		System.out.println(bankOfGods.accountOne.getMonthlyInterest());
		
		
	}
}