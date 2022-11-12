package runnoobprac;

//super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。
//this关键字：指向自己的引用
class Animal {
	void eat() {
		System.out.println("animal : eat");
	}
}

class Dog01 extends Animal {
	void eat() {
		System.out.println("dog : eat");
	}
	void eatTest() {
		this.eat();//this 调用自己的方法
		super.eat();//super 调用父类方法
	}
}

public class TestThisSuper {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		Dog01 d = new Dog01();
		d.eatTest();
	}
}