
//Nested conditional statements嵌套条件语句
//if the first condition was false,如果第一个条件是false，
//the nested condition would not be evaluated.则不会评估嵌套条件。
//当我们实现嵌套条件语句时，首先评估外部语句。
//如果外部条件是true，则评估内部嵌套语句。
public class Order03 {
	boolean isFilled;
	double billAmount;
	String shipping;
	String couponCode;
	
	public Order03(boolean filled, double cost, String shippingMethod, String coupon) {
		//一个if时，if是true才执行评估
		if (cost > 24.00) {
			System.out.println("High value item!");
		}
		isFilled = filled;
		billAmount = cost;
		shipping = shippingMethod;
		couponCode = coupon;
	}
	
	public void ship() {
		//当if是false时才执行else
		if(isFilled) {
			System.out.println("Shiping");
			System.out.println("Shipping cost: "+ calculateShipping());
		}else {
			System.out.println("Order not ready");
		}
	}
	
	public double calculateShipping() {
		//首先外层if先评估，假如if是true时，条件语句才会被评估
	
		if(shipping.equals("Regular")) {
			return 0;
		}else if (shipping.equals("Express")) {
			// Add your code here
		 if(couponCode.equals("ship50")) {
			 return 0.85; 
		 }else {
			 return 1.75;
		 }
		
		}else {
			return .50;
		}
	}
	
	public static void main(String[] args) {
		// do not alter the main method!
		Order03 book = new Order03(true, 9.99, "Express", "ship50");
		Order03 chemistrySet = new Order03(false, 72.50, "Regular", "freeShipping");
		
		book.ship();
		chemistrySet.ship();
		
	}
}