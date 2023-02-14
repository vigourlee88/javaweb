import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {

        //思路分析
        //1.接收输入人的年龄，应该定义一个scanner对象
        //2.把年龄保存到一个变量int age
        //3.使用if 判断，输出对应信息
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = myScanner.nextInt();
        if (age > 18) {
            System.out.println("你的年龄大于18，要对自己的行为负责");
        }else {
            System.out.println("你的年龄不大，这次就放过你吧");
        }
        System.out.println("程序继续....");
   }
}
