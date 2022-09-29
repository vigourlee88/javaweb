package instance2;

import java.util.Arrays;
import java.util.Collections;


//我们使用自定义的 reverse 方法将数组进行反转：
public class RunoobTest2 {
	
	/*使用java.util.Arrsys.asList(array)方法  */
	static void reverse(Integer a[]) {
		
		Collections.reverse(Arrays.asList(a));;
		System.out.println(Arrays.asList(a));
	}
	
	public static void main(String[] args) {
		Integer [] arr = {10,20,30,40,50};
		reverse(arr);
	}

}
