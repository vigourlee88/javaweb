public class ForceConvertDetail {
    public static void main(String[] args) {
        //强制类型转换
        //强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
        //int x =(int) 10*3.5+6*1.5; //编译错误，double => int
       int y =(int) (10*3.5+6*1.5);//(int)44.0 => 44
        System.out.println(y);//44

        //char类型可以保存int的常量值，但不能保存int的变量值，需要强转
        //byte，char short 类型在进行运算时，当做int类型处理
        char c1 = 100;
        int m = 100;
        //char c2 = m;错误int=>char
        char c3 = (char)m;
        System.out.println(c3);//100对应的字符d


    }
}
