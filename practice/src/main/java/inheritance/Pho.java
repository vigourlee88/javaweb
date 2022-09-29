package inheritance;

/* 子类继承其父类的字段和方法，这意味着它也继承了父类的构造函数。
 * 有时我们可能想修改构造函数，在这种情况下我们可以使用super()方法，
 * 它的作用类似于子类构造函数中的父构造函数。 
 */

class Pho extends Noodle01 {
	public Pho() {
		super(30.0,0.64,"flat","rice flour");
	}
}