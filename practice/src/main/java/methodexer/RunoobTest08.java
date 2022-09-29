package methodexer;

import java.util.*;

//Object finalize() 方法用于实例被垃圾回收器回收的时触发的操作。
//当 GC (垃圾回收器) 确定不存在对该对象的有更多引用时，对象的垃圾回收器就会调用这个方法。
public class RunoobTest08 extends GregorianCalendar {
	public static void main(String[]args) {
		try {
			
			RunoobTest08 cal = new RunoobTest08();
			
			System.out.println("" + cal.getTime());
			
			System.out.println("Finalizing...");
			cal.finalize();
			System.out.println("Finalized.");
			
		}catch (Throwable ex ) {
			ex.printStackTrace();
		}
	}

}
