package runnoobprac;

import java.util.ArrayList;

//要修改 ArrayList 中的元素可以使用 set() 方法：
public class RunoobTest03 {
	public static void main(String[] args) {
		ArrayList<String> sites = new ArrayList<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Weibo");
		sites.set(2,"Wiki");//第一个参数为索引位置，第二个为要修改的值
		System.out.println(sites);
	}
}