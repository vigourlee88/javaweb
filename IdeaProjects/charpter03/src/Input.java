import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        //演示接收用户的输入
        //步骤
        //Scanner类 表示 简单的文本扫描器，在java.util包
        //1.引入导入Sscanner类所在的包
        //2.创建Scanner对象
        //myScanner 就是Scanner类的对象
        Scanner myScanner = new Scanner(System.in);
        //3.接收用户输入了，使用 相关的方法
        System.out.println("请输入名字");

        //当程序执行到 next 方法时， 会等待
        String name = myScanner.next();//接收用户输入字符串
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();//接收用户输入int
        System.out.println("请输入薪水");
        double sal = myScanner.nextDouble();//接收用户输入double
        System.out.println("人的信息如下:");
        System.out.println("名字" + name + " 年龄=" + age + " 薪水=" + sal);
    }
}
