/*访问数组名
 * 一种主要用于数组的增强型 for 循环。 
 * 声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。
 * 其作用域限定在循环语句块，其值与此时数组元素的值相等。
 * 表达式：表达式是要访问的数组名，或者是返回值为数组的方法。
 *
 */
public class ForJaQiangTest {
	public static void main(String[] args) {
		int [] numbers = {10,20,30,40,50};
		//声明新的局部变量，类型与数组元素的类型相匹配
		for(int x : numbers) {
			System.out.print( x );//x与数组元素的值相等
			System.out.print(",");
		}
		System.out.print("\n");
		//访问数组名
		String [] names = {"James" ,"Larry" ,"Tom" ,"Lacy" };
		for(String name : names) {
			System.out.print(name);
			System.out.print(",");
		}
			
	}
}
