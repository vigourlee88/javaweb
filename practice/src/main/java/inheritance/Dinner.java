package inheritance;

public class Dinner {
	private void makeNoodle(Noodle05 noodle, String sauce) {
		noodle.cook();
		
		System.out.println("Mixing " + noodle.texture + "noodles made form " + noodle.ingredients + "with" + sauce + ".");
		System.out.println("Dinner is served!");
	}
	
	public static void main(String[] args) {
		
		Dinner noodlesDinner = new Dinner();
		
		Noodle05 biangBiang = new BiangBiang();
		
		noodlesDinner.makeNoodle(biangBiang,"soy sauce and chili oil");
	}

}
