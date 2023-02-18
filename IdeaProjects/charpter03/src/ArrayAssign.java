public class ArrayAssign {
    public static void main(String[] args) {
        //基本数据类型赋值，赋值方式为值拷贝
        //n2的变化，不会影响到n1的值
       int n1 = 10;
       int n2 = n1;//值拷贝

       n2 = 80;
       System.out.println("n1=" + n1);//10
       System.out.println("n2=" + n2);//80

        //数组的赋值机制
        //数组在默认情况下是引用传递，赋的值是地址,赋值方式为引用传递
        //是一个地址，arr2的变化会影响到arr1的值
        int [] arr1 ={1,2,3};
        int [] arr2 = arr1;//把arr1赋值给arr2
        arr2[0] = 10;

        //看看arr1的值
        System.out.println("====arr1的元素====");
        for(int i= 0; i < arr1.length;i++) {
            System.out.println(arr1[i]);//10,2,3
        }
        System.out.println("====arr2的元素====");
        for(int i= 0; i < arr2.length;i++) {
            System.out.println(arr2[i]);//10,2,3
        }
    }
}
