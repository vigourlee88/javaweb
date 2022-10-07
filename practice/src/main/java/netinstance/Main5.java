package netinstance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

//使用 net.URL 类的 URL() 构造函数来抓取网页：
public class Main5 {
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://www.runoob.com");
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(url.openStream()));
		BufferedWriter writer = new BufferedWriter
				(new FileWriter("data.html"));
		String line;
		while((line = reader.readLine()) != null) {
			System.out.println(line);
			writer.write(line);
			writer.newLine();
		}
		reader.close();
		writer.close();
		
	}
}
