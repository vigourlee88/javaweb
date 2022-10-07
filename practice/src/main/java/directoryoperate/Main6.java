package directoryoperate;

import java.io.File;
import java.util.Date;

//使用 File 类的 file.lastModified() 方法来获取目录的最后修改时间：
public class Main6 {
	public static void main(String[] args) {
		File file = new File("C://FileIO//demo.txt");
		System.out.println("最后修改时间: " + new Date(file.lastModified()));
	}

}
