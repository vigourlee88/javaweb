package thread;

// 文件名 : GuessANumber.java
//通过继承 Thread 类创建线程
public class GuessANumber extends Thread {
	
	private int number;
	
	public GuessANumber(int number) {
		
		this.number = number;
		
	}
	//如果该线程是使用独立的 Runnable 运行对象构造的，
	//则调用该 Runnable 对象的 run 方法；
	//否则，该方法不执行任何操作并返回。
	public void run() {
		
		int counter = 0;
		int guess = 0;
		
		do {
			guess = (int) (Math.random()*100 + 1);
			System.out.println(this.getName() + " guesses " + guess);
			counter++;
		}while(guess != number) ;
		
		System.out.println("** Correct!" + this.getName() + "in" + counter + " guesses.**");
		
	}
}
