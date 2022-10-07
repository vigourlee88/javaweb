package directoryoperate;

import java.io.File;

//使用 File 类的 dir.list() 方法在指定目录中查找所有文件列表：
public class Main4 {
	public static void main(String[] args) {
		File dir= new File("../java");
		String[] children = dir.list();
		if(children == null) {
			System.out.println("该目录不存在");
		}else {
			for(int i = 0;i < children.length;i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}

}
