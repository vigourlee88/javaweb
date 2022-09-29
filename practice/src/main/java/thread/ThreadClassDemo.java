package thread;

public class ThreadClassDemo {
	public static void main(String[] args) {
		Runnable hello = new DisplayMessage("Hello");
		Thread thread1 = new Thread(hello);
		thread1.setDaemon(true);//public final void setDaemon(boolean on)将该线程标记为守护线程或用户线程。
		thread1.setName("hello");//public final void setName(String name)改变线程名称，使之与参数 name 相同。
		System.out.println("Staring hello thread ...");
		thread1.start();//使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
		
		
		Runnable bye = new DisplayMessage("Goodbye");
		Thread thread2 = new Thread(bye);
		thread2.setPriority(Thread.MIN_PRIORITY);//更改线程的优先级。public final void setPriority(int priority)
		thread2.setDaemon(true);
		System.out.println("Starting goodbye thread...");
		thread2.start();
		
		System.out.println("Starting thread3...");
		Thread thread3 = new GuessANumber(27);
		thread3.start();
		try {
			thread3.join();//其他阻塞：通过调用线程的 sleep() 或 join() 发出了 I/O 请求时，线程就会进入到阻塞状态。
		}catch(InterruptedException e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("starting thread4...");
		Thread thread4 = new GuessANumber(75);
		
		thread4.start();
		System.out.println("main() is ending...");
	}

	
		
	}

