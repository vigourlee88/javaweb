package runnoobprac;


/*读取控制台输入
 * java控制台输入是由System.in完成
 * 为了获得一个绑定到控制台的字符流，
 * 你可以把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流
 * 从 BufferedReader 对象读取一个字符要使用 read() 方法
 * 每次调用 read() 方法，它从输入流读取一个字符并把该字符作为整数值返回。
 *  当流结束的时候返回 -1。该方法抛出 IOException
 * 
 */

//使用BufferedReader从控制台读取字符
import java.io.*;

public class BRRead {
	public static void main(String[] args) throws IOException {
		char c;
		//使用System.in创建BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按下'q'键退出。 ");
		//读取字符
		do {
			c = (char)br.read();
			System.out.println(c);
		}while(c != 'q');
	}
}