package runnoobprac;

/*数组元素的默认初始化值
 * 数组元素是整型:0
 * 数组元素是浮点型:0.0
 * 数组元素是char型:0 零 或'\u0000' 而非'0'
 * 数组元素是布尔型:false
 * 
 * 数组元素是引用型:null 空值  而非"null"
 */
public class ArrayTest01 {
	public static void main(String[] args) {
//数组元素的默认初始化值
		int[] arr = new int [4];
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);//0,0,0,0	
		}
		System.out.println("********");
		float[] arr1= new float [5];
		for(int i = 0;i < arr1.length;i++) {
			System.out.println(arr1[i]);	
		}
		System.out.println("********");
		char[] arr2 = new char [4];
		for(int i = 0;i < arr2.length;i++) {
			System.out.println("------" + arr2[i] + "******");	
		}
		if(arr2[0] == 0) {
			System.out.println("你好！");	
		}
		
		System.out.println("********");
		boolean[] arr3 = new boolean[5];
		System.out.println( arr3[0]);
		
		System.out.println("********");
		String[] arr4 = new String[5];
		System.out.println( arr4[0]);
		if(arr4[0] == null) {
		System.out.println("北京天气不错！");
		}
	}
}