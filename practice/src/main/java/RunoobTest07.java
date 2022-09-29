import java.util.ArrayList;

//使用 for-each 来迭代元素：
public class RunoobTest07 {
	public static void main(String[] args) {
		ArrayList<String> sites = new ArrayList<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Weibo");
		for (String i : sites) {
			System.out.println(i);
		}
	}
}