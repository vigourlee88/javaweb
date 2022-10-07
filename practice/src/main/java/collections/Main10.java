package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//使用 Collections 类的 rotate() 来循环移动元素，方法第二个参数指定了移动的起始位置：
public class Main10 {
	public static void main(String[] args) {
		List list = Arrays.asList("one Two three Four five six".split(" "));
		System.out.println("List :" +list);
		Collections.rotate(list, 3);
		System.out.println("rotate: " + list);
	}
}
