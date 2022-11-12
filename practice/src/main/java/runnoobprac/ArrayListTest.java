package runnoobprac;

import java.util.*;
import java.util.List;

//三种方法都是用来遍历ArrayList集合，第三种方法是采用迭代器的方法，该方法可以不用担心在遍历的过程中会超出集合的长度。
public class ArrayListTest {
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		
		list.add("Hello");
		list.add("world");
		list.add("HAHAHAHA");
		//第一种遍历方法使用For-Each 遍历List
		for(String str : list) {    //也可以改写 for(int i=0;i<list.size();i++)这种形式
			System.out.println(str);
		}
		//第二种遍历，把链表变成数组相关的内容进行遍历
		String[] strArray = new String[list.size()];
		list.toArray(strArray);
		for(int i=0;i<strArray.length;i++) {//这里也可以改成为 for(String str:strArray）这种形式
			System.out.println(strArray[i]);
		}
		//第三种遍历，使用迭代器进行相关遍历
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {      //判断下一个元素之后有值
			System.out.println(ite.next());
			
		}
	}
}