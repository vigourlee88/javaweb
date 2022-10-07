package directoryoperate;

import java.io.File;

//使用 File 类的 file.getParent() 方法来获取文件的上级目录：
public class Main5 {
	public static void main(String[] args) {
		File file = new File("C:/File/demo.txt");
		String strParentDirectory = file.getParent();
		System.out.println("文件的上级目录为 : " +strParentDirectory);
	}
}
