package fileoperate;

import java.io.File;

//使用 File 类的 file.exists() 方法来检测文件是否存在：
public class Main10 {
	public static void main(String[] args) {
		File file = new File("C:/java.txt");
		System.out.println(file.exists());
	}

}
