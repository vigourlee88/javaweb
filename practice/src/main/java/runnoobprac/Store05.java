package runnoobprac;

//Calling method
public class Store05 {
	//instance fields
	String productType;
	
	//constructor method
	public Store05(String product) {
		productType = product;
		
	}
	
	//advertise method
	public void advertise() {
		System.out.println("Selling " + productType +"!");
		System.out.println("Come spend some money!");
		
	}
	//main method
	public static void main(String[] args) {
		Store05 lemonadeStand = new Store05("lemonade");
		lemonadeStand.advertise();
		lemonadeStand.advertise();
		lemonadeStand.advertise();
		
	}
}