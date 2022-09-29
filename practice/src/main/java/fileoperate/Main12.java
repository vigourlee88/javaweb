package fileoperate;

import java.io.File;
import java.util.Date;

//使用 File 类的 file.lastModified() 方法来获取文件最后的修改时间
public class Main12 {
	public static void main(String[] args) {
		File file= new File("Main.java");
		long lastModified = file.lastModified();
		Date date = new Date(lastModified);
		System.out.println(date);
	}

}
