package genericstest;
/*使用泛型方法打印不同类型的数组元素
 *定义泛型方法的规则 
 *所有泛型方法声明都有一个类型参数声明<>，
 *该类型参数声明部分在方法返回类型之前
 *一个泛型参数，也称为一个类型变量，是用于指定一个泛型类型名称的标识。
 *类型参数能被用来声明返回值类型，并且能作为泛型方法的得到的实际参数类型的占位符。
 *泛型方法的声明和其他方法一样，注意类型参数只能代表引用型类型，不是原始类型。
 */

public class GenericMethodTest {
	
	//泛型方法printArray
	public static <E> void printArray(E[] inputArray) {
		//输出数组元素
		for (E element : inputArray) {
			System.out.printf(" %s ", element);
			
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		
		//创建不同类型数组: Integer,Double,Character
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4};
		Character[] charArray = {'H','E','L','L','O'};
		
		System.out.println("整数数组元素为:" );
		printArray( intArray );//传递一个整型数组
		
		System.out.println("\n双精度型数组元素为:" );
		printArray( doubleArray );//传递一个双精度型数组
		
		System.out.println("\n字符型数组元素为: ");
		printArray( charArray );//传递一个字符型数组
	}
}