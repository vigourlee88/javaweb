package streamtest;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*数据流
 * DataInputStream 和 DataOutputStream 
 * 作用 用于读取或写出基本数据类型的变量或字符串
 * 
 * 将内存中的字符串，基本数据类型的变量写出到文件中
 * 
 * 注意 处理异常的话，仍然应该使用try-catch-finally
 */
public class TestDataStream {
	public static void main(String[] args)  {
		//1.处理流（节点流）
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("data.txt"));
		//2.写入	
			dos.writeUTF("刘得花");
			dos.flush();//刷新操作，将内存中的数据写入文件
			dos.writeInt(23);
			dos.flush();
			dos.writeBoolean(true);
			dos.flush();
		
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if (dos != null) {
			try {
				dos.close();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		}
		
	  
		
	}
	}
}
