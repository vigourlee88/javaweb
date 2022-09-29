import java.util.LinkedList;

public class RunoobTest13 {
	public static void main(String[] args) {
		LinkedList<String> sites = new LinkedList<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Weibo");
		//使用removeFirst()移除头部元素
		sites.removeFirst(); 
		System.out.println(sites);
		//使用removeLast()移除尾部元素
		sites.removeLast();
		System.out.println(sites);
		
		
	}
}