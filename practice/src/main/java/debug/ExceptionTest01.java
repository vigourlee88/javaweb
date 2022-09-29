package debug;


public class ExceptionTest01 {
	public static void main(String[] args) {
		ExceptionTest01 et = new ExceptionTest01();
		et.test();
	}	

	public void test() {
		String str = "123";
		str = "abc";
		try {
		  int num = Integer.parseInt(str);//出现异常，直接跳到catch语句
		  
			
			System.out.println("hello.......1");//跳过	
		}catch (NumberFormatException e) {
			
			System.out.println("出现数值转换异常了，不要着急....");
		}
		
		System.out.println("hello.......2");
	 
	}
}
