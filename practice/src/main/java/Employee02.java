public class Employee02 {
	//这个实例变量对子类可见
	public String name;
	//私有变量，仅在此类中可见
	private double salary;
	//在构造器中对name赋值
	public Employee02(String empName) {
		name = empName;	
	}
	//设定salary的值
	public void setSalary(double empSal) {
		salary = empSal;	
	}
	 //打印信息
	public void printEmp() {
		System.out.println("名字:" + name);
		System.out.println("薪水:" + salary );
	}
	public static void main(String[] args) {
		Employee02 empOne = new Employee02("RUNOOB");
		empOne.setSalary(1000.0);
		empOne.printEmp();
	}
	
}