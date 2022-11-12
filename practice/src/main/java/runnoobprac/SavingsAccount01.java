package runnoobprac;

/*The this Keyword
 * By default, Java refers to the local variable name. 
 * So in this case, the value passed to the parameter will be printed and not the instance variable.
 * 默认情况下，Java 引用局部变量名。所以在这种情况下，传递给参数的值将被打印出来，而不是实例变量。
 * 
 * If we wanted to access the instance variable and not the local variable, 
 * we could use the this keyword.
 * 如果我们想访问实例变量而不是局部变量，我们可以使用this关键字。
 */

public class SavingsAccount01 {
	public String owner;
	public int balanceDollar;
	public double balanceEuro;
	
	public SavingsAccount01(String owner,int balanceDollar) {
		//Complete the constructor
		this.owner = owner;
		this.balanceDollar = balanceDollar;
		this.balanceEuro = balanceDollar * 0.85;
		
	}
	
	public void addMoney(int balanceDollar) {
		//Complete this method
		System.out.println("Adding " + balanceDollar +" dollars to the account.");
		this.balanceDollar += balanceDollar;
		System.out.println("The new balance is " + this.balanceDollar + " dollars.");
	}
	
	public static void main(String[] args) {
		SavingsAccount01 zeusSavingsAccount = new SavingsAccount01("Zeus",1000);
		
		//make a call to addMoney() to test your method
		zeusSavingsAccount.addMoney(2000);
		
	}
	
}