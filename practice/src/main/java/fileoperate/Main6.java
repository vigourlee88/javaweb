package fileoperate;

import java.io.File;

//使用 createTempFile(String prefix, String suffix, File directory) 中的
//directory 参数来指定临时文件的目录：
public class Main6 {
	public static void main(String[] args) {
		File f = null;
		
		try {
			//创建临时文件
			f = File.createTempFile("tmp",".txt",new File("C:/"));
			
			
			//输出绝对路径
			System.out.println("File path: " + f.getAbsolutePath());
			
			//终止后删除临时文件
			f.deleteOnExit();
			
			//创建临时文件
			f = File.createTempFile("temp", null,new File("D:/"));
			
			//输出绝对路径
			System.out.print("File path: " + f.getAbsolutePath());
			
			
			//终止后删除临时文件
			f.deleteOnExit();
			
		}catch (Exception e) {
			//如果有错误输出内容
			e.printStackTrace();
		}
	}
}
