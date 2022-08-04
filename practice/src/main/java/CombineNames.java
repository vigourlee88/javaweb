//The concat() method concatenates one string to the end of another string. 
//该concat()方法将一个字符串连接到另一个字符串的末尾
//concat() doesn’t actually change the value of the original string.concat()实际上并没有改变原始字符串的值
//So make sure to reassign the value of the string if you do want to change it.如果您确实想更改它，请确保重新分配字符串的值
public class CombineNames {
	
	public static void main(String[] args) {
		
		//Add your first names:
		String firstName = "Ziggy";
		String lastName = "Stardust";
		System.out.println(firstName.concat(" " + lastName));
		
	}
}