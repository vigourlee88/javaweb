package methodexer;

import java.util.ArrayList;

//String 和 ArrayList 类使用 hashCode() 方法，
//String 和 ArrayList 类都继承了 Object，
//所以可以直接使用 hashCode() 方法：

public class RunoobTest04 {
	public static void main(String[] args) {
		
		//String 使用 hashCode()
		String str = new String();
		System.out.println(str.hashCode());//0
		
		//ArrayList 使用 hashCode()
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list.hashCode());//1
	}

}
