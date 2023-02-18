public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        /*
        使用二维数组输出如下图形
        0 0 0 0 0 0
        0 0 1 0 0 0
        0 2 0 3 0 0
        0 0 0 0 0 0

         */
        //什么是二维数组
        //原来的一维数组的每个元素是一维数组，就构成二维数组
        int[][] arr = {{0,0,0,0,0,0},
                       {0,0,1,0,0,0},
                       {0,2,0,3,0,0},
                       {0,0,0,0,0,0}};
        //关于二维数组的关键概念
        //(1)
        System.out.println("二维数组的元素个数=" + arr.length);
        //(2)二维数组的每个元素是一维数组，所有如果需要得到每个一维数组的值
        //还需要再次遍历
        //(3)如果我们要访问第(i+1)个一维数组的第j个值 arr[i][j];
        System.out.println("第3个一维数组的第4个值="+ arr[2][3]);

        //输出二维图形
        //遍历二维数组的每个元素
        for (int i = 0; i < arr.length; i++) {
            //遍历二维数组的每个元素(数组)
            //1.arr[i]表示 二维数组的第i+1个元素
            //2.arr[i].length得到 对应的 每个一维数组的长度
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();//换行
        }
    }
}
