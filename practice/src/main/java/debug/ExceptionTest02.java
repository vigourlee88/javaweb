package debug;

public class ExceptionTest02 {
	public static void main(String[]args) {
	String str = "123";
	str = "abc";
		
	try {
		int num = Integer.parseInt(str);//出现异常，直接跳到catch语句
		System.out.println("hello....1");
		
	}catch (NumberFormatException e) {
		//System.out.println("出现数值转换异常了，不要着急....");
		//String getMessage():
		//System.out.println(e.getMessage());
		//printStackTrace():
		e.printStackTrace();//直接打印异常
	}catch (NullPointerException e) {
		System.out.println("出现空指针异常了，不要着急....");
		
	}catch (Exception e) {
		System.out.println("出现异常了，不要着急....");
	}
  }
}
