package streamtest;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*将文件中存储的基本数据类型变量和字符串读取到内存中，保存在变量中
 * 注意点 读取不同类型的数据的顺序要与当初写入文件时，保存的数据顺序一致！
 */
public class TestDataStream2 {
	public static void main(String[] args) throws IOException {
		
		//1.数据流 转换流
		DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
		
		//2.读写
		String name = dis.readUTF();
		int age = dis.readInt();
		boolean isMale = dis.readBoolean();
		
		System.out.println("name= :" + name);
		System.out.println("age= :" + age);
		System.out.println("isMale= " + isMale);
		
		//3.关闭资源
		dis.close();
	}

}
