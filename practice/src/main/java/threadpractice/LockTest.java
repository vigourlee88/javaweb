package threadpractice;

import java.util.Date;

/*死锁是这样一种情形：多个线程同时被阻塞，它们中的一个或者全部都在等待某个资源被释放。
 *由于线程被无限期地阻塞，因此程序不可能正常终止。
 *解决死锁问题的方法是：一种是用synchronized，一种是用Lock显式锁实现。
 *而如果不恰当的使用了锁，且出现同时要锁多个对象时，会出现死锁情况，如下：
 */
public class LockTest {
		public static String obj1 = "obj1";
		public static String obj2 = "obj2";
		public static void main(String[] args) {
			LockA la = new LockA();
			new Thread(la).start();
			LockB lb = new LockB();
			new Thread(lb).start();
		}
	}
class LockA implements Runnable {
	public void run() {
		try {
			System.out.println(new Date().toString() + "LockA开始执行");
			while(true) {
				synchronized (LockTest.obj1) {
					System.out.println(new Date().toString() + "LockA锁住obj1");
					Thread.sleep(3000);// 此处等待是给B能锁住机会
					synchronized(LockTest.obj2) {
						System.out.println(new Date().toString() + "LockA锁住obj2");
						Thread.sleep(60 * 1000);// 为测试，占用了就不放
						
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class LockB implements Runnable {
	public void run() {
		try {
			System.out.println(new Date().toString() + "LockB开始执行");
			while(true) {
				synchronized(LockTest.obj2) {
					System.out.println(new Date().toString() + "LockB锁住obj2");
					Thread.sleep(3000); // 此处等待是给A能锁住机会
					synchronized(LockTest.obj1) {
						System.out.println(new Date().toString() + "LockB锁住obj1");
						Thread.sleep(60 * 1000);// 为测试，占用了就不放
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
