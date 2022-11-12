package runnoobprac;

/*String methods
 * 长度length()	returns the length
 * 连接concat()	concatenates two strings
 * 等于equals()	checks for equality between two strings
 * 指数indexOf() returns the index of a substring
 * 字符charAt()	 returns a character
 * 子串substring()	returns a substring
 * toUpperCase()returns the upper case version
 * toLowerCase()returns the lower case version
 */

public class DNA {
	public static void main(String[] args) {
		
		//NDA Sequencing
		String dna1 = "ATGCGATACGCTTGA";
		String dna2 = "ATGCGATACGTGA";
		String dna3 = "ATTAATATGTACTGA";
		
		String dna = dna1;
		
		//Find the length;
		int length = dna.length();
		System.out.println("Length: " + length);
		
		//Find start codon:
		int start = dna.indexOf("ATG");
		System.out.println("Start: " + start);
		//Find stop codon:
		int stop = dna.indexOf("TGA");
		System.out.println("Stop: "+ stop);
		
		if(start != -1 && stop != -1) {
			System.out.println("Condition 1 and 2 are satisfied.");
			if(start != -1 && stop != -1 && (stop - start) % 3 == 0) {
				
				System.out.println("Condition 1 and 2 and 3 are satisfied.");
				String protein = dna.substring(start,stop+3);
				System.out.println("Protein: " + protein);
				
			}else {
				System.out.println("No protein.");
				
			}
		}
	}
}