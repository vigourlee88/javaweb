package runnoobprac;


//创建目录
//File类中mkdirs()方法创建一个文件夹和它的所有父文件夹

import java.io.File;

public class CreateDir {
	public static void main(String[] args) {
		String dirname = "/tmp/user/java/bin";
		File d = new File(dirname);
		//现在创建目录
		d.mkdirs();
		
	}
}