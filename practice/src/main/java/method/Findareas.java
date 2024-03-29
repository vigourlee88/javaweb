package method;

/*方法重载(Overloading)：如果有两个方法的方法名相同但参数不一致，
 * 那么可以说一个方法是另一个方法的重载。
 * 
 * 
 * 方法覆盖（Overriding）：如果在子类中定义一个方法，其名称、返回类型及参数签名正好与父类中某个方法的名称、返回类型及参数签名相匹配，
 * 那么可以说，子类的方法覆盖了父类的方法
 */
public class Findareas {
	public static void main(String[] args) { 
		Figure f = new Figure(10,10);
		Rectangle r= new Rectangle(9,5);
		Figure figref;
		figref = f;
		System.out.println("Area is :" +figref.area());
		figref = r;
		System.out.println("Area is :" + figref.area());
	}	
}
class Figure {
	double dim1;
	double dim2;
	Figure(double a,double b) {
		dim1 = a;
		dim2 = b;
	}
	Double area() {
		System.out.println("Inside area for figure.");
		return(dim1*dim2);
	}
}
class Rectangle extends Figure {
	Rectangle(double a,double b) {
		super(a,b);
	}
	Double area() {
		System.out.println("Inside area forrectangle.");
		return (dim1*dim2);
	}
}
