package instance;

/* 字符串比较
 * 通过字符串 函数 compareTo (string) ，
 * compareToIgnoreCase(String) 及
 * compareTo(object string) 
 *来比较两个字符串，并返回字符串中第一个字母ASCII的差值。
 */
public class StringCompareEmp {
	public static void main(String[] args) {
		String str = "Hello World";
		String anotherString = "hello world";
		Object objStr = str;
		
		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));//忽略大小写
		System.out.println(str.compareTo(objStr.toString()));
		
		
	}

	
}
