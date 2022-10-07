package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//使用 Collections 类的 replaceAll() 来替换List中所有的指定元素：
public class Main15 {
	public static void main(String[] args) {
		List list = Arrays.asList("one Two three Four five six one three Four".split(" ") );
		System.out.println("List :"+list );
		Collections.replaceAll(list, "one","hundrea");
		System.out.println("replaceAll: " +list);
	}
}
