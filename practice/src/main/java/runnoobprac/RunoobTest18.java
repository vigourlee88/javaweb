package runnoobprac;

import java.util.HashSet;

//使用contains()方法来判断元素是否存在于集合当中
public class RunoobTest18 {
	public static void main(String[] args) {
		HashSet<String> sites = new HashSet<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Zhihu");
		sites.add("Runoob"); //重复的元素不会被添加
		System.out.println(sites.contains("Taobao"));
		
		//使用 remove() 方法来删除集合中的元素:删除成功返回true，否则为false
		sites.remove("Taobao");
		System.out.println(sites);
		
		//计算HashSet中的元素数量可以使用size()方法
		System.out.println(sites.size());
		
		//删除集合中所有元素可以使用 clear 方法：
		sites.clear();
		System.out.println(sites);//HashSet 允许有 null 值。
		
		
	}
}