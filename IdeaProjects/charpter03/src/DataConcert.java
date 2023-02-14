public class DataConcert {
    public static void main(String[] args) {
        short s = 12;//ok
       // s = s - 9;// 错误 int => short
        byte b = 10;//ok
       // b = b +11;//错误 int => byte
        b = (byte)(b +11);
        char c = 'a';//ok
        int i = 16;//ok
        float d = .3014F;//ok
        double result = c + i + d;//ok float => double自动转换
        byte b1 = 16;//ok
        short s1 = 14;//ok
       // short t = s1 + b1;//错误 int => short

    }
}
