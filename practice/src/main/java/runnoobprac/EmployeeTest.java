package runnoobprac;

import java.io.*;

public class EmployeeTest {
	public static void main(String[] args) {
		//使用构造器创建两个对象
	Employee01 empOne = new Employee01("RUNOOB1");
	Employee01 empTwo = new Employee01("RUNOOB2");
	
	//调用这两个对象的成员方法
	empOne.empAge(26);
	empOne.empDesignation("高级程序员");
	empOne.empSalary(1000);
	empOne.printEmployee();
	
	empTwo.empAge(21);
	empTwo.empDesignation("菜鸟程序员");
	empTwo.empSalary(500);
	empTwo.printEmployee();	
		
	}
	
}