package www.hsp.practice;

import java.util.Scanner;

public class DoWhileExercise02 {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("老韩使出五连鞭");
			System.out.println("老韩问:还钱吗?y/n");
			answer = myScan.next().charAt(0);
			System.out.println("他的回答是" + answer);
		}while(answer != 'y');
		
		System.out.println("老王还钱了");
	}

}
