package instance3;

import java.text.SimpleDateFormat;
import java.util.Date;

//获取当前时间
//使用 Date 类及 SimpleDateFormat 类的 format(date) 方法来输出当前时间：
public class Main2 {
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
		Date date = new Date();
		System.out.println("现在时间: " + sdf.format(date));
			
	}
}
