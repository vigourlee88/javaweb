package fileoperate;

import java.io.File;
import java.io.IOException;

//使用 File 类的 oldName.renameTo(newName) 方法来重命名文件。
//执行以下程序前需要在当前目录下创建测试文件 runoob-test.txt。
public class RunoobTest {
	public static void main(String[] args) throws IOException {
		
		//旧的文件或目录
		File oldName = new File("./runoob-test.txt");
		//新的文件或目录
		File newName = new File("./runoob-test-2.txt");
		
		if(newName.exists()) {//确保新的文件名不存在
			
			throw new java.io.InvalidObjectException("file exits");
		}
		if (oldName.renameTo(newName)) {
			
			System.out.println("已重命名");
			
		}else {
			System.out.println("Error");
		}
	}
}
