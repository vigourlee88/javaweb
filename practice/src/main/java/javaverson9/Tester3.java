package javaverson9;

import java.util.stream.Stream;

public class Tester3 {
	public static void main(String[] args) {
		Stream.of("a","b","c","","e","f").takeWhile(s -> !s.isEmpty()).forEach(System.out::print);
		//takeWhile() 方法使用一个断言作为参数，返回给定 Stream 的子集直到断言语句第一次返回 false。
		//如果第一个值不满足断言条件，将返回一个空的 Stream。
	}
}
