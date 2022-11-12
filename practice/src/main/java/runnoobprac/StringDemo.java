package runnoobprac;

//String类有11种构造方法，
//这些方法提供不同的参数来初始化字符串，
//比如提供一个字符数组参数

public class StringDemo {
	public static void main(String[] args) {
		char[] helloArray = { 'r' ,'u' ,'n' ,'o' ,'o' ,'b' };
		//创建String对象
		String helloString = new String(helloArray);
		System.out.println( helloString );
   }	
}