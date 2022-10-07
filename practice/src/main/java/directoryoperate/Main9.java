package directoryoperate;

import java.io.File;
import java.io.FilenameFilter;

//在 C 盘中查找以字母 'b' 开头的所有文件：
public class Main9 {
	public static void main(String[] args) {
		File dir = new File("C:");
		FilenameFilter filter =new FilenameFilter() {
			public boolean accept(File dir,String name) {
				return name.startsWith("b");
			}
		};
		String[] children = dir.list(filter);
		if(children == null) {
			System.out.println("目录不存在或它不是一个目录");
		}else {
			for(int i = 0;i < children.length;i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}
