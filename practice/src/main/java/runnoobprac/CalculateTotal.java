package runnoobprac;

//Iterating Over Arrays and ArrayList遍历数组和数组列表

/*为了遍历数组或ArrayList使用循环，
 * 我们必须找到一种通过索引访问每个元素的方法。
 * 我们可能还记得for循环是使用计数器变量创建的。
 * 当我们遍历数据列表时，我们可以使用该计数器来跟踪当前元素的索引。
 * 我们也可以使用while循环遍历数组和ArrayLists。
 * 如果我们使用while循环，我们需要创建自己的计数器变量来访问各个元素。
 * 我们还将设置条件继续循环，直到我们的计数器变量等于列表长度。
 */
import java.util.ArrayList;

class CalculateTotal {
	
	public  static void main(String[] args) {
		
		ArrayList<Double> expenses = new ArrayList<Double>();
		expenses.add(74.46);
		expenses.add(63.99);
		expenses.add(10.57);
		expenses.add(81.37);
		
		double total = 0;
		
		//Iterate over expenses 
		for(int i = 0;i < expenses.size();i++) {
			
			total += expenses.get(i);
		}
		System.out.println(total);	
	}
}