public class TernaryOperatorDetail {
    public static void main(String[] args) {
        //三元运算符细节
        //表达式1和表达式2要为 可以赋给接收变量类型(可以自动转换或者强制转换)
        int a = 3;
        int b = 8;
        int c = a > b ? a : b;
       // int c = a > b ?1.1:3.4;
       int c1 = a > b ?(int)1.1:(int)3.4;
       double c2 = a > b ? a :b + 3;//满足自动类型转换int =>double

        //三元运算符可以转换成if--else
        int res = a > b? a++:--b;
//        if(c> d)  res = a++;
//        else      res = --d;



    }
}
