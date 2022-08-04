
/*控制台的输出由 print( ) 和 println() 完成更为方便。
 * 这些方法都由类 PrintStream 定义，
 * System.out 是该类对象的一个引用
 *PrintStream 继承了 OutputStream类，并且实现了方法 write()。
 *这样，write() 也可以用来往控制台写操作。
 *PrintStream 定义 write() 的最简单格式如下所示：
 */
  import java.io.*;

public class WriteDemo {
	public static void main(String[] args) {
		int b;
		b ='A';
		System.out.write(b);
		System.out.write('\n');
	}
}