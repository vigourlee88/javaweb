package javaversion8;

import java.util.Optional;

/*Optional 类
 *Optional 类是一个可以为null的容器对象。
 *如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。 
 *Optional 是个容器：它可以保存类型T的值，或者仅仅保存null。 
 *Optional 类的引入很好的解决空指针异常。
 *
 *java.util.Optional<T> 类的声明：
 *public final class Optional<T> extends Object
 */
public class Java8Tester7 {
	public static void main(String[] args) {
		
		Java8Tester7 java8Tester = new Java8Tester7();
		Integer value1 = null;
		Integer value2 = new Integer(10);
		
		//Optional.ofNullable - 允许传递为 null 参数
		//如果为非空，返回 Optional 描述的指定值，否则返回空的 Optional。
		Optional<Integer> a = Optional.ofNullable(value1);
		
		// Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
		//返回一个指定非null值的Optional。
		Optional<Integer> b = Optional.of(value2);
		System.out.println(java8Tester.sum(a,b));
	}
	
	public Integer sum(Optional<Integer> a,Optional<Integer> b) {
		// Optional.isPresent - 判断值是否存在
		System.out.println("第一个参数值存在: " + a.isPresent());
		System.out.println("第二个参数值存在: " + b.isPresent());
		
		// Optional.orElse - 如果值存在，返回它，否则返回默认值
		Integer value1 = a.orElse(new Integer(0));
		
		//Optional.get - 获取值，值需要存在
		Integer value2= b.get();
		return value1 + value2;
	}
}
