package www.hsp.practice;

import java.util.Scanner;

public class MulForExcercise01 {
	public static void main(String[] args) {
		//统计3个班的成绩情况，每个班有5名同学，求出各个班级的 平均分 和所有班级的 平均分
		//(学生的成绩从键盘输入)统计三个班及格人数，每个班有5名同学
		//思路分析
		//(1)先计算一个班，有5个学生的成绩，使用for
		//1.1创建Scanner对象然后，接收用户输入信息
		//1.2得到该班级的平均分，定义一个 double sum 将班级5个学生的成绩累积
		
		//(2)统计3个班，（每个班有5个学生 ）的平均分
		
		//(3)所有班级的平均分
		//3.1定义一个变量，double totalScore 累积所有学生的成绩
		//3.2当多重循环结束后，totalScore / (3*5)
		//(4)统计3个班的及格人数
		//4.1 定义变量 int passNum=0 当有一个学生成绩>=60, passNum++
		//4.2变量放在哪里？当有一个学生成绩>= 60,passNum++
		Scanner myScan = new Scanner(System.in);
		double totalScore = 0;//累积所有学生的成绩
		int passNum = 0;//累积及格人数
		int classNum = 3;
		int stuNum = 5;
		for(int i =1;i <= classNum;i++) {//i表示班级
			
			double sum = 0;//一个班级的总分
			for(int j= 1;j <= stuNum;j++) {//j表示学生 
				System.out.println("请数第"+ i +"个班的第" + j +"学生的成绩");
				double score = myScan.nextDouble();
				//当有一个学生成绩>= 60,passNum++
				if(score >= 60) {
					passNum++;
				}
				sum += score;//当前班的累积
				System.out.println("成绩是"+ score);
			}
			//因为sum是5个学生的总成绩
			System.out.println("sum=" + sum +"平均分=" + (sum / stuNum));
			//把sum 累积到totalScore
			totalScore += sum;
		}
		System.out.println("三个班总分=" + totalScore
				+ "平均分=" + totalScore / classNum*stuNum); 
		System.out.println("及格人数=" + passNum);
	}
}
