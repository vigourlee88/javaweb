package javaversion8;

/*Lambda 表达式，也可以称为闭包，它是推动 Java 8 发布的最重要的新特性。
 *Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
 *使用 Lambda 表达式可以使代码变的更加简洁紧凑。
 *lambda 表达式的语法格式如下：
 *(parameters) -> expression
 *(parameters) ->{ statements; } 
 * 可以直接在 lambda 表达式中访问外层的局部变量：
 *lambda 表达式的局部变量可以不用声明为 final，
 *但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
 *在 Lambda 表达式中，一个与变量相同的名称或变量。 
 */
public class Java8Tester3 {
	public static void main(String[] args) {
		final int num = 1;
		Converter<Integer,String> s = (param) -> 
		System.out.println(String.valueOf(param + num));
		
		s.convert(2);//输出结果为3
	}
	
	public interface Converter<T1,T2> {
		void convert (int i);
	}
}
