package inheritance;

class Pho01 extends Noodle06 {
	Pho01() {
		super(30.0,0.64,"flat","rice flour");
	}
	
	@Override
	public String getCookPrep() {
		return "Soak pho for 1 hour , then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";
	}

}
