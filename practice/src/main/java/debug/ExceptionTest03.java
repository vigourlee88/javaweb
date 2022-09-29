package debug;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest03 {
	public static void  main(String[] args) {
		ExceptionTest03 ept = new ExceptionTest03();
		ept.test01();
		
		
	}			
		public void test01() {
		FileInputStream fis = null;
		
		try {
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
			
			int data = fis.read();
			while(data !=  -1) {
		
				
				System.out.println((char)data);
				data = (char) fis.read();
			}	
		}catch (FileNotFoundException e ) {
			e.printStackTrace();
		}catch (IOException e ) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}