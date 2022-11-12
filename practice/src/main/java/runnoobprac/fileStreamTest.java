package runnoobprac;

import java.io.*;
/*该类用来创建一个文件并向文件中写数据。
 *如果该流在打开文件进行输出前，目标文件不存在，那么该流会创建该文件。
 *有两个构造方法可以用来创建 FileOutputStream 对象。
 *使用字符串类型的文件名来创建一个输出流对象：
 *也可以使用一个文件对象来创建一个输出流来写文件。我们首先得使用File()方法来创建一个文件对象：
 *演示 InputStream 和 OutputStream 用法
 */

public class fileStreamTest {
	public static void main(String[] args) {
		try {
			byte bWrite[] = {11,21,3,4,5 };
			OutputStream os = new FileOutputStream("test.txt");
			for (int x = 0;x < bWrite.length;x++) {
				os.write(bWrite[x]);
			}
			os.close();
			
			InputStream is = new FileInputStream("test.txt");
			int size = is.available();
			
			for (int i = 0;i < size; i++) {
				System.out.print((char) is.read() + " ");
			}
			is.close();
		}catch (IOException e) {
			System.out.print("Exception");
		}
	}
}