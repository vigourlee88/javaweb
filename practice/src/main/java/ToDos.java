//Creating ArrayLists Adding an Item 创建数组列表，添加项目
//import the ArrayList package here:
import java.util.ArrayList;

class ToDos {
	public static void main(String[] args) {
		
		//Create toDoList below:
		//<>内不可以是基本数据类型
		ArrayList<String> toDoList = new ArrayList<String>();
		String toDo1 = "Water plants";
		//Add more to-dos here:
		String toDo2 = "Do laundry";
		String toDo3 = "pet ham and Ghoti util they purr";
		
		//Add to-dos to toDoList
		toDoList.add(toDo1);
		toDoList.add(toDo2);
		toDoList.add(toDo3);
		
		System.out.println(toDoList);
		
		
	}
}