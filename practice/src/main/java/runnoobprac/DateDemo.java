package runnoobprac;


import java.util.Date;
//使用 Date 对象的 toString() 方法
//来打印当前日期和时间
public class DateDemo {
	public static void main(String[] args) {
		//初始化Date对象
		Date date = new Date();
		
		//使用toString()函数显示日期时间
		System.out.println(date.toString());
		
	}
}
