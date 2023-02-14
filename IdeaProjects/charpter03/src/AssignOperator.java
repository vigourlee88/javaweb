public class AssignOperator {
    //赋值运算符的使用
    public static void main(String[] args) {
        int n1 = 10;
        n1 += 4;
        System.out.println(n1);//14
        n1 /= 3;
        System.out.println(n1);//4

        //复合赋值运算会进行类型转换(底层有强制类型转换)
        byte b = 3;

        b += 2;//等价b = (byte)(b + 2);

        b++;//b = (byte)(b + 1);

    }
}
