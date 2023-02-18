public class ArrayExercise02 {
    public static void main(String[] args) {
        /*
        求出一个数组int[] 的最大值{4,-1,9,10,23},并得到对应的下标
        思路分析
        1.定义一个数组int[] arrs = {4,-1,9,10,23};
        2.假定 max= arr[0]是最大值，maxIndex= 0;
        3.从下标1开始遍历数组arr,如果max < 当前元素，
        说明max不是真正的最大值，max = 当前元素，maxIndex =当前元素的下标
        4.当我们遍历这个数组arr后，max就是真正的最大值 maxIndex就是最大值对应的下标

         */
        int [] arr = {4,-1,9,10,23};
        int max = arr[0];//假定第一个元素就是最大值
        int maxIndex = 0;//记录第一个元素的下标

        for(int i = 1;i < arr.length;i++){//从下标1开始遍历数组
            if( max < arr[i]){
                max = arr[i];//max设置成 当前元素
                maxIndex = i;//把maxIndex的下标也设置为i
            }else{
                max = max;
            }
        }
        //当我们遍历这个数组arr后，max就是真正的最大值 maxIndex就是最大值对应的下标
        System.out.println("max=" + max + "maxIndex=" + maxIndex);

    }
}
