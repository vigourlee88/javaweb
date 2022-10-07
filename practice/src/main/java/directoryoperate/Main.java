package directoryoperate;

import java.io.File;

//使用 File 类的 mkdirs() 实现递归创建目录 ：
public class Main {
	public static void main(String[] args) {
		String directories = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
		File file = new File(directories);
		boolean result = file.mkdirs();
		System.out.println("Status = " + result);
	}

}
