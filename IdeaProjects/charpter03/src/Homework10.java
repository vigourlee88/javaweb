import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        /*
        输出小写a-z以及大写Z-A
        考察我们对a-z编码和for的综合使用
        思路分析
        1.'b'='a'+1; 'c'='a'+2
        char的本质是一个整数，在输出时是unicode码对应的字符
        可以直接给char 赋一个整数 输出时 会按照unicode字符输出
        也可以进行运算的，相当于一个整数，因为都对应有unicode码
        2.使用for循环
         */
        for(char c1 = 'a';c1 <= 'z';c1++){
            System.out.print(c1+" ");
        }
        System.out.println("============");
        for(char c1 = 'Z';c1 >= 'A';c1--){
            System.out.print(c1+" ");
        }
    }
}
