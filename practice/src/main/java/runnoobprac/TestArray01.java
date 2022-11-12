package runnoobprac;

//处理数组
//数组的元素类型和数组的大小都是确定的，
//所有当处理数组元素的时候，
//我们通常使用基本循环或者ForEach循环
//该实例完整地展示了如何创建，初始化和操纵数组
public class TestArray01 {
	public static void main(String[] args) {
		double[] myList = {1.9,2.9,3.4,3.5};
		
        //打印所有数组元素
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
	
		}
        //计算所有元素的总和
		double total = 0;
		for (int i = 0; i < myList.length;i++) {
			total += myList[i];
		}
		System.out.println("Total is " + total);
        //查找最大元素
		double max = myList[0];
		for (int i = 1; i < myList.length;i++) {
			if (myList[i] > max) max = myList[i];
			
		}
		System.out.println("Max is " + max);
	}
}