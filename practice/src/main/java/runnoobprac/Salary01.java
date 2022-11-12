package runnoobprac;

/*文件名: Salary.java*/

public class Salary01 extends EmployeeAbstract {
	private double salary;
	public Salary01(String name, String address,int number,double salary) {
		super(name,address,number);
		setSalary01(salary);
	}
	public void mailCheck() {
		System.out.println("Within mailCheck of Salary class");
		System.out.println("Mailing check to " + getName()
		                    + " with salary " + salary);
	}
	public double getSalary01() {
		return salary;
	}
	public void setSalary01(double newSalary) {
		if(newSalary >= 0.0) {
			salary = newSalary;
		}
	}
	public double computePay() {
		System.out.println("Computing salary pay for "+ getName());
		return salary/52;
	}
}