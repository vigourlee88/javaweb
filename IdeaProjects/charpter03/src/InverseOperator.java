public class InverseOperator {
    public static void main(String[] args) {
       //!操作是取反

        System.out.println(60 > 20);
        System.out.println(!(60 > 20));

        //a^b 叫逻辑异或， 当a和b不同时，结果为true,否则为false
        boolean b = (10 > 1) ^ (3 > 5);
        System.out.println("b=" + b);//F
    }
}
