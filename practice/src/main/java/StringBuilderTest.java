/*
 * 使用StringBuilde 类时，
 * 每次都会对 StringBuilde 对象本身进行操作，
 * 能够被多次的修改，而不是生成新的对象，
 * 所以如果需要对字符串进行修改,推荐使用StringBuilder。
 *  StringBuilder 的方法不是线程安全的（不能同步访问）
 * 
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(10);
		sb.append("Runoob..");
		System.out.println(sb);
		sb.append("!");
		System.out.println(sb);
		sb.insert(8, "Java");
		System.out.println(sb);
		sb.delete(5,8);
		System.out.println(sb);
		
		
	}
}