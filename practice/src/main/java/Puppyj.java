public class Puppyj{
	int puppyAge;
	public Puppyj(String name) {
		System.out.println("小狗的名字是"+ name );
		
	}
	
	public void setAge( int age) {
		puppyAge = age;
		
	}
	public int getAge() {
		System.out.println("小狗年龄"+ puppyAge);
		return puppyAge;
		
	}
	public static void main (String[]args) {
		Puppyj myPuppy= new Puppyj("tommy");
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("变量值"+ myPuppy.puppyAge);
		
	}
}