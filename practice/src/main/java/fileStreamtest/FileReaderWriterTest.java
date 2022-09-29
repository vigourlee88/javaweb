package fileStreamtest;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*将Java下的hello。text文件内容读入程序中，并输出到控制台
 */
public class FileReaderWriterTest {
	public static void main(String[] args)   {
		
//		File file = new File("hello.txt");//当前工程
//   	System.out.println(file.getAbsolutePath());
		
//	    File file1 = new File("fileStreamtest\\hello.txt");//当前Module
//    	System.out.println(file1.getAbsolutePath());
		FileReader fr = null;
    try {
			//	}
			//	@test
			//    public void testFileReader() throws IOException {
			//1.实例化File类的对象，指明要操作的File文件
			File file = new File("src\\hello.txt");
			//2.提供具体的流
			 fr = new FileReader(file);
			//3.数据的读入
			//read():返回读入的一个字符。如果达到文件的末尾，返回-1
			int date = fr.read();
			while (date != -1) {
				System.out.println((char) date);//只读了一个
				date = fr.read();//再读一个
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			//4.流的关闭操作
			try {
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
    
    }
  }

