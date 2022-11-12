package runnoobprac;

import java.util.LinkedList;


//使用 for 配合 size() 方法来迭代列表中的元素：
public class RunoobTest15 {
	public static void main(String[] args) {
		LinkedList<String> sites = new LinkedList<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Weibo");
		for(int size = sites.size(),i = 0;i < size;i++) {  //size() 方法用于计算链表的大小。
			System.out.println(sites.get(i));
		}
		
	}
}