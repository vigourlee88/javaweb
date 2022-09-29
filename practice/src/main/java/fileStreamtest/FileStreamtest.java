package fileStreamtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamtest {
	public static void main(String[] args)  {
		try {
			byte bWrite[] = { 11, 21, 3, 40, 5 };
			OutputStream os = new FileOutputStream("test.txt");
			for (int i = 0; i < bWrite.length; i++) {
				os.write(bWrite[i]);
			}
			os.close();
			InputStream is = new FileInputStream("test.txt");
			int size = is.available();
			for (int x = 0; x < size; x++) {
				System.out.println((char) is.read() + "");
			}
			is.close();
		} catch (IOException e) {
			System.out.println("Exception");
		}
	}

}
