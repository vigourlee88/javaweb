package runnoobprac;

//Removing an Item 移除项目
import java.util.ArrayList;
class ToDos03 {
	public static void main(String[] args) {
		
		//Sherlock
		ArrayList<String> sherlocksToDos = new ArrayList<String>();
		
		sherlocksToDos.add("visit the crime scene");
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
		
		//Remove each to-do below:
		sherlocksToDos.remove("visit the crime scene");
		poirotsToDos.remove("visit the crime scene");//移除的元素都可
		//poirotsToDos.remove(0);移除的索引都可
		sherlocksToDos.remove("play violin");
		
		System.out.println(sherlocksToDos.toString() + "\n");
		System.out.println(poirotsToDos.toString());
		
		
	}
}