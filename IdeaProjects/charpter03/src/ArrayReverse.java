public class ArrayReverse {
    public static void main(String[] args) {
        /*
        把数组的元素内容反转
        arr {11,22,33,44,55,66}
        1.通过找规律反转
        2.使用逆序赋值方式
        思路分析
        1.把arr[0] 和 arr[5] 进行交换{66,22,33,44,55,11}
        2.把arr[1] 和 arr[4] 进行交换{66,55,33,44,22,11}
        3.把arr[2] 和 arr[3] 进行交换{66,55,44,33,22,11}
        4.一共要交换3次= arr.length/2
        5.每次交换时，对应的下标是arr[i] 和 arr.length-1-i
        代码优化

         */
        int[] arr = {11,22,33,44,55,66};
        int temp = 0;
        int len = arr.length;//计算数组的长度

        for(int i = 0;i < len/2;i++){//进行交换3次
            temp = arr[len - 1 -i];//定义一个临时变量保存
            arr[arr.length - 1 -i] = arr[i];
            arr[i] = temp;
        }
        System.out.println("====翻转后的数组====");
        for(int i = 0;i <arr.length;i++){
            System.out.print(arr[i]+ "\t");//不换行
        }
    }
}
