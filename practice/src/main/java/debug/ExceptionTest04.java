package debug;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest04 {
	public static void main(String[] args) {
		ExceptionTest04 ept = new ExceptionTest04();
		try {
		ept.method1();
		}catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
	public void method1() throws IOException {
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int date = fis.read();
		while(date != -1) {
			System.out.println((char)date);
			date = fis.read();
		}
		fis.close();
	}

}
