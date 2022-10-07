package netinstance;

import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

//查看主机指定文件的最后修改时间：
public class Main4 {
	public static void main(String[] args) throws Exception {
		URL u = new URL("http://127.0.0.1/test/test.html");
		URLConnection uc = u.openConnection();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		uc.setUseCaches(false);
		long timestamp = uc.getLastModified();
		System.out.println("test.html文件最后修改时间 :"+ ft.format(new Date(timestamp)));
		
	}
}
