package runnoobprac;

//Getting an Item's Index获取项目的索引indexOf()method

import java.util.ArrayList;

class ToDos04 {
	
	public static void main(String[] args) {
		
		//sherlock
		ArrayList<String> sherlocksToDos = new ArrayList<String>();
		
		sherlocksToDos.add("visit the crime scene");
		sherlocksToDos.add("play violin");
		sherlocksToDos.add("interview suspects");
		sherlocksToDos.add("listen to Dr.Watson for amusement");
		sherlocksToDos.add("solve the case");
		sherlocksToDos.add("apprehend the criminal");
		
		sherlocksToDos.remove("visit the crime scene");
		
		
		//calculate to-dos until case is solved:
		//将一个元素传递给indexOf(),它将返回该元素在ArrayList
		int solved = sherlocksToDos.indexOf("solve the case");
		
		//Change the value printed:
		System.out.println(solved);
		
		
		
	}
}