import java.io.File;


//删除文件可以使用 java.io.File.delete() 方法。
public class DeleteFileDemo {
	public static void main(String[] args) {
		//这里修改为自己的测试目录、
		File folder = new File("/tmp/java/");
		deleteFolder(folder);
	}
	
	//删除文件及目录
	public static void deleteFolder(File folder) {
		File[] files = folder.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f.isDirectory()) {
					deleteFolder(f);
				} else {
					f.delete();
				}
			}
		}
		folder.delete();
	}
}