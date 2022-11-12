package runnoobprac;

import java.util.ArrayList;
import java.util.Collections; //引入Collections类

/*ArrayList排序
*Collections 类也是一个非常有用的类，位于 java.util 包中，
*提供的 sort() 方法可以对字符或数字列表进行排序。
*/
public class RunoobTest09 {
	public static void main(String[] args) {
		ArrayList<String> sites = new ArrayList<String>();
		sites.add("Taobao");
		sites.add("Wiki");
		sites.add("Runoob");
		sites.add("Weibo");
		sites.add("Google");
		Collections.sort(sites); //字母排序
		for(String i : sites) {
			System.out.println(i);
		}
	}
}