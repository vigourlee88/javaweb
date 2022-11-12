package runnoobprac;

import java.util.ArrayList;
/*For-Each loops
 * 有时我们需要访问元素的索引，或者我们只想遍历列表的一部分。
 * 如果是这种情况，常规for循环或while循环是一个不错的选择。
 * 
 * For-each 循环，也称为增强循环，有时我们并不关心索引；我们只关心元素本身
 * 允许我们直接循环遍历项目列表（如数组或ArrayList）中的每个项目，
 * 并对每个项目执行一些操作。
 * 如果我们尝试为增强的for循环变量分配一个新值，
 * 则存储在数组中的值ArrayList不会改变。
 * 这是因为，对于增强循环中的每次迭代，循环变量都被分配了一个列表元素的副本。
 * 包含增强for循环变量 和要遍历的列表
 * 可以随意命名增强的for循环变量；使用复数的单数只是一种惯例。
 */
class MostExpensive {
	
	public static void main(String[]args) {
		
		ArrayList<Double> expenses = new ArrayList<Double>();
		expenses.add(74.46);
		expenses.add(63.99);
		expenses.add(10.57);
		expenses.add(81.37);
		
		double mostExpensive = 0;
		
		//Iterate over expenses
		for(double expense : expenses) {//数组列表里的(首字母大写)Double类型的变量expense
			
			if(expense > mostExpensive) {
				mostExpensive = expense;
			}
		}
		
		System.out.println(mostExpensive);
	}
}