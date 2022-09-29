import java.util.ArrayList;
import java.util.Iterator;

public class RunoobTest25 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(12);
		numbers.add(8);
		numbers.add(2);
		numbers.add(23);
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			if(i < 10) {
				it.remove();  //要删除集合中的元素可以使用remove()方法，删除小于10的元素
			}
		}
		System.out.println(numbers);
	}
}