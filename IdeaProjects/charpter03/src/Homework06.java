import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        //实现判断一个整数，属于哪个范围:大于0，小于0，等于0
        //思路分析
        //定义一个变量int numeber=22;
        //使用循环if else if else 输出 大于0，小于0，等于0
       int number =22;
        if(number > 0){
            System.out.println("大于0");
        }else if(number <0){
            System.out.println("小于0");
        }else{
            System.out.println("等于0");
        }
    }
}
