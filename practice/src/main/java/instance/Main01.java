package instance;

import java.util.StringTokenizer;

/*字符串分隔(StringTokenizer)
 *使用 StringTokennizer 设置不同分隔符来分隔字符串，
 *默认的分隔符是：空格、制表符（\t）、换行符(\n）、回车符（\r）。 
 * StringTokennizer 使用空格和等号来分隔字符串： 
 */
public class Main01 {
	public static void main(String[] args) {
		String str = "This is String , split by StringTokenizer, created by runoob";
		
		StringTokenizer st = new StringTokenizer(str);
		
		System.out.println("-----通过空格分离-----");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		System.out.println("-----通过逗号分隔-----");
		StringTokenizer str2 = new StringTokenizer(str,",");
		
		while(str2.hasMoreElements()) {
			System.out.println(str2.nextElement());
		}
		
	}


}
