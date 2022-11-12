package runnoobprac;


/*Accessor and Mutator Methods访问器和修改器方法
 * 为了让其他类访问私有实例变量，我们将编写一个访问器方法（有时也称为“getter”方法）。
 * getter访问器方法将始终为public，并且将具有与它们正在访问的实例变量的类型相匹配的返回类型。
 * private实例变量通常具有 mutator 方法（有时称为“setter”）。
 * 这些方法允许其他类重置存储在private实例变量中的值。
 * Mutator 方法或“setter”通常是void方法——它们不返回任何内容，
 * 它们只是重置现有变量的值。
 * 同样，他们通常有一个参数与他们试图更改的变量类型相同
 */

public class Bank04{
	private CheckingAccount04 accountOne;
	private CheckingAccount04 accountTwo;
	
	public Bank04() {
		accountOne = new CheckingAccount04("Zeus",100,"1");
		accountTwo = new CheckingAccount04("Hades", 200, "2");
	}
	
	public static void main(String[] args) {
		Bank04 bankOfGods = new Bank04();
		System.out.println(bankOfGods.accountOne.getBalance());
		bankOfGods.accountOne.setBalance(5000);
		System.out.println(bankOfGods.accountOne.getBalance());
	}
}