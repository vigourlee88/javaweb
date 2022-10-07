package netinstance;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

//使用 HttpURLConnection 的 httpCon.getDate() 方法来获取 URL响应头的日期信息：
public class Main6 {
	public static void main(String[] args)throws Exception {
		URL url = new URL("http://www.runoob.com");
		HttpURLConnection httpCon = 
	    (HttpURLConnection) url.openConnection();
		long date = httpCon.getDate();
		if(date == 0) 
		System.out.println("无法获取信息。");
		else
		System.out.println("Date: " + new Date(date));
	}	
}
