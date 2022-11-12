package runnoobprac;

//Conditional-AND:&&
//true && true   true
//false && true  false
//true && false  false
//false && false false

public class Reservation01 {
	int guestCount;
	int restaurantCapacity;
	boolean isRestaurantOpen;
	boolean isConfirmed;
	
	
	public Reservation01(int count,int capacity,boolean open) {
		guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
	}
	
	public void confirmReservation() {
		
		if(restaurantCapacity>=guestCount&&isRestaurantOpen) {
			System.out.println("Reservaion confirmed");
			isConfirmed = true;
		}else {
			System.out.println("Reservation denide");
			isConfirmed = false;
		}
	}
	
	public void informUser() {
		System.out.println("Please enjoy your meal!");
	}
	
	public static void main(String[] args) {
		Reservation01 partyOfThree = new Reservation01(3,12,true);
		Reservation01 partyOfFour = new Reservation01(4,3,true);
		partyOfThree.confirmReservation();
		partyOfThree.informUser();
		partyOfFour.confirmReservation();		
		partyOfFour.informUser();		
					
	}
}