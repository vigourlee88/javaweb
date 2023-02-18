public class ArrayCopy {
    public static void main(String[] args) {
        //数组拷贝(内容复制)，引用传递，拷贝的地址
        //将int[] arr1 = {10,20,30};拷贝到arr2数组，要求数据空间是独立的
        int[] arr1 = {10,20,30};

        //创建一个新的数组arr2,开辟一个新的数据空间
        //大小 arr1.length;
        int[] arr2 = new int[arr1.length];//new 就是在堆里开辟一个新的空间

        //遍历arr1,把每个元素拷贝到arr2对应的元素位置
        for(int i = 0;i < arr1.length;i++){
            arr2[i] = arr1[i];
        }
       //修改 arr2的值  不会对arr1有影响
        arr2[0] = 100;

        //输出arr1
        System.out.println("====arr1的元素====");
        for(int i= 0; i < arr1.length;i++) {
            System.out.println(arr1[i]);//10,20,30
        }


        System.out.println("====arr2的元素====");
        for(int i= 0; i < arr2.length;i++) {
            System.out.println(arr2[i]);//100,20,30
        }



    }
}
