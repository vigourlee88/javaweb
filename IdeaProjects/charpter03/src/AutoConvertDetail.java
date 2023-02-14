public class AutoConvertDetail {
    public static void main(String[] args) {
        //有多种类型的数据混合运算时
        //系统首先自动将所有数据转换成容量最大的那种数据类型,再进行运算
        int n1 = 10;
        //float d1 = n1 + 1.1;n1 + 1.1是double类型
        double d1 = n1 + 1.1;
        float d2 = n1 + 1.1F;

        //当我们把精度大 的数据类型赋值给精度小的数据类型时
        //就会报错，反之就会进行自动类型转换
        //int n2 = 1.1;错误，1.1是double 大的不能转换成小的 int

        //(byte,short)和char 之间不会相互自动转换
        //当把数据赋给 byte 时，先判断该数是否在byte范围内，如果在就可以
        byte b1 = 10; //-128,127
        int n2 = 1;// n2是int
       // byte b2 = n2;//错误，如果是变量赋值，判断类型
       // char c1 = b1;//错误，byte不能自动转成char(byte,short char不能自动转换)

        //细节4: byte short char 三者可以计算，在计算时，首先转换成int类型
        byte b2 = 1;
        byte b3 = 2;
        short s1 = 1;
        //short s2 = b2 + s1;错，b2+s1=>int
        int s2 = b2 + s1;

        //byte b4 = b2 + b3;错误，b2+b3=> int

        //boolean 不参与类型的自动转换

        //自动提升原则 表达式结果的类型自动提升为 操作数中  最大的类型
        byte b4 = 1;
        short s3 = 100;
        int num200 = 1;
        double num300 = 1.1;

        double num500 = b4 + s3 + num200 + num300;
        //int  num500 = b4 + s3 + num200 + num300;//取决于操作数据的  最大数据类型


    }
}
