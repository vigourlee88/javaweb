public class OverLoadExercise {
    public static void main(String[] args) {
        Methods method = new Methods();
        method.m(10);
        method.m(10,10);
        method.m("hspedu~~");

        //测试
        System.out.println(method.max(10,24));
        System.out.println(method.max(10.0,21.4));//21.4
        System.out.println(method.max(10.0,1.4,30));//30.0
    }
}
class Methods{
    //分析
    //1.方法名m
    //2.形参int
    //3.没有返回值void

    public void m(int n){
        System.out.println("平方=" + (n * n));
    }
    public void m(int n1,int n2){
        System.out.println("相乘=" + (n1 * n2));
    }
    public void m(String str){
        System.out.println("传入的str=" + str);
    }
    public int max(int n1,int n2){
        //使用三元运算符
       return n1 > n2 ? n1 : n2;
    }
    public double max(double n1,double n2){
        //使用三元运算符
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1,double n2,double n3){

        //求出 n1 和 n2 的最大值
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }
    public double max(double n1,double n2,int n3){
        System.out.println("max(double n1,double n2,int n3)被调用...");
        //求出 n1 和 n2 的最大值
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }
}
