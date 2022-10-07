package collections;

import java.util.ArrayList;
import java.util.List;

//使用 Java Util 类的 list.add() 和 list.toArray() 方法将集合转为数组：
public class Main9 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("菜");
		list.add("鸟");
		list.add("教");
		list.add("程");
		list.add("www.runoob.com");
		String[] s1 = list.toArray(new String[0]);
		for(int i = 0;i < s1.length;i++) {
			String contents = s1[i];
			System.out.println(contents);
	    }
    }
}
