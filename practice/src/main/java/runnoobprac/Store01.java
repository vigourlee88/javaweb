package runnoobprac;

public class Store01 {
	
	// new method: constructor!
    public Store01() {
    	System.out.println("I am inside the constructor method.");
    }
	
	// main method is where we create instance!
    public static void main(String[] args) {
    	System.out.println("Start of the main method.");
    	Store01 lemonadeStand = new Store01();
        // create the instance below
        System.out.println(lemonadeStand);
        // print the instance below
    
    }
}