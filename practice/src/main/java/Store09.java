//method中使用关键字returns返回一个值
public class Store09 {
	//instance fields 实例字段 
	String productType;
	double price;
	
	//constructor 构造器
	public Store09(String product,double initialPrice) {
		productType = product;
		price = initialPrice;
	}
	
	//increase price method
	public void increasePrice(double priceToAdd) {
		double newPrice = price + priceToAdd;
		price = newPrice;
	}
	
	//get price with tax method
	public double getPriceWithTax() {
		double tax = 0.08;
		double totalPrice = price + price*tax;
		return totalPrice;
		
	}
	//main method
	public static void main(String[] args) {
		
		Store09 lemonadeStand = new Store09("lemonade",3.75);
		//调用变量lemonadeStand的getPriceWithTax()方法，然后用一个double 变量 接收数值
		
		double lemonadePrice = lemonadeStand.getPriceWithTax();
		
		System.out.println(lemonadePrice);
	}
}