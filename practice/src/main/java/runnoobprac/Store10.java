package runnoobprac;

//The toString() Method

public class Store10 {
	//instance fields
	String productType;
	double price;
	
	//constructor method
	public Store10(String product,double initialPrice) {
		productType = product;
		price = initialPrice;
	}
	
	//increase price method
	public void incraesePrice (double priceToAdd) {
		double newPrice = price + priceToAdd;
		price = newPrice;
	}
	
	//get price with tax method
	public double getPriceWithTax() {
		double tax = 0.08;
		double totalPrice = price + price *tax;
		return totalPrice;
	}
	
	public String toString() {
		return "This store sells " + productType +" at a price of " + price + " . ";
		
	}
	
	//main method
	public static void main(String[] args) {
		Store10 lemonadeStand = new Store10("Lemonade",3.75);
		Store10 cookieShop = new Store10("Cookies",5);
		
		System.out.println(lemonadeStand);
		System.out.println(cookieShop);
	}
}