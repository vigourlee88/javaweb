package runnoobprac;

import java.util.LinkedList;

public class RunoobTest12 {
	public static void main(String[] args) {
		LinkedList<String> sites = new LinkedList<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		//使用addFirst()在头部添加元素
		sites.addFirst("Wiki");
		System.out.println(sites);
		//使用addLast()在尾部添加元素
		sites.addLast("Weibo");
		System.out.println(sites);
	}
}