package javaversion8;

/*默认方法实例
*默认方法就是接口可以有实现方法，而且不需要实现类去实现其方法。
*只需在方法名前面加个 default 关键字即可实现默认方法。
*/
public class Java8Tester6 {
	public static void main(String[] args) {
		Vehicle01 vehicle = new NewCar();
		vehicle.print();
	}
}
interface Vehicle01 {
	default void print() {
		System.out.println("我是一辆车!");
	}
	static void blowHorn() {
		System.out.println("按喇叭!!!");
	}
}
interface FourWheeler01 {
	default void print() {
		System.out.println("我是一辆四轮车!");
	}
}
class NewCar implements Vehicle01,FourWheeler01 {
	public void print() {
		Vehicle01.super.print();
		FourWheeler01.super.print();
		Vehicle01.blowHorn();
		System.out.println("我是一辆汽车!");
	}
}
