package runnoobprac;

public class Store02 {
	// declare instance fields here!
	
	String productType;
	// constructor method
	public Store02( ) {
		System.out.println("I am inside the constructor method.");
	}
	
	//main method
	public static void main(String[] args) {
		System.out.println("This code is inside the main method.");
		
		Store02 lemonadeStand = new Store02();
		
		System.out.println(lemonadeStand);
		
		
	}
}