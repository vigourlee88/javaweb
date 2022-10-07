package netinstance;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

//获取指定 URL 的响应头信息：
public class Main7 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.runoob.com");
		URLConnection conn = url.openConnection();
		
		Map headers = conn.getHeaderFields();
		Set<String> keys = headers.keySet();
		for(String key:keys) {
			String val = conn.getHeaderField(key);
			System.out.println(key+"  " +val);
		}
		System.out.println(conn.getLastModified());
	}
}
