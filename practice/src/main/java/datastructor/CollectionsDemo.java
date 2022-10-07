package datastructor;

import java.util.HashMap;
import java.util.Map;

/*Dictionary 字典类是一个抽象类，用来存储键/值对，作用和Map类相似。
 *Enumeration elements( )返回此 dictionary 中值的枚举。 
 *当你想要通过特定的键而不是整数索引来访问数据的时候，这时候应该使用Dictionary。
 *由于Dictionary类是抽象类，所以它只提供了键映射到值的数据结构，而没有提供特定的实现。
 * 
 * Map 接口中键和值一一映射. 可以通过键来获取值。
 *给定一个键和一个值，你可以将该值存储在一个 Map 对象。之后，你可以通过键来访问对应的值 
 *当访问的值不存在的时候，方法就会抛出一个 NoSuchElementException 异常。 
 *当对象的类型和 Map 里元素类型不兼容的时候，就会抛出一个 ClassCastException 异常。
 *当在不允许使用 Null 对象的 Map 中使用 Null 对象，会抛出一个 NullPointerException 异常。
 *当尝试修改一个只读的 Map 时，会抛出一个 UnsupportedOperationException 异常。 
 *Set entrySet( ) 返回此映射中包含的映射关系的 Set 视图。
 *boolean equals(Object obj) 比较指定的对象与此映射是否相等。
 *Object get(Object k)返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
 *Set keySet( )返回此映射中包含的键的 Set 视图。
 *Object put(Object k, Object v)将指定的值与此映射中的指定键关联（可选操作）。
 *
 */
public class CollectionsDemo {
	
	public static void main(String[] args) {
		Map m1 = new HashMap();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		System.out.println();
		System.out.println("Map Elements");
		System.out.println("\t" + m1);
		
	}
}
