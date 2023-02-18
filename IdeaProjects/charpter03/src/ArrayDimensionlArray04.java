public class ArrayDimensionlArray04 {
    public static void main(String[] args) {
      //  int[][] arr = {{1,1,1},{8,8,9},{100}};
        /*
        int arr[][] = {{4,6},{1,4,5,7},{-2}};
        遍历二维数组，并得到和
         */
        int arr[][] = {{4,6},{1,4,5,7},{-2}};
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            //遍历每个一维数组
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum=" + sum);
    }
}
