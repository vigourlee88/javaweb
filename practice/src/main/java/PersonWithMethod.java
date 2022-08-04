/*Using this With Methods
 * this用作用于调用原始方法的任何对象的占位符。
 * this可以用作参数的值,使用当前对象调用该方法并将该对象作为该方法的参数传递
 */
public class PersonWithMethod {
	public int age;
	public int wisdom;
	public int fitness;
	
	public PersonWithMethod(int inputAge) {
		this.age = inputAge;
		this.wisdom = inputAge * 5;
		this.fitness = 100 - inputAge;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public void setWisdom(int newWisdom) {
		this.wisdom = newWisdom;
	}
	public void setFitness(int newFitness) {
		this.fitness = newFitness;
	}
	public void hasBirthday() {
		//Complete this method
		this.setAge(this.age + 1);
		this.setWisdom(this.wisdom + 5);
		this.setFitness(this.fitness - 3);
	}
	
	public static void main(String[]args) {
		PersonWithMethod emily = new PersonWithMethod(20);
		emily.hasBirthday();
		System.out.println("New age is: "+ emily.age);
		System.out.println("New wisdom is: "+ emily.wisdom);
		System.out.println("New fitness is: " + emily.fitness);
		
	}
	
}




