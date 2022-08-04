//Conditional-OR:||
//short-circuited evaluation短路评估仅适合&&, ||
//两边的一个或两个布尔值是否为true
public class Reservation02 {
	int guestCount;
	int restaurantCapacity;
	boolean isRestaurantOpen;
	boolean isConfirmed;
	
	public Reservation02(int count,int capacity,boolean open) {
		//write conditional statement below
		if(count>=1||count<=8) {
			System.out.println("Invalid reservation!");
		}
		
		guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
	}
	
	public void confirmReservation() {
		if(restaurantCapacity >= guestCount && isRestaurantOpen) {
		System.out.println("Reservation confirmed");
		isConfirmed = true;
		}else {
			System.out.println("Reservation denied");
			isConfirmed = false;
		}
	}
	
	public void informUser() {
		System.out.println("Please enjoy your meal!");
	}
	
	public static void main(String[] args) {
		Reservation02 partyOfThree = new Reservation02(3, 12, true);
	    Reservation02 partyOfFour = new Reservation02(4, 3, true);
	    partyOfThree.confirmReservation();
	    partyOfThree.informUser();
	    partyOfFour.confirmReservation();
	    partyOfFour.informUser();
	}
}