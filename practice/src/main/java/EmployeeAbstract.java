/*文件名: Employee.java*/
/*如果一个类包含抽象方法，那么该类必须是抽象类。
 *任何子类必须重写父类的抽象方法，或者声明自身为抽象类。 
 * 
 * 如果你想设计这样一个类，该类包含一个特别的成员方法，该方法的具体实现由它的子类确定，
 * 那么你可以在父类中声明该方法为抽象方法。
 *Abstract 关键字同样可以用来声明抽象方法，抽象方法只包含一个方法名，而没有方法体。
 *抽象方法没有定义，方法名后面直接跟一个分号，而不是花括号。
 * 
 * 继承抽象方法的子类必须重写该方法。否则，该子类也必须声明为抽象类。
 * 最终，必须有子类实现该抽象方法，
 * 否则，从最初的父类到最终的子类都不能用来实例化对象。
 */

public abstract class EmployeeAbstract {
	
	private String name;
	private String address;
	private int number;
	public EmployeeAbstract(String name,String address,int number) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public double computePay() {
		System.out.println("Inside Employee computePay");
		return 0.0;
	}
	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name
				            + " " + this.address);
	}
	public String toString() {
		return name + " " + address + " "+ number;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String newAddress) {
		address = newAddress;
	}
}