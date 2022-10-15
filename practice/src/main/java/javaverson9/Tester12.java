package javaverson9;

import java.util.Optional;
import java.util.function.Supplier;

//or() 方法
//public Optional<T> or(Supplier<? extends Optional<? extends T>> supplier)
//如果值存在，返回 Optional 指定的值，否则返回一个预设的值。
public class Tester12 {
	public static void main(String[] args) {
		Optional<String> optional1 = Optional.of("Mahesh");
		Supplier<Optional<String>> supplierString = () -> Optional.of("Not present");
		optional1 = optional1.or( supplierString);
		optional1.ifPresent( x -> System.out.println("Value: " + x));
		optional1 = optional1.empty();
		optional1 = optional1.or( supplierString);
		optional1.ifPresent(x -> System.out.println("Value: " + x));
		
	}
}
