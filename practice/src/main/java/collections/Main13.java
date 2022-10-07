package collections;

import java.util.Enumeration;
import java.util.Hashtable;

//使用 Enumeration 类的 hasMoreElements 和 nextElement 方法来遍历输出 HashTable 中的内容：
public class Main13 {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");
		Enumeration e = ht.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());	
		}
	}
}
