package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

//使用 Collection 类的 iterator() 方法来遍历集合：
public class Main1 {
	public static void main(String[] args) {
		HashMap<String,String> hMap = new HashMap<String,String>();
		hMap.put("1", "1st");
		hMap.put("2", "2nd");
		hMap.put("3", "3rd");
		Collection cl = hMap.values();
		Iterator itr = cl.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
