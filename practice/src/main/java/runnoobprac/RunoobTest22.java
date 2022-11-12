package runnoobprac;

import java.util.HashMap;

//for-each 来迭代 HashMap 中的元素。
public class RunoobTest22 {
	public static void main(String[] args) {
		// 创建 HashMap 对象 Sites
		HashMap<Integer,String> Sites = new HashMap<Integer,String>();
		// 添加键值对
		Sites.put(1,"Google");
		Sites.put(2,"Runoob");
		Sites.put(3,"Taobao");
		Sites.put(4,"Zhihu");
		// 输出 key 和 value
		//想获取 key，可以使用 keySet() 方法，然后可以通过 get(key) 获取对应的 value，
		//只想获取 value，可以使用 values() 方法。
		for(Integer i : Sites.keySet()) {
			System.out.println("key: " + i + " value: " + Sites.get(i));
		}
		
		//返回所有的value值
		for(String value : Sites.values()) {
			//输出每一个value
			System.out.println(value + ",");
		}
		
		
	}
}