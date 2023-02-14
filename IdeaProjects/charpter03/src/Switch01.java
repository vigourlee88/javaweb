import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //接受一个字符，比如abcd，a表示星期一，
        //根据用户的输入显示相应的信息，要求使用switch语句完成
        //思路分析
        //1.创建一个scanner 对象
        //2.使用switch来完成匹配，输出对应信息
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符(a-g)");
        char c1 = myScanner.next().charAt(0);
        //在java 只要是有值返回，就是一个表达式(例如变量有具体的值也是)
        switch(c1){
            case 'a':
                System.out.println("今天是星期一");
                //退出switch
                break;
            case 'b':
                System.out.println("今天是星期二");
                break;
            case 'c':
                System.out.println("今天是星期三");
                break;
            default:
                System.out.println("你输入的字符不正确，没有匹配的");
        }
        System.out.println("退出了switch,继续执行程序");
    }
}
