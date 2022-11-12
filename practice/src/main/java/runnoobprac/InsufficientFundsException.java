package runnoobprac;

//文件名InsufficientFundsException.java
//实例是一个银行账户的模拟，通过银行卡的号码完成识别，可以进行存钱和取钱的操作。
//InsufficientFundsException 类是用户定义的异常类，它继承自 Exception。
import java.io.*;

//自定义异常类，继承Exception类
public class InsufficientFundsException extends Exception {
	//此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
	private double amount;
	public InsufficientFundsException (double amount) {
		
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
}