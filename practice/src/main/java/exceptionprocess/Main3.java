package exceptionprocess;

//重载方法的异常处理：
public class Main3 {
	double method(int i) throws Exception {
		return i/0;
	}
	boolean method(boolean b) {
		return !b;
	}
	static double method(int x,double y) throws Exception {
		return x + y;
	}
	static double method(double x,double y) {
		return x + y - 3;
	}
	public static void main(String[] args) {
		Main3 mn = new Main3();
		try {
			System.out.println(method(10,20.0));
			System.out.println(method(10.0,20));
			System.out.println(method(10.0,20.0));
			System.out.println(mn.method(10));
		}catch (Exception ex) {
			System.out.println("exception occoure: " + ex);
		}
	}
}
