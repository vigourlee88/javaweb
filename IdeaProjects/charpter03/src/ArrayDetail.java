public class ArrayDetail {
    public static void main(String[] args) {
        //1.数组是多个相同类型数据的组合，实现对这些数据的统一管理
        //int arr1 = {1,2,3,60,"hello"}; //错误String=>int
        double[] arr2 = {1.1,2.2,3.3,60.6,100};//100 int=>double ok

        //2.数组中的元素可以是任何数据类型的，包括基本数据类型和引用数据类型，但不能是
        String[] arr3 = {"北京","jack","milan"};

        //3.数组创建后，如果没有赋值，有默认值
        short[] arr4 = new short[5];
        System.out.println("====数组arr4====");
        for(int i = 0;i <arr4.length;i++){
            System.out.println(arr4[i]);
        }
        //5.数组的下标是从0开始的
        //6.数组的下标必须在指定范围内使用，否则报下标越界异常
        int [] arr = new int[5];//有效下标为0-4
    }
}
