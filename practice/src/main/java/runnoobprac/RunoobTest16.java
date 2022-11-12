package runnoobprac;

import java.util.LinkedList;


//使用 for-each 来迭代元素：
public class RunoobTest16 {
	public static void main(String[] args) {
		LinkedList<String> sites = new LinkedList<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Weibo");
		for(String i: sites) {
			System.out.println(i);
		}
	}
}