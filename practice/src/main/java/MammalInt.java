/*文件名 :MammalInt.java*/
/*当类实现接口的时候，类要实现接口中所有的方法。否则，类必须声明为抽象类。
 *类使用implements关键字实现接口。在类声明中，implements关键字放在class声明后面
 *重写接口中声明的方法时
 *类在实现接口的方法时，不能抛出强制性异常，只能在接口中，或者继承接口的抽象类中抛出该强制性异常。
 *类在重写方法时要保持一致的方法名，并且应该保持相同或者相兼容的返回值类型。
 *如果实现接口的类是抽象类，那么就没必要实现该接口的方法。
 *实现一个接口的语法
 *一个类可以同时实现多个接口。
 *一个类只能继承一个类，但是能实现多个接口。
 *一个接口能继承另一个接口，这和类之间的继承比较相似。
 */
public class MammalInt implements Animal03 {
	
	public void eat() {
		System.out.println("Mammal eats");
	}
	public void travel() {
		System.out.println("Mammal travels");
	}
	public int noOfLegs() {
		return 0;
	}
	
	public static void main(String[] args) {
		MammalInt m = new MammalInt ();
		m.eat();
		m.travel();
	}
}