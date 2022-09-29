package fileoperate;

import java.io.File;

//使用 File 类的 file.setReadOnly() 和 file.canWrite() 方法来设置文件只读：
public class Main9 {
	public static void main(String[] args) {
		File file = new File("C:/java.txt");
		System.out.println(file.setReadOnly());
		System.out.println(file.canWrite());
	}

}
