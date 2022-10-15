package www.hsp.practice;

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		//创建Scanner对象，接收用户输入
		//接收成绩保存到double score
		//使用if-else判断 如果初赛成绩大于8.0进入决赛，否则提示淘汰。
	    Scanner myScan = new Scanner(System.in);
	    System.out.println("请输入该选手的成绩");
	    double score = myScan.nextDouble();
	    if(score > 8.0) {
	    	System.out.println("请输入性别");
	    	char gender=myScan.next().charAt(0);
	    	if(gender == '男') {
	    		System.out.println("进入男子组");
	    	}else if(gender == '女') {
	    		System.out.println("进入女子组");
	    	}else {
	    		System.out.println("输入的性别有误");
	    	}
	       
	    }else {
	    System.out.println("sorry,你被淘汰");
	    }
	}

}
