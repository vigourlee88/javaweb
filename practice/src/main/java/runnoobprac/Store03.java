package runnoobprac;

public class Store03 {
	//instance fields
	String productType;
	
	//constructor method
	public Store03(String product) {
		productType = product;
	}
	
	//main method Assigning Values to Instance Fields
	public static void main(String[] args) {
		Store03 lemonadeStand = new Store03("lemonade");
		System.out.println(lemonadeStand.productType);
		
		
		
	}
}
