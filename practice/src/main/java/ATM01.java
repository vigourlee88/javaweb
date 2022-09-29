/*
 * Static methods and variables are associated with the class as a whole, not objects of the class.
 * 静态方法和变量与整个类相关联，而不是与类的对象相关联
 * Static methods and variables are declared as static by using the static keyword upon declaration.
 * 静态方法和变量在声明时使用static关键字声明为静态。
 * Static methods cannot interact with non-static instance variables. This is due to static methods not having a this reference.
 * 静态方法不能与  非静态实例变量   交互。这是由于静态方法没有this引用。
 * Both static methods and non-static methods can interact with static variables.
 * 静态方法和非静态方法都可以与 静态变量 交互
 */

public class ATM01{
	//Static variables
	public static int totalMoney = 0;
	public static int numATMs = 0;
	
	//instance variables
	public int money;
	
	public ATM01(int inputMoney) {
		this.money = inputMoney;
		numATMs += 1;
		totalMoney += inputMoney;
	}
	
	public void withdrawMoney(int amountToWithdraw) {
		if(amountToWithdraw <= this.money) {
			this.money -= amountToWithdraw;
			totalMoney -= amountToWithdraw;
		}
	}
	
	
	public static void averageMoney() {
	  System.out.println(totalMoney / numATMs);
//		System.out.println(this.money);non-static variable this cannot be referenced from a static context
      
	} 
	
	public static void main(String[] args) {
		
		System.out.println("Total number of ATMs: " + ATM01.numATMs);
		ATM01 firstATM = new ATM01(1000);
		ATM01 secondATM = new ATM01(500);
		System.out.println("Total number of ATMs: " + ATM01.numATMs);
		
		System.out.println("Total amount of money in all ATMs: " + ATM01.totalMoney);  
	    firstATM.withdrawMoney(500);
	    secondATM.withdrawMoney(200);
	    System.out.println("Total amount of money in all ATMs: " + ATM01.totalMoney);    
	    
	    //Call averageMoney() here
	    ATM01.averageMoney();
	     
	}
}