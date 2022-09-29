package languagefamilies;

public class SinoTibetan extends Language {
	

	 SinoTibetan(String languageName,int speakers) {
		 super(languageName,speakers,"Asia","subject-object-verb");
		 if(languageName.contains("Chainese")) {
			 this.wordOrder = "subject-verb-object";
		 }
	}
	 

}
