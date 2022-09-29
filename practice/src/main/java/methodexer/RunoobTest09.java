package methodexer;

import java.util.ArrayList;

//Object getClass() 方法用于获取对象的运行时对象的类。
//String 和 ArrayList 继承了 Object，所以可以直接使用 getClass() 方法：


public class RunoobTest09 {
	public static void main(String[] args) {
		
		// getClass() with Object
		Object obj1 = new Object();
		System.out.println("obj1的类为: " + obj1.getClass());
		
		// getClass() with String
		String obj2 = new String();
		System.out.println("obj2的类为: " + obj2.getClass());
		
		// getClass() with ArrayList
		ArrayList<Integer>  obj3 = new ArrayList<Integer>();
		System.out.println("obj3的类为: " + obj3.getClass());
		
		
		//自定义类调用 getClass() 方法：
		// 创建 RunoobTest 类的对象
		RunoobTest09 obj = new RunoobTest09();
		
		
		// RunoobTest 继承 Object 类，Object 是所有类的超类
		// 调用 getClass() 方法
		System.out.println(obj.getClass());
		
	}

}
