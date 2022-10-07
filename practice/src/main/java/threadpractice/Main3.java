package threadpractice;

//使用interrupt()方法来中断线程并使用 isInterrupted() 方法来判断线程是否已中断：
public class Main3 extends Object implements Runnable {
	
	public void run() {
		try {
			System.out.println("in run() - 将运行work2() 方法");
			work2();
			System.out.println("in run() - 从work2() 方法回来");
		}catch (InterruptedException x) {
			System.out.println("in run() - 中断work2() 方法");
			return;
		}
		System.out.println("in run() - 休眠后执行");
		System.out.println("in run() - 正常离开");
	}
	public void work2() throws InterruptedException {
		while(true) {
			if(Thread.currentThread().isInterrupted()) {
				System.out.println("C isInterrupted()=" + Thread.currentThread().isInterrupted());
			}
		}
	}
	public void work() throws InterruptedException {
		while(true) {
			for(int i = 0;i < 100000;i++) {
				int j = i * 2;
			}
			System.out.println("A isInterrupted()=" + Thread.currentThread().isInterrupted());
			if(Thread.interrupted()) {
				System.out.println("A isInterrupted()=" + Thread.currentThread().isInterrupted());
				throw new InterruptedException();
			}
		}
	}
	public static void main(String[] args) {
		Main3 si = new Main3();
		Thread t = new Thread(si);
		t.start();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException x) {
			
		}
			System.out.println("in main() - 中断其他线程");
			t.interrupt();
			System.out.println("in main() - 离开");
		
	}
}
