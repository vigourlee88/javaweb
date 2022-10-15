package www.hsp.practice;

public class ForExercise {
	public static void main(String[] args) {
		//打印1-100之间所有是9倍数的整数，统计个数  及   总和
		//完成输出1-100的值
		//在输出的过程中，进行过滤，只输出6的倍数  i%9==0
		//统计个数，定义一个变量 int count =0;当满足条件时  count++;
		//总和，定义一个变量 int sum =0;当条件满足时 累积 sum+= i;
		//为了适应更好的需求，把范围的开始值和结束值  做出变量
		//更进一步把9的倍数  也可变成变量  int t = 9;
		
		int count = 0;//统计9的倍数个数 变量
		int sum = 0;//总和
		int start = 1;
		int end= 100;
		int t = 9;//倍数
		for(int i= start;i<= end;i++) {
			if(i % t == 0) {
				System.out.println("i=" +i);
				count++;
				sum+=i;//累积
			}
		}
		System.out.println("count :"+ count);
		System.out.println("sum :"+ sum);
	}

}
