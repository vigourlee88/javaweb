package fileoperate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//使用 File 类的 createTempFile(String prefix, String suffix); 
//方法在默认临时目录来创建临时文件，
//参数 prefix 为前缀，suffix 为后缀：
public class Main5 {
	public static void main(String[] args) throws Exception {
		File temp = File.createTempFile("testrunoobtmp", ".txt");
		System.out.println("文件路径: " + temp.getAbsolutePath());
		temp.deleteOnExit();
		BufferedWriter out = new BufferedWriter(new FileWriter(temp));
		out.write("aString");
		System.out.println("临时文件已创建:");
		out.close();
	}
}
