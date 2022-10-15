package www.hsp.practice;

public class Break01 {
	public static void main(String[] args) {
		for(int i = 0;i <= 10;i++) {
			if(i == 3) {
				break;//提前结束并退出for循环
			}
			System.out.println("i=" + i);//0,1,2
		}
	}
}
