package runnoobprac;

import java.util.ArrayList;

//计算 ArrayList 中的元素数量可以使用 size() 方法：
public class RunoobTest05{
	public static void main(String[] args) {
		ArrayList<String> sites = new ArrayList<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Weibo");
		System.out.println(sites.size());
	}
}