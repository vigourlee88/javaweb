package inheritance;

public class NoodleRestaurant {
	
	String name;
	
	public NoodleRestaurant(String customerName) {
		name = customerName;
		
	}
	public void order(Noodle07 noodle) {
		System.out.println(noodle.getCookPrep());
		System.out.println("Order for " + name + " is ready. ");
	}
	public static void main(String[] args) {
		Noodle07 ramen02,pho02;
		ramen02 = new Ramen02();
		pho02 = new Pho02();
		
		NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
		NoodleRestaurant customer2 = new NoodleRestaurant("Maritza");
		
		customer1.order(pho02);
		customer2.order(ramen02);
	}

}
