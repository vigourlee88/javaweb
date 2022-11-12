package runnoobprac;

/* substring()方法从字符串中提取子字符串,
 * 想要一个来自字符串中间的子字符串。我们可以在此方法中包含两个参数。
 * 我们可以使用此方法返回特定索引处的单元素子字符串。
 * 我们通过substring()将所需的索引值作为第一个参数调用，
 * 然后将索引值加一个作为第二个参数调用来做到这一点。 
 */

public class Poetry {
	
	public static void main(String[] args) {
		
		String line = "The Heav'ns and the Constellations rung";
		//Change the arguments:
		System.out.println(line.substring(12)) ;// index12 and extends to the end of the string.
	    System.out.println(line.substring(13,14));// return a single-element substring at a specific index. 
		System.out.println(line.substring(4,11));//a substring from the middle of the string. 
		
	}
}