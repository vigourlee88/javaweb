import java.util.LinkedList;

public class RunoobTest14 {
	public static void main(String[] args) {
		LinkedList<String> sites = new LinkedList<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Weibo");
		//使用getFirst()获取头部元素
		System.out.println(sites.getFirst());
		//使用getLast()获取尾部元素
		System.out.println(sites.getLast());
		
	}
}