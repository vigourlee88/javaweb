//引入HashMap类
import java.util.HashMap;

public class RunoobTest20 {
	public static void main(String[] args) {
		//创建HashMap对象sites
		HashMap<Integer,String> Sites = new HashMap<Integer,String>();
		
		//添加键值对(key-value)可以使用 put() 方法:
		Sites.put(1,"Google" );
		Sites.put(2,"Runoob" );
		Sites.put(3,"Taobao" );
		Sites.put(4,"Zhihu" );
		System.out.println(Sites);
		
		//使用get(key)方法来获取key对应的value
		System.out.println(Sites.get(3));
		
		//使用remove(key)方法来删除key对应的键值对(key-value)
		Sites.remove(4);
		System.out.println(Sites);
		
		//计算 HashMap 中的元素数量可以使用 size() 方法：
		System.out.println(Sites.size());
		
        
	}
}