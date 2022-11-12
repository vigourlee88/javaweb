package runnoobprac;

import java.util.HashSet;//引入HashSet类

//使用 for-each 来迭代 HashSet 中的元素。
public class RunoobTest19 {
	public static void mian(String[] args) {
		HashSet<String> sites = new HashSet<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Zhihu");
		sites.add("Runoob");//重复的元素不会被添加
		for(String i: sites) {
			System.out.println(i);
		}
	}
}