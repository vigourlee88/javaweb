package runnoobprac;

import java.util.ArrayList;

//使用 ArrayList 存储数字(使用 Integer 类型):
public class RunoobTest08{
	public static void main(String[] args) {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(10);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(25);
		for(int i : myNumbers) {
			System.out.println(i);
		}
		
	}
}