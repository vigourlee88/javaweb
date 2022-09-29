package methodexer;

/*Object toString() 方法用于返回对象的字符串表示形式。
*返回对象的字符串表示形式。
*默认返回格式：java.lang.Object - 类名 + @ + 哈希值的十六进制字符串。
*/
public class RunoobTest06 {
	public static void main(String[] args) {
		
		//toString() with Object
		Object obj1 = new Object();
		System.out.println(obj1.toString());//java.lang.Object@3d012ddd
		
		Object obj2 = new Object();
		System.out.println(obj2.toString());//java.lang.Object@626b2d4a
		
		Object obj3 = new Object();
		System.out.println(obj3.toString());//java.lang.Object@5e91993f

	}
	

}
