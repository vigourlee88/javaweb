import java.sql.SQLOutput;

public class BitOperator02 {
    public static void main(String[] args) {
        //1=>  00000001
        //>>算术右移 低位溢出，符号位不变，并用符号位补溢出的高位
        //     00000000本质 1/2/2=0
        //<<算术左移 符号位不变，低位补0
        //     00000100本质 1*2*2=4

        int a = 1>>2;
        int c = 1<<2;
        System.out.println(a);//0
        System.out.println(c);//4
        System.out.println(4<<3);//4*2*2*2=32
        System.out.println(15>>2);//15/2/2=3

        //a%b 当a是小数时
        //公式 = a -(int)a /b *b
        //-10.5-(-10)/3 *3 = -10.5-(-3)*3=-1.5
        System.out.println(-10.5%3);//-1.5

        int i = 66;
        System.out.println(++i+i);//134

        //将String 转换成double类型语句 ,以及将char类型转换成string类型语句
        String str = "18.8";//注意 字符串类型要可以被转换成double
        double d1 = Double.parseDouble(str);
        System.out.println(d1);
        char c1 = '韩';
        String str2 = c1 + "";
        System.out.println(str2);
    }
}
