public class VarParameterDetail {
    public static void main(String[] args) {
        //细节 可变参数的实参可以为数组
        int[] arr = {1,2,3};
        T1 t1 = new T1();
        //方法调用时传入的参数是实参，方法定义时的参数是形参
        t1.f1(arr);
    }
}
class T1{
    public void f1(int...nums){
        System.out.println("长度=" + nums.length);
    }
    //可变参数可以和普通类型的参数一起放在形参列表
    //但必须保证   可变参数 => 在最后
    //一个形参列表中只能出现一个可变参数
    public void f2(String str,double...nums){
    }
}
