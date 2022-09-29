import java.util.ArrayList;

//访问 ArrayList 中的元素可以使用 get() 方法：
public class RunoobTest02 {
	public static void main(String[] args) {
	ArrayList<String> sites = new ArrayList<String>();
	sites.add("Google");
	sites.add("Runoob");
	sites.add("Taobao");
	sites.add("Weibo");
	System.out.println(sites.get(1));//数组的索引值从0开始。访问第二个元素
 }
}