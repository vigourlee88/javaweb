package runnoobprac;

/*类和对象的使用
 * 1.创建类，设计类的成员
 * 2.创建类的对象
 * 3.通过"对象.属性"或"对象.方法"调用对象的结构
 * 
 * 创建Person类的对象，
 * 设置该对象的name，age和sex属性，
 * 调用study方法，输出字符串"studying",
 * 调用showAge()方法显示age值，
 * 调用addAge()方法给对象的age属性值增加2岁
 * 
 * 创建第二个对象PersonTest，执行上述操作，
 * 会体会同一个类的不同对象之间的关系
 */
//测试类
public class PersonTest {
//	main方法是程序入口
	public static void main(String[] args) {
//		这是一个类想要调用人家的方法得先有对象
//		创建Person类的对象
		Person p1 = new Person();
//		设置该对象的name，age和sex属性
		
		p1.name = "Tom";
		p1.age = 18;
		p1.sex = 1;
//		调用study方法，输出字符串"studying"
		p1.study();
		
//		调用showAge()方法显示age值
//      按住ctrl同时双击showAge会自动返回Person类Java中
		
		p1.showAge();
//		调用addAge()方法给对象的age属性值增加2岁
		int newAge = p1.addAge(2);
		System.out.println(p1.name + "的新年龄为:" + newAge);
		
		System.out.println(p1.age);//20
		
		//**************************************
		Person p2 = new Person();
		p2.showAge();//0
		p2.addAge(10);
		p2.showAge();//10
		
		p1.showAge();//20谁调的addAge得到age就是谁的
		
	}
}



