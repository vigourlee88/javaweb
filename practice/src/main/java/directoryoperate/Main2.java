package directoryoperate;

import java.io.File;

//使用 File 类的 file.isDirectory() 和 file.list() 方法来判断目录是否为空：
public class Main2 {
	public static void main(String[] args) {
		File file = new File("./testdir");// 当前目录下的 testdir目录
		if(file.isDirectory()) {
			if(file.list().length>0) {
				System.out.println("目录不为空!");
			}else {
				System.out.println("目录为空!");
			}
		}else {
			System.out.println("这不是一个目录!");
		}
	}
}
