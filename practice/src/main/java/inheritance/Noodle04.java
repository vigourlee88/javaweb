package inheritance;

public class Noodle04 {
	
	protected double lengthInCentimeters;
	protected double widthInCentimeters;
	protected String shape;
	protected String ingredients;
	protected String texture = "brittle";
	
	Noodle04(double lenIncent,double wthInCent,String shp,String ingr) {
		this.lengthInCentimeters = lenIncent;
		this.widthInCentimeters = wthInCent;
		this.shape = shp;
		this.ingredients = ingr;
		
	}
	
	public void cook() {
		
		System.out.println("Boiling.");
		
		this.texture = "cooked";
		
	}
	
	public static void main(String[] args) {
		
		Spaetzle kaesespaetzle = new Spaetzle();
		kaesespaetzle.cook();
	}

}
