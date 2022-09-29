//Static Methods Refresher静态方法复习
public class ExerciseOne {
	public static void main(String[] args) {
		
		int randomNum = (int)(Math.random() * 10) + 1;//生成1~10的随机值，(random（最大值-最小值+1)+最小值
		System.out.println("Your random number between one and ten is " + randomNum);
		
		int negativeNum =  -2;
		int absNum = Math.abs(negativeNum);//abs（）返回绝对值
		System.out.println("The absolute value of " + negativeNum + " is "+ absNum);
		
		String myNewString = Integer.toString(1);
		System.out.println(myNewString);
		
	}
}