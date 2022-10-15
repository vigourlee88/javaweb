package www.hsp.practice;

public class DoWhileExercise01 {
	public static void main(String[] args) {
		//统计1-200之间能被5整除但不能被3整除的个数
		//化繁为简
		//使用do-while输出1-200
		int count = 0;
		int i=1;
		do {
			if(i % 5 == 0 && i % 3 != 0 ) {
				System.out.println("i=" + i);
				count++;
			}
			i++;
		}while(i<=200);
		
		System.out.println("count=" + count);
	}

}
