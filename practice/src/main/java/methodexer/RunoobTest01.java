package methodexer;

/*Object equals() 方法用于比较两个对象是否相等。
 *equals() 方法比较两个对象，是判断两个对象引用指向的是同一个对象，即比较 2 个对象的内存地址是否相等。 
 *object.equals(Object obj) 如果两个对象相等返回 true，否则返回 false。
 * 
 */
 class RunoobTest01 {
	public static void main(String[] args) {
		
		//Object类使用equals()方法
		//创建两个对象
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//判断obj1与obj2是否相等
		//不同对象，内存地址不同，不相等，返回false
		System.out.println(obj1.equals(obj2));//false
		
		
		//obj1赋值给obj3
		//String重写了equals()方法
		//对象引用，内存地址相同，相等，返回true
		Object obj3 = obj1;
		System.out.println(obj1.equals(obj3));//true
		
	}

}
