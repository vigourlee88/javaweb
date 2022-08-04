/* 必须声明数组变量，才能在程序中使用数组。
 * 首先声明了一个数组变量 myList，
 * 接着创建了一个包含 10 个 double 类型元素的数组，
 * 并且把它的引用赋值给 myList 变量。
 * 1.使用dataType[arraySize]创建了一个数组
 * 2.把新创建的数组的引用赋值给变量数组的引用变量
 * 用new操作符才创建数组
 * 数组名 = new 数组元素的数据类型[数组索引]
 * 数组的元素是通过索引访问的，从0开始，到索引值arry.length-1 
 */

public class ArryTest {
	public static void main(String[] args) {
		//数组大小
		int size = 10;
		//数组的声明和创建数组
		double[] myList = new double[size];
	    myList[0] = 5.6;
		myList[1] = 4.5;
		myList[2] = 3.3;
		myList[3] = 13.2;
		myList[4] = 4.0;
		myList[5] = 34.33;
		myList[6] = 34.0;
		myList[7] = 45.45;
		myList[8] = 99.993;
		myList[9] = 11123;
		//计算所有元素的总和
		double total = 0;
		for(int i = 0; i < size; i++) {
			total += myList[i];
		}
		System.out.println("总和为: "+ total);
		
	}
}