package inheritance;

public class Spaetzle extends Noodle04 {
	
	Spaetzle() {
		
		super(3.0,1.5,"irregular","eggs,flour,salt");
		this.texture = "lumpy and liquid";
		
	}
	
	// Add the new cook() method below:
	@Override
	public void cook() {
		System.out.println("Grinding or scraping dough.");
		System.out.println("Boiling.");
		
		this.texture = "cooked";
	}
	

}
