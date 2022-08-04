//在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类
//可以同步访问
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("菜鸟教程官网: ");
		sBuffer.append("www");
		sBuffer.append(".runoob");
		sBuffer.append(".com");
		System.out.println(sBuffer);
	}
}