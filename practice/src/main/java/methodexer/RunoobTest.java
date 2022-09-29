package methodexer;

/*Object clone() 方法用于创建并返回一个对象的拷贝。
 *对象内属性引用的对象只会拷贝引用地址，而不会将引用的对象重新分配内存. 
 *由于 Object本身没有实现 Cloneable 接口,
 *所以不重写 clone 方法并且进行调用的话会发生 CloneNotSupportedException 异常。
 *实例创建了 obj1 对象，
 *然后拷贝 obj1 给 obj2，
 *通过 obj2 输出变量的值：
 */

class RunoobTest implements Cloneable {
	
	//声明变量
	String name;
	int likes;
	
	public static void main(String[] args) {
		
		//创建对象
		RunoobTest obj1 = new RunoobTest();
		
		//初始化变量
		obj1.name = "Runoob";
		obj1.likes = 111;
		
		//打印输出
		System.out.println(obj1.name);
		System.out.println(obj1.likes);
		
		try {
			//创建obj1 的拷贝
			RunoobTest obj2 = (RunoobTest) obj1.clone();
			 
			//使用 obj2 输出变量
			System.out.println(obj2.name);
			System.out.println(obj2.likes);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}