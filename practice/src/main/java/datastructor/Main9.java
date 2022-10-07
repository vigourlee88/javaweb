package datastructor;

import java.util.LinkedList;

//使用 listname.add() 和 listname.set() 方法来修改链接中的元素：
public class Main9 {
	public static void main(String[] args) {
		LinkedList officers = new LinkedList();
		officers.add("B");
		officers.add("B");
		officers.add("T");
		officers.add("H");
		officers.add("P");
		System.out.println(officers);
		officers.set(2,"M");
		System.out.println(officers);
	}
}
