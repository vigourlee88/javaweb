package fileoperate;

import java.io.File;
import java.util.Date;

//使用 File 类的 fileToChange.lastModified() 和 fileToChange.setLastModified() 
//方法来修改文件最后的修改日期：
public class Main7 {
	public static void main(String[] args) throws Exception {
		
		File fileToChange = new File("C:/myjavafile.txt");
		
		fileToChange.createNewFile();
		
		Date filetime = new Date(fileToChange.lastModified());
		
		System.out.println(filetime.toString());
		
		System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
		
		filetime = new Date(fileToChange.lastModified());
		
		System.out.println(filetime.toString());
		
	}

}
