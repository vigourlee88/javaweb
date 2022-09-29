package instance2;

import java.util.Arrays;

//通过 Java Util 类的 Arrays.fill(arrayname,value) 方法
//和Arrays.fill(arrayname ,starting index ,ending index ,value) 
//方法向数组中填充元素：
public class FillTest {
	public static void main(String[] args) {
		int array[] = new int[6];
		Arrays.fill(array, 100);
		 int n = array.length;
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		Arrays.fill(array,3,6,50);
		int n1 = array.length;
		for (int i = 0;i < n1; i++) {
			System.out.println(array[i]);
			
		}
	}
}
