package directoryoperate;

import java.io.File;

//使用 File 类的 file.isHidden() 方法来判断文件是否隐藏：
public class Main3 {
	public static void main(String[] args) {
		File file = new File("C:/Demo.txt");
		System.out.println(file.isHidden());
	}
}
