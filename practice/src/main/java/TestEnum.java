/*枚举enum类也可以声明在内部类中
 * 枚举是一个特殊的类，一般表示一组常量
 * 枚举类使用enum关键字来定义，各个常量使用逗号，来分割
 */
public class TestEnum {
	enum Color {
		RED,GREEN,BLUE;
	}
	// 每个枚举都是通过class在内部实现的，且所有的枚举值都是public static final的
	//枚举类Color转化在内部类实现
	//class Color {
	//public static final Color RED = new Color();
	//public static final Color BLUE = new Color();
	//public static final Color GREEN = new Color();
	//}
	public static void main(String[] args) {
		Color c1 = Color.RED;
		System.out.println(c1);
	}
}