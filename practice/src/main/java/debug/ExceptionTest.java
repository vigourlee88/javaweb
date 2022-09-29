package debug;

public class ExceptionTest {
	public static void main(String[] args) {
		ExceptionTest ept = new ExceptionTest();
		int num = ept.method();
		System.out.println(num);
	    
	}
		public  int method() {
			try {
				 int[] arr = new int[10];
				System.out.println(arr[10]);
				return 1;//没出异常返回1
			}catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				return 2;//有异常返回2
			}finally {
				System.out.println("我一定会被执行");
			}
		
	}

}
