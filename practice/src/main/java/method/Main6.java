package method;

public class Main6 {
	public static void main(String[] args) {
		int[] intary = {1,2,3,4};
		forDisplay(intary);
		foreachDisplay(intary);
	}
	public static void forDisplay(int[] a) {
		System.out.println("使用 for 循环数组");
		for(int i = 0;i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}
	public static void foreachDisplay(int[] data) {
		System.out.println("使用 foreach 循环数组");
		for(int a : data) {
			System.out.println(a + " ");
		}
	}

}
