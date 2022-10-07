package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*使用 Collections 类的 indexOfSubList() 和 
 * lastIndexOfSubList() 方法来查看子列表
 * 是否在列表中，并查看子列表在列表中所在的位置：
 */
public class Main16 {
	public static void main(String[] args) {
		List list = Arrays.asList("one Two three Four five six one three Four ".split(" "));
		System.out.println("List :" +list);
		List sublist = Arrays.asList("three Four".split(" "));
		System.out.println("子列表 :" +sublist);
		System.out.println("indexOfSublist :"
		+ Collections.indexOfSubList(list, sublist));
		System.out.println("lastIndexOfSubList: "
		+ Collections.lastIndexOfSubList(list, sublist));
		
	}
}
