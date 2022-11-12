package runnoobprac;

/*
 * 遍历数组,访问数组名
 * For-Each 循环或者加强型循环，
 * 它能在不使用下标的情况下遍历数组。
 * 一种主要用于数组的增强型 for 循环。 
 * 声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。
 * 其作用域限定在循环语句块，其值与此时数组元素的值相等。
 * 表达式：表达式是要访问的数组名，或者是返回值为数组的方法。 
 */
public class ArrayTest03 {
	public static void main(String[] args) {
		double[] myList = {1.9,2.9,3.4,3.5};
		
		//打印所有数组元素
		for(double element: myList) {
			System.out.println(element);
			
		}
	}
}