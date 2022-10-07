package collections;

import java.util.Arrays;
import java.util.List;

//使用 Java Util 类的 Arrays.asList(name) 方法将数组转换为集合：
public class ArrayToCollection {
	public static void main(String[] args) {
		int n = 5;
		String[] name = new String[n];
		for(int i = 0;i < n;i++) {
			name[i] = String.valueOf(i);
		}
		List<String> list = Arrays.asList(name);
		System.out.println();
		for(String li : list) {
			String str = li;
			System.out.println(str + "");
		}
	}
}
