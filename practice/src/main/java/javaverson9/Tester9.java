package javaverson9;

//在 Java 9 中，我们可以在匿名类中使用 <> 操作符，
public class Tester9 {
	public static void main(String[] args) {
		Handler2<Integer> intHandler = new Handler2<>(1) {
			@Override
			public void handle() {
				System.out.println(content);
			}
		};
		intHandler.handle();
		Handler2<? extends Number> intHandler1 = new Handler2<>(2) {
			@Override
			public void handle() {
				System.out.println(content);
			}
		};
		intHandler1.handle();
		Handler2<?> handler = new Handler2<>("test") {
			@Override
			public void handle() {
				System.out.println(content);
			}
		};
		
		handler.handle();
	}
}

abstract class Handler2<T> {
	public T content;
	public Handler2(T content) {
		this.content = content;
	}
	abstract void handle();
}
