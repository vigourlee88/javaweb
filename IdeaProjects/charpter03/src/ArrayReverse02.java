public class ArrayReverse02 {
    public static void main(String[] args) {
        /*
        把数组的元素内容反转
        arr {11,22,33,44,55,66}
        2.使用逆序赋值方式
        思路分析
        1.先创建一个新的数组，arr2 大小等于arr.length
        2.逆序遍历arr,将每个元素拷贝到arr2的元素中
        arr是从后往前<=遍历， arr2是从前往后=>遍历
        3.建议增加一个循环变量j=>0=>5
         */
        int[] arr = {11,22,33,44,55,66};
        int[] arr2 = new int[arr.length];
        //int i = arr.length - 1;开始
        for(int i = arr.length-1,j = 0;i >= 0;i--,j++){//逆序遍历
            arr2[j] = arr[i];
        }
        //4.当for循环结束后，arr2就是一个逆序的数组{66,55,44,33,22,11}
        //5.让arr指向arr2数据空间
        //数组的赋值，就是数据空间地址的赋值
        //此时arr原来的数据空间就没有变量引用，会被当做垃圾，销毁
        arr = arr2;

        System.out.println("====arr的元素情况====");
        //6.输出arr 看看
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
