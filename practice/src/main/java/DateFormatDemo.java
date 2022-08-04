import java.util.*;
import java.text.*;

public class DateFormatDemo {
	public static void main(String[] args) {
		//创建Date类的对象
		Date dNow = new Date();
		//SimpleDateFormat 是一个以语言环境敏感的方式来格式化和分析日期的类。
		//SimpleDateFormat 允许你选择任何用户自定义日期时间格式来运行。
		//创建SimpleDateFormat类的对象
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		
		System.out.println("当前时间为: "+ ft.format(dNow));
		
	}
}