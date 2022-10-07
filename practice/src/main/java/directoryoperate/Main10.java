package directoryoperate;

import java.io.File;

//使用 File 类的 listRoots() 方法来输出系统所有根目录：
public class Main10 {
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		System.out.println("系统所有根目录: ");
		for(int i = 0;i < roots.length;i++) {
			System.out.println(roots[i].toString());
		}
	}
}
