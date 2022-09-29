package instance2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<String> runoobs = new ArrayList<String>();
		runoobs.add("www.");
		runoobs.add("runoob");
		runoobs.add(".com");
		for (Iterator<String> iterator = runoobs.iterator(); iterator.hasNext();System.out.println(iterator.next())) {
			
		}
	}
}
