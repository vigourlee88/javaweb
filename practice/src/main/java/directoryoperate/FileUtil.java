package directoryoperate;

import java.io.File;
import java.io.IOException;

//使用 File 类的 file.getName() 和 file.listFiles() 方法来打印目录结构：
public class FileUtil {
	public static void main(String[] args)throws IOException {
		showDir(1,new File("d:\\Java"));
	}
	static void showDir(int indent,File file) throws IOException {
		for (int i = 0;i < indent;i++) 
			System.out.println('-');
		System.out.println(file.getName());
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(int i = 0;i < files.length;i++) {
				showDir(indent + 4,files[i]);
			}
		}
	}

}
