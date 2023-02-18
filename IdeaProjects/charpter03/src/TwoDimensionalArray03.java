public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        /*
        动态创建下面二维数组，并输出
        i = 0: 1
        i = 1: 2 2
        i = 2: 3 3 3

        一个有3个一维数组，每个一维数组的元素是不一样的
         */
        int[][] arr = new int[3][];//创建二维数组，一个有3个一维数组，但是每个一维数组还没有开空间
        for (int i = 0; i < arr.length; i++) {
            //给每个一维数组开空间 new
            //如果没有给一维数组new,那么arr[i]就是null
            arr[i] = new int[i + 1];

            //遍历一维数组，并给一维数组的每个元素赋值
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = i + 1;
            }
        }
        //遍历arr输出
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();//换行
        }
    }
}
