package instance3;

import java.text.SimpleDateFormat;
import java.util.Date;

//格式化时间（SimpleDateFormat）
//使用 SimpleDateFormat 类的 format(date) 方法来格式化时间
public class Main {
	public static void main(String[] args) {
		
		Date date = new Date();
		String strDateFormat = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println(sdf.format(date));
		
	}

}
