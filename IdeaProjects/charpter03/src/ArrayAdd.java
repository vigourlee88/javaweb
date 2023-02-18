public class ArrayAdd {
    public static void main(String[] args) {
        /*
        实现动态地给数组添加元素效果，实现对数组扩容
        1.增加的元素4，直接放在数组的最后arr {1,2,3，4}
        思路分析
        1.定义初始数组int[] arr {1,2,3}下标0-2
        2.arr[3] = 4;//不行
        3.定义一个新的数组int[] arrNew = new int[arr.length+1]
        4.遍历数组 依次将arr的元素拷贝到arrNew数组
        5.将4赋给arrNew[arrNew.length-1] = 4;把4赋给arrNew最后一个元素
        6.让arr指向arrNew,arr = arrNew;原来arr数组就被销毁

          */
        int[] arr = {1,2,3};
        int[] arrNew =new int[arr.length+1];
        //遍历数组 依次将arr的元素拷贝到arrNew数组
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        //将4赋给arrNew[arrNew.length-1] = 4;
        arrNew[arrNew.length-1] = 4;
        //让arr指向arrNew,
        arr = arrNew;
        //输出arr,看看效果
        System.out.println("====arr扩容后元素情况====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
