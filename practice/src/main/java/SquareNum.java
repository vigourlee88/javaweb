import java.io.*;

/**
 * 这个类演示了文档注释
 * @author jack
 * @version  1.2
 */
public class SquareNum {
	
	/**
	 * this method returns the square of num.
	 * This is a multiline description.You can use
	 * as many lines as you like.
	 * @param  num The value to be squared.说明一个方法的参数
	 * @return num squared.
	 */
	
	public double square(double num) {
		return num*num;
	}
	
	/**
	 * This method inputs a number form the user.
	 * @return The value input as a double.说明返回值类型
	 * @exception IOException On input error.标志一个类抛出的异常
	 * @see  IOException指定一个到另一个主题的链接
	 */
	public double getNumber() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inData = new BufferedReader(isr);
		String str;
		str = inData.readLine();
		return (new Double(str)).doubleValue();
		
	}
	/**
	 * This method demonstrates square().
	 * @param args Unused.
	 * @return Nothing.
	 * @exception IOException input error.
	 * @see IOException
	 */
	public static void main(String[] args) throws IOException {
		SquareNum ob = new SquareNum();
		double val;
		System.out.println("Enter value to be squared: ");
		val = ob.getNumber();
		val = ob.square(val);
		System.out.println("Squared value is " + val);
		
	}

}
