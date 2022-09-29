package methodexer;

//Array 类调用 toString() 方法：
public class RunoobTest07 {
	public static void main(String[] args) {
		
		//toString() with array
		//创建数组
		String[] array = { "Google", "Runoob", "Taobao" };
		System.out.println(array.toString());//[Ljava.lang.String;@3d012ddd
		
		//数组元素值返回一个字符串的表示形式
		//Array 继承了Object 类，所以可以直接使用toString() 方法
		System.out.println(array[1].toString());//Runoob
	}

}
