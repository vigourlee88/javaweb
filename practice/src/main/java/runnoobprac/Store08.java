package runnoobprac;

    //Reassigning Instance fields重新分配实例字段
public class Store08 {
    //instance fields
	String productType;
	double price;

    //constructor method构造函数方法
	public Store08(String product,double initialPrice) {
		productType = product;
		price = initialPrice;
	}
	
    //increase price method增加价格方法
	public void increasePrice(double priceToAdd) {
		double newPrice = price + priceToAdd;
		price = newPrice;
	}
    //main method
	public static void main(String[] args) {
		Store08 lemonadeStand = new Store08("Lemonade" , 3.75);
		lemonadeStand.increasePrice(1.5);
		System.out.println(lemonadeStand.price);
	}
}