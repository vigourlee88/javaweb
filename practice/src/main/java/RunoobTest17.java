import java.util.HashSet;

//集合中的每个元素都必须是唯一的。不允许有重复元素的集合
public class RunoobTest17 {
	public static void main(String[] args) {
		HashSet<String> sites = new HashSet<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Zhihu");
		sites.add("Runoob"); //重复的元素不会被添加
		System.out.println(sites);
		
		
		
		

	}
}