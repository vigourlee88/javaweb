//scope范围
public class Store06 {
	//instance fields 
	String productType;
	
	//constructor method
	public Store06(String product) {
		productType = product;
		
	}
	
	//advertise method
	public void advertise() {
		String message = "Selling " + productType + "!";
		System.out.println(message);
	}
	
	//main method
	public static void main(String[] args) {
		String cookie = "Cookies";
		Store06 cookieShop = new Store06(cookie);
		
		cookieShop.advertise();
		
	}
	
	
}