package runnoobprac;

/*文件名 : Salary.java*/
public class Salary extends EmployeeDiaoYong {
	private double salary;
	public Salary(String name,String address, int number,double salary) {
		super(name,address,number);
		setSalary(salary);
	}
	public void mailCheck() {
		System.out.println("Salary类的mailCheck方法");
		System.out.println("邮票支票给 :" + getName() + " ,工资为 : " + salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary) {
		if(newSalary >= 0.0) {
			salary = newSalary;
		}
	}
	public double computePay() {
		System.out.println("计算工资，付给 :" + getName());
		return salary/52;
	}
}