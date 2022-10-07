package javaversion8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static <T> void main(String[] args) {
		List<T> list =new ArrayList<T>();
		
	}	
		public List<?> FindDiff(List<?> list){
			if(list == null || list.size() == 0) {
				return new ArrayList<>();
			}
		
			List<Object> result = new ArrayList<>();
			for(int i = 0;i <list.size();i++) {
				boolean repeat = false;
				Object o1 =list.get(i);
				
				for(int j = 0;j < list.size();j++) {
					if(i ==j) {
						continue;
					}
					
					Object o2 =list.get(j);
					if(o1 != null && o1.equals(o2)) {
						repeat= true;
						break;	
					}
				}
				if(!repeat) {
					result.add(o1);
				}
			}
			return result;
		}
}