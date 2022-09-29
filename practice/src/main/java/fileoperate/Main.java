package fileoperate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 author by runoob.com
 Main.java  
 */

//使用 write() 方法向文件写入内容：
public class Main {
	public static void main(String[] args) {
		try {
			BufferedWriter out =new BufferedWriter(new FileWriter("runoob.txt"));
			out.write("菜鸟教程");
			out.close();
			System.out.println("文件创建成功 ! ");
		}catch (IOException e) {
		}
	}
}
