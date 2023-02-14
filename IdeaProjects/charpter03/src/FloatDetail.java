public class FloatDetail {
    public static void main(String[] args) {
        //Java的浮点常量默认为 double 型
        //float num1 = 1.1;//1.1为double型
        //float num2 = 1.1F;//声明float 型常量须后加 f或F
        double num3 = 1.1;
        double num4 = 1.1f;//4个字节小的 可以转变成8个字节

        //十进制数的形式
        double num5 = .123;
        //科学计数法形式
        System.out.println(5.12e2);//512.0
        System.out.println(5.12E-2);//0.0512

        //通常情况下，应该使用double类型，因为它比float更精确
        double num9 = 2.134567851;
        double num10 = 2.134567851F;//2.134567

        //浮点数的使用陷阱
        double num11 = 2.7;
        double num12 = 8.1 / 3;//接近2.7小数
        //得到一个重要的使用点 当我们对运算结果是小数的进行相等判断时
        //应该是以两个数的差值的绝对值，在某个精度范围内判断
        System.out.println(num11);
        System.out.println(num12);
        if(num11 == num12) {
            System.out.println("相等");
        }
        System.out.println(Math.abs(num11 - num12));
        //细节 如果是直接查询得的小数或者直接赋值，是可以判断相等
    }
}
