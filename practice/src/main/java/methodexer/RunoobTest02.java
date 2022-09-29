package methodexer;


/*String 类重写了 equals() 方法，用于比较两个字符串是否相等：
 *equals() 方法比较两个对象，是判断两个对象引用指向的是同一个对象，即比较 2 个对象的内存地址是否相等。
 *如果子类重写了 equals() 方法，就需要重写 hashCode() 方法，
 *比如 String 类就重写了 equals() 方法，同时也重写了 hashCode() 方法。
 */

public class RunoobTest02 {
	public static void main(String[] args) {
		
		//String类使用equals()方法
		//创建两个对象
		String obj1 = new String();
		String obj2 = new String();
		
		
		//判断obj1与obj2是否相等
		//初始化的两个对象都为null，所以是相等,返回true
		System.out.println(obj1.equals(obj2));//true
		
		//给对象赋值
		obj1 = "Runoob";
		obj2 = "Google";
		
		//判断obj1与obj2是否相等
		//两个值不同，内存地址也不同，所以不相等，返回false
		System.out.println(obj1.equals(obj2));//false
	}

}
