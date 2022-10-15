package www.hsp.practice;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		//接收一个字符，创建scanner对象
		//使用switch 来完成匹配，并输出对应信息
		 Scanner myScan = new Scanner(System.in);
		    System.out.println("请输入一个字符(a-g)");
		    
		char c1= myScan.next().charAt(0);
		//在Java中，只要有值返回，就是一个表达式
		switch(c1) {
		case 'a' :
			System.out.println("今天是星期一");
			break;
		case 'b' :
			System.out.println("今天是星期二");
			break;
		case 'c' :
			System.out.println("今天是星期三");
			break;
		default:
			System.out.println("你输入的字符不正确，没有匹配的");
			break;
		}
		System.out.println("退出了switch，继续执行程序");
	}
}
