package method;

/*Java1.5提供了一个叫varargs的新功能，就是可变长度的参数。
 *"Varargs"是"variable number of arguments"的意思。
 *有时候也被简单的称为"variable arguments"
 *定义实参个数可变的方法：只要在一个形参的"类型"与"参数名"之间加上三个连续的"."
 *（即"..."，英文里的句中省略号），就可以让它和不确定个实参相匹配。
 *创建了 sumvarargs() 方法来统计所有数字的值： 
 */
public class Main8 {
	static int sumvarargs(int...intArrays) {
		int sum,i;
		sum = 0;
		for(i = 0;i < intArrays.length;i++) {
			sum += intArrays[i];
		}
		return (sum);
	}
	public static void main(String args[]) {
		int sum = 0;
		sum = sumvarargs(new int[]{10,12,33});
		System.out.println("数字相加之和为: " + sum);
	}

}
