package runnoobprac;

/*创建Person类的对象，
 * 设置该对象的name，age和sex属性，
 * 调用study方法，输出字符串"studying",
 * 调用showAge()方法显示age值，
 * 调用addAge()方法给对象的age属性值增加2岁
*/
public class Person {
	
	String name;
	int age;
	/**
	 * sex:1表明男性
	 * sex:0表明女性
	 */

	int sex;
	
	public void study() {
		System.out.println("studying");
	}
	public void showAge() {
		System.out.println("age: " + age);	
	}
//	形参时调用方法时赋值，不能直接赋值i=2
	public int addAge(int i) {
		age += i;
		return age;		
						
	}
}