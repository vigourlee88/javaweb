package runnoobprac;

//Adding parameters添加方法参数
public class Store07 {
	//instance fields
	String productType;
	
	//constructor method;
	public Store07(String product) {
		productType = product;	
	}
	public void greetCustomer(String customer) {
		System.out.println("Welcome to the store, " + customer + "!");
		
	}
	//advertise method
	public void advisetise() {
		String message = "Selling " + productType + "!";
		System.out.println(message);
	}
	
	//main method
	public static void main(String[] args) {
		Store07 lemonadeStand = new Store07("lemonadeStand");
		lemonadeStand.greetCustomer("one pice");
		
		
	}
}
