package javaversion8;

import java.util.Optional;

public class Java8Tester9 {
	public static void main(String[] args) {
		
		Java8Tester9 java8Tester9 = new Java8Tester9();
		Integer value1 = null;
		Integer value2 = new Integer(10);
		
		//Option.ofNullable - 允许传递为 null 参数
		Optional<Integer> a = Optional.ofNullable(value1);
		
		//Option.of - 如果传递的参数是 null，抛出异常NullPointerException
		Optional<Integer> b = Optional.of(value2);
		System.out.println(java8Tester9.sum(a,b));
	}
	
	public Integer sum(Optional<Integer> a,Optional<Integer> b) {
		
		//Option.isPresent - 判断值是否存在
		System.out.println("第一个参数值存在: "+ a.isPresent());
		System.out.println("第二个参数值存在: "+ b.isPresent());
		
		//Optional.orElse - 如果值存在，返回它，否则返回默认值
		Integer value1 = a.orElse(new Integer(0));
		
		//Optional.get - 获取值，值需要存在
		Integer value2 = b.get();
		return value1 + value2;
	}
}
