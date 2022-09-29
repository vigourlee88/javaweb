package fileoperate;

import java.io.File;
import java.io.IOException;

//使用 File 类的 file.createTempFile() 方法在指定目录中创建文件：
public class Main11 {
	public static void main(String[] args) throws Exception {
		File file = null;
		File dir = new File("C:/");
		file = File.createTempFile("JavaTemp","javatemp",dir);
		System.out.println(file.getPath());
		
	}
}
