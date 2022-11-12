package runnoobprac;

/*使用for语句来迭代枚举元素
 *for(声明语句:表达式)
 *声明语句是声明新的局部变量，该变量的类型必须和数组元素的类型匹配。
 *其作用域定在循环语句块，其值与此时数组元素的值相等。
 *表达式是要访问的数组名，或者是返回值为数组的方法。
 */

enum Color {
	RED,GREEN,BLUE;
}
public class MyClassForEnum {
	public static void main(String[] args) {
		
		for(Color myVar : Color.values()) {
			System.out.println(myVar);
		}
	}
}