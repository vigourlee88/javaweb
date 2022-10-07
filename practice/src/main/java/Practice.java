import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("JAVASCIPT");
		list.add("C++");
		list.add("C");
		list.add("JAVA");
		list.add("C");
		System.out.println(list);
		
		Object[] obj = list.toArray();
		
		for(int i = 0;i < obj.length;i++) {
			System.out.println(obj[i]);
		    int	j = i + 1;
			String str1 = obj[i].toString();
			String str2 = obj[j].toString();
		    if(str1.compareTo(str2)) {
		    	System.out.println(str1);
		    }else {
		    	
		    }
			//for(int j = i + 1;j <= str[i];j++) {
				
			
			
		}
		
			
	}
		
}


