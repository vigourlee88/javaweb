package directoryoperate;

import java.io.File;

//使用 File 类的 list 方法来输出指定目录下的所有文件：
public class Main8 {
	public static void main(String[] args) {
		File dir = new File("C:");
		String[] children = dir.list();
		if(children == null) {
			System.out.print("目录不存在或它不是一个目录");
		}else {
			for(int i = 0;i < children.length;i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}
