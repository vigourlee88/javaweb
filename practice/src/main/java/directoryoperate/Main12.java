package directoryoperate;

import java.io.File;

//使用 File 类的 dir.isDirectory() 和 dir.list() 方法来遍历目录：
public class Main12 {
	public static void main(String[] args) {
		System.out.println("遍历目录");
		File dir = new File("/www/java");
		visitAllDirsAndFiles(dir);
	}
	public static void visitAllDirsAndFiles(File dir) {
		System.out.println(dir);
		if(dir.isDirectory()) {
			String[] children = dir.list();
			for(int i =0;i < children.length;i++) {
			visitAllDirsAndFiles(new File(dir,children[i]));
			}
		}
	}
}
