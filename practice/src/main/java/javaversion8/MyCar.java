package javaversion8;

public class MyCar implements Vehicle,FourWheeler{
	
	//创建自己的默认方法，来覆盖重写接口的默认方法：
	//default void print() {
	//	System.out.println("我是一辆四轮汽车!");
//	}
	//可以使用 super 来调用指定接口的默认方法：
	public void print() {
		Vehicle.super.print();
	}
}
