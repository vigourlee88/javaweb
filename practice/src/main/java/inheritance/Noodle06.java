package inheritance;

public class Noodle06 {
	
	protected double lengthInCentimeters;
	protected double widthInCentimeters;
	protected String shape;
	protected String ingredients;
	protected String texture = "brittle";
	
	Noodle06 (double lenInCent,double withInCent,String shp,String ingr) {
		this.lengthInCentimeters = lenInCent;
		this.widthInCentimeters = withInCent;
		this.shape = shp;
		this.ingredients = ingr;
	}
	
	public String getCookPrep() {
		return "Boil noodle for 7 minutes and add sauce.";
		
	}
	
	public static void main(String[] args) {
		
		Noodle06 spaghetii01,ramen01,pho01;
		
		spaghetii01 = new Spaghetii01();
		ramen01 = new Ramen01();
		pho01 = new Pho01();
		
		Noodle06 [] allTheNoodles = {spaghetii01,ramen01,pho01};
		 
		for (Noodle06 noodle : allTheNoodles) {
			System.out.println(noodle.getCookPrep());
		}
		
	}

}
