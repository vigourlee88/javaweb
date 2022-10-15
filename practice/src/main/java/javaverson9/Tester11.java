package javaverson9;

import java.util.Optional;

//ifPresentOrElse() 方法
//public void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)
public class Tester11 {
	public static void main(String[] args) {
		Optional<Integer> optional = Optional.of(1);
		
		optional.ifPresentOrElse(x -> System.out.println("Value: " + x),() -> 
		    System.out.println("Not Present."));
		
		optional = Optional.empty();
		
		optional.ifPresentOrElse(x -> System.out.println("Value: " + x),() -> 
		    System.out.println("Not Present."));
	}
}
