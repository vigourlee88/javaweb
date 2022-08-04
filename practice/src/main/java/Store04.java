public class Store04 {
	// instance fields
	String productType;
	int inventoryCount;
	double inventoryPrice;
	//constructor method使用新参数更新构造方法
	public Store04(String product,int count,double price) {
		productType = product;
		inventoryCount = count;
		inventoryPrice = price;
	
	}
	// main method
	public static void main(String[] args) {
		Store04 cookieshop = new Store04("cookies",12,3.75);
		
	}
}