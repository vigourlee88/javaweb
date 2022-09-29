package inheritance;


class Ramen02 extends Noodle07 {
	
	Ramen02(){
	
	super(30.0,0.3,"flat","wheat flour");

}
    @Override
    
    public String getCookPrep() {
    	
	     return"Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";
   }
}