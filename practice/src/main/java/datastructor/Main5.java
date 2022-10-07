package datastructor;

import java.util.Collections;
import java.util.Vector;

//使用 Collections 类的 sort() 方法对向量进行排序
//并使用 binarySearch() 方法来获取向量元素的索引值：
public class Main5 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("X");
		v.add("M");
		v.add("D");
		v.add("A");
		v.add("O");
		Collections.sort(v);
		System.out.println(v);
		int index = Collections.binarySearch(v, "D");
		System.out.println("元素索引值为 : " + index);
	}
}
