package fileoperate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//使用 readLine() 方法来读取文件 test.log 内容
public class Main1 {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\jack\\Documents\\javaweb\\practice\\src\\main\\java\\fileoperate\\test.log"));
			String str;
			while((str = in.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println(str);
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}
