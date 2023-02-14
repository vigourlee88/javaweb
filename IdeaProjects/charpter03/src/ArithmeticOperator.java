public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println(10 / 4);//2
        System.out.println(10.0 / 4);//2.5
        double d = 10 / 4;//10/4=2=>2.0
        System.out.println(d);//2.0

        //%取模，取余
        //% 的本质 看一个公式 a % b = a -a /b * b

        System.out.println(10 % 3);//1

        System.out.println(-10 % 3);//-1
        System.out.println(10 % -3);//1
        System.out.println(-10 % -3);//-1

        //++的使用
        int i = 10;
        //独立使用下面两个完全一样等价于i = i+1
        i++;
        ++i;
        System.out.println("i=" + i);
        /*
        作为表达式使用
        前++:++i先自增后赋值
        后++:i++先赋值后自增
         */
        int j = 8;
        //int k = ++j;//等价j=j+1;k=j;
        //System.out.println("k=" + k + "j=" + j);//9 9

        int k = j++;//等价k=j;j=j+1;
        System.out.println("k=" + k + "j=" + j);//8 9

    }
}
