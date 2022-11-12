package runnoobprac;

/*
 * 字符串属于对象，
 * Java 提供了 String 类来创建和操作字符串。
 * 在代码中遇到字符串常量时，这里的值是 "Runoob"，编译器会使用该值创建一个 String 对象。
 * 和其它对象一样，可以使用关键字和构造方法来创建 String 对象。
 * 用构造函数创建字符串：
 *使用'+'操作符来连接字符串
*/
public class StringDemo02{
	public static void main(String[] args) {
		String string1 = "菜鸟教程网址 :";
		System.out.println("1, " + string1 + "www.runoob.com");
		
	}
}