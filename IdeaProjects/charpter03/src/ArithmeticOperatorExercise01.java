public class ArithmeticOperatorExercise01 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        //规则使用临时变量(1) temp=i;(2)i=i+1;(3)i=temp;
        System.out.println(i);//1

        int j = 1;
        j = ++j;
        //规则使用临时变量(1) j=j+1;(2)temp=j;(3)j=temp;
        System.out.println(j);//2

        int i1 = 10;
        int i2 = 20;
        int i3 = i1++;

        System.out.print("i3=" + i3);//10
        System.out.println("i2=" + i2);//20
        j=--i2;
        System.out.print("j=" + j);//19
        System.out.println("i2=" + i2);//19
    }
}
