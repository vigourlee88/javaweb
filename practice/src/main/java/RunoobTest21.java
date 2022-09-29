import java.util.HashMap;

public class RunoobTest21 {
	public static void main(String[] args) {
		
		//HashMap 的 key 与 value 类型可以相同也可以不同，可以是字符串（String）类型的 key 和 value，
		//也可以是整型（Integer）的 key 和字符串（String）类型的 value。
		HashMap<String,String> Sites = new HashMap<String,String>();
		Sites.put("one", "Google");
		Sites.put("two", "Runoob");
		Sites.put("three", "Taobao");
		Sites.put("four", "zhihu");
		System.out.println(Sites);
		
		//删除所有键值对(key-value)可以使用 clear 方法：
		Sites.clear();
		System.out.println(Sites);
		
	}
}