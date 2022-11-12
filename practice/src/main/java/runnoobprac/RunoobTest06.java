package runnoobprac;

import java.util.ArrayList;

//使用 for 来迭代数组列表中的元素：
public class RunoobTest06 {
	public static void main(String[] args) {
		ArrayList<String> sites = new ArrayList<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Weibo");
		for(int i = 0;i < sites.size();i++) {  //要计算 ArrayList 中的元素数量可以使用 size() 方法：
			System.out.println(sites.get(i));//访问 ArrayList 中的元素可以使用 get() 方法：
		}
	}
}