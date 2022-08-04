/*多态存在的三个必要条件
 * 继承 ， 重写 ， 父类引用指向子类对象Parent p = new Child();
 * 使用多态方式调用方法时，
 * 首先检查父类中是否有该方法，
 * 如果没有，则编译错误；如果有，再去调用子类的同名方法。
 * 
 * 多态的好处：可以使程序有良好的扩展，并可以对所有类的对象进行通用处理。
 */

public class TestPolymorphism {
	public static void main(String[] args) {
		show(new Cat02());//以Cat对象调用show方法
		show(new Dog02());//以Dog对象调用show方法
		
		Animal02 a = new Cat02();//向上转型
		a.eat();             //调用的是Cat的eat
		Cat02 c = (Cat02)a;      //向下转型
		c.work();            //调用的是Cat的work
	}
	
	public static void show(Animal02 a )  {
		a.eat();
		//类型判断
		if (a instanceof Cat02) {//猫做的事情
			Cat02 c = (Cat02)a;
			c.work();
		}else if (a instanceof Dog02) {//狗做的事情
			Dog02 c =(Dog02)a;
			c.work();
		}
	}
}

abstract class Animal02 {
	abstract void eat();
}

class Cat02 extends Animal02 {
	public void eat() {
		System.out.println("吃鱼");
	}
	public void work() {
		System.out.println("抓老鼠");
	}
}

class Dog02 extends Animal02 {
	public void eat() {
		System.out.println("吃骨头");
	}
	public void work() {
		System.out.println("看家");
	}
}