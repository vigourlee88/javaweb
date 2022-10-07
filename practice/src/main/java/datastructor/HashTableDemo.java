package datastructor;

import java.util.Enumeration;
import java.util.Hashtable;

/*Hashtable哈希表类提供了一种在用户定义键结构的基础上来组织数据的手段。
 *例如，在地址列表的哈希表中，你可以根据邮政编码作为键来存储和排序数据，而不是通过人名。
 *哈希表键的具体含义完全取决于哈希表的使用情景和它包含的数据。
 *Hashtable是原始的java.util的一部分， 是一个Dictionary具体的实现 。 
 *然而，Java 2 重构的Hashtable实现了Map接口，因此，Hashtable现在集成到了集合框架中。它和HashMap类很相似，但是它支持同步。
 *像HashMap一样，Hashtable在哈希表中存储键/值对。当使用一个哈希表，要指定用作键的对象，以及要链接到该键的值。 
 *然后，该键经过哈希处理，所得到的散列码被用作存储在该表中值的索引。
 *Object get(Object key)
 *返回指定键所映射到的值，如果此映射不包含此键的映射，则返回 null. 更确切地讲，如果此映射包含满足 (key.equals(k)) 的从键 k 到值 v 的映射，则此方法返回 v；否则，返回 null。
 *
 *
 */
public class HashTableDemo {
	
	public static void main(String[] args) {
		//Create a hash map
		Hashtable balance = new Hashtable();
		Enumeration names;
		String str;
		double bal;
		
		balance.put("Zara", new Double(3434.34));
		balance.put("Mahnaz", new Double(123.22));
		balance.put("Ayan", new Double(1378.00));
		balance.put("Daisy", new Double(99.22));
		balance.put("Qadir", new Double(-19.08));
		
		//Show all balances in hash table.
		names = balance.keys();
		while(names.hasMoreElements()) {
			str = (String) names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();
		//deposit1,000 into Zara's account
		bal = ((Double)balance.get("Zara")).doubleValue();
		balance.put("Zara",new Double(bal+1000));
		System.out.println("Zara's new balance: " + balance.get("Zara"));
	}
}
