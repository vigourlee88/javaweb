//枚举类长应用于switch语句中
enum Color01 {
	RED,GREEN,BLUE;
}
public class MyClassSwitchEnum {
	public static void main(String[] args) {
		Color01 myVar = Color01.BLUE;
		
		switch (myVar) {
		case RED:
			System.out.println("红色");
			break;
		case GREEN:
			System.out.println("绿色");
			break;
		case BLUE:
			System.out.println("蓝色");
			break;
	
		}
	}
}