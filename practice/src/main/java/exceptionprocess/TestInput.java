package exceptionprocess;

//继承 Exception 来实现自定义异常：
class WrongInputException extends Exception {
	WrongInputException(String s) {
		super(s);
	}
}
class Input {
	void method() throws WrongInputException {
		throw new WrongInputException ("Wrong input");
	}
}
class TestInput {
	public static void main(String[] args) {
		try {
			new Input().method();
		}catch(WrongInputException wie) {
			System.out.println(wie.getMessage());
		}
	}
}
