package runnoobprac;

/*F文件名 :RunEncap.java*/
//任何外部类要访问该类中私有成员变量都要通过这些getter和setter方法
public class RunEncap {
	public static void main(String[] args) {
		EncapTest encap = new EncapTest();
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNUm("1234ms");
		
		System.out.println("Name : "+ encap.getName() + " Age : "+encap.getAge());
		
	}
}