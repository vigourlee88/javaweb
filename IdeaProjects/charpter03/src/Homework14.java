public class Homework14 {
    public static void main(String[] args) {
        char[] arr1 ={'a','z','b','c'};
        char[] arr2 =arr1;
        arr1[2] ='韩';//{'a','z','韩','c'};

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i] + "," + arr2[i]);
        }
        //冒泡排序，
        // 要求从小到大
        // 要求从大到小arr[j] < arr[j+1]反之小就交换
        int temp = 0;
        int[] arr ={20,-1,89,2,890,7};

        for (int i = 0; i < arr.length-1; i++) {//外循环几轮比较
            for (int j = 0; j < arr.length-1-i; j++) {//每轮比较的次数
                if(arr[j] > arr[j+1]){//前面的数大就交换
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\n====排序后输出的结果是====");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +"\t");
        }
    }
}
