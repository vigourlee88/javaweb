//用于获取有关对象的信息的方法称为访问器方法
//String类的一个访问器方法是length()方法
//它返回字符串对象包含的字符数

public class StringDemo01 {
	public static void main(String[] args) {
		//和其它对象一样，可以使用关键字和构造方法来创建 String 对象
		//用构造函数创建字符串：
		String site = "www.runoob.com";
		//调用String类.方法操作字符串
		int len = site.length();
		System.out.println("菜鸟教程网址长度 :" + len );
		
	}
}
