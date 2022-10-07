package fileoperate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

//将文件内容复制到另一个文件
//使用 BufferedWriter 类的 read 和 write 方法将文件内容复制到另一个文件：
public class Main3 {
	public static void main(String[] args) throws Exception {
		BufferedWriter out1 = new BufferedWriter(new FileWriter("C:\\Users\\jack\\Documents\\javaweb\\practice\\src\\main\\java\\fileoperate\\scrfile.txt"));
		out1.write("string to be copied\n");
		out1.close();
		InputStream in = new FileInputStream(new File("C:\\Users\\jack\\Documents\\javaweb\\practice\\src\\main\\java\\fileoperate\\scrfile.txt"));
		OutputStream out = new FileOutputStream(new File("C:\\Users\\jack\\Documents\\javaweb\\practice\\src\\main\\java\\fileoperate\\destnfile.txt"));
		byte[] buf = new byte[1024];
		int len;
		while((len = in.read(buf)) > 0) {
			out.write(buf,0,len);
		}
		in.close();
		out.close();
		BufferedReader in1 = new BufferedReader(new FileReader("C:\\Users\\jack\\Documents\\javaweb\\practice\\src\\main\\java\\fileoperate\\destnfile.txt"));
		String str;
		while ((str = in1.readLine()) != null) {
			System.out.println(str);
		}
		in1.close();
	}
}
