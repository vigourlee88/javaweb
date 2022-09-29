package instance2;

import java.util.ArrayList;

//使用 ArrayList 来实现这个功能，ArrayList 是动态数组，操作起来更加方便。
//使用 ArrayList 的 remove () 方法来删除数组列表的元素：
public class Main6 {
	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		objArray.clear();
		objArray.add(0,"第0个元素");
		objArray.add(1,"第1个元素");
		objArray.add(2,"第2个元素");
		System.out.println("数组删除元素前: "+ objArray);
		objArray.remove(1);
		objArray.remove("第0个元素");
		System.out.println("数组删除元素后: " + objArray);
	}
}
