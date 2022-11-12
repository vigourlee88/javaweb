package runnoobprac;

//ArrayList Size, Accessing an Index数组列表大小，访问索引

import java.util.ArrayList;

class ToDos01 {
	
	public static void main(String[] args) {
		
		//Sherlock
		ArrayList<String> sherlocksToDos = new ArrayList<String>();
		
		sherlocksToDos.add("vist the crime scene");
		sherlocksToDos.add("play violin");
		sherlocksToDos.add("interview suspects");
		sherlocksToDos.add("solve the case");
		sherlocksToDos.add("apprehend the criminal");
		
		
		//Poirot
		ArrayList<String> poirotsToDos = new ArrayList<String>();
		
		poirotsToDos.add("visit the crime scene");
		poirotsToDos.add("interview suspects");
		poirotsToDos.add("let the little grey cells do their work");
		poirotsToDos.add("trim mustache");
		poirotsToDos.add("call all suspects together");
		poirotsToDos.add("reveal the truth of the crime");
		
		
		//Print the size of each ArrayList below:
		System.out.println(sherlocksToDos.size());
		System.out.println(poirotsToDos.size());
		
		//Print the name of the detective with the larger to-do list:
		System.out.println("Poirot");
		
		
		System.out.println("Sherlock's third to-do:");
		
		//Print sherlock's third to-do:
		System.out.println(sherlocksToDos.get(2));
		
		System.out.println("\nPoirot's second to-do:");
		
		//Print Poirot's second to-do:
		System.out.println(poirotsToDos.get(1));
		
	}
}