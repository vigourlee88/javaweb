package streamtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*标准输入流，输出流
 * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。
 * 然后继续进行输入操作。直到当输入"e"或者"exit"时，退出程序。
 * 
 * 方法一 使用Scanner实现，调用next()返回一个字符串
 * 方法二 使用System.in实现，System.in  → 转成流 → BufferedReader的readLine()
 */

public class TestSystemIn {
	public static void main(String[] args)  {
		BufferedReader br = null;
		try {
			//转换流，从控制台输入
			InputStreamReader isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			
			while(true) {
				
				System.out.println("请输入字符串 :");
			    String data = br.readLine();
			    if("exit".equalsIgnoreCase(data) || "e".equalsIgnoreCase(data)) {
				 System.out.println("程序结束");
				 break;
			    }
			    String upperCase = data.toUpperCase();
			    System.out.println(upperCase);
   }
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
		   if (br != null) {
		try {
			br.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	  }
    }
  }
}