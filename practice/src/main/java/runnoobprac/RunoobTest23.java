package runnoobprac;

import java.util.ArrayList;
import java.util.Iterator;

/*使用Iterator迭代器接口遍历集合Collection中的元素
 *调用 it.next() 会返回迭代器的下一个元素，并且更新迭代器的状态。
 *调用 it.hasNext() 用于检测集合中是否还有元素。
 *调用 it.remove() 将迭代器返回的元素删除。 
 */

public class RunoobTest23 {
	public static void main(String[] args) {
		
		//创建集合
		ArrayList<String> sites = new ArrayList<String>();
		sites.add("Google");
		sites.add("Runoob");
		sites.add("Taobao");
		sites.add("Zhihu");
		
		//获取迭代器,每次调用iterator方法都会得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前
		Iterator<String> it = sites.iterator();
		
		//输出集合中的第一个元素
		System.out.println(it.next());//调用 it.next() 会返回迭代器的下一个元素，并且更新迭代器的状态。
	}
}