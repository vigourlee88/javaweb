package runnoobprac;

// the index of the first occurence of a character in a string, we can use the indexOf() method on a string.
//一个字符在字符串中第一次出现的索引，我们可以indexOf()对字符串使用该方法。
public class MorseCode {
	
	public static void main(String[] args) {
		
		String code = ".... .. / .. .----. -- / ... --- -. -. -.-- / .- -. -.. / .. / .-.. .. -.- . / - --- / . .- - / .-. .- -- . -.";
		
		//write the code:
		System.out.println(code.indexOf(". .- -"));
		
	}
}