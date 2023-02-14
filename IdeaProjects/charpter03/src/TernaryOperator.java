public class TernaryOperator {
    public static void main(String[] args) {
        //三元运算符   条件表达式？表达式1:表达式2
        int a = 10;
        int b = 99;
//        //解读
//        //1.a>b为false
//        //2.返回b--,先返回b的值，然后再b-1
//        //3.返回的结果是99
//        int result = a>b ? a++ : b--;
//        System.out.println("result="+result);//99


        //解读
        //1.a>b为false
        //2.返回--b,先b-1,后返回b的值
        //3.返回的结果是98
//        int result = a>b ? a++ : --b;
//        System.out.println("result="+result);//98
//

        int result = a < b ? a++:b--;
        //先返回a的值，再执行a+1
        System.out.println("result=" + result);//10
        System.out.println("a=" + a);//11
        System.out.println("b=" + b);//99
    }
}
