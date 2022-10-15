package javaverson9;

import java.util.stream.Stream;

public class Tester6 {
	public static void main(String[] args) {
		long count = Stream.ofNullable(100).count();
		System.out.println(count);
		
		count = Stream.ofNullable(null).count();
		System.out.println(count);
		//ofNullable 方法可以预防 NullPointerExceptions 异常， 可以通过检查流来避免 null 值。
        //如果指定元素为非 null，则获取一个元素并生成单个元素流，元素为 null 则返回一个空流。
	}
}
