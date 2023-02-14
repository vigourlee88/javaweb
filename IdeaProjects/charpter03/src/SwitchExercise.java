import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        //使用 switch 把小写类型的
        //char 型转换成大写(键盘输入)。只转换abcde,其他的输出other

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入a-e");
        char c1 = myScanner.next().charAt(0);
        switch(c1) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("你的输入有误");
        }

        //对学生成绩大于60分的，输出合格。低于60分的，输出不合格
        //输出成绩不能大于100
        //思路分析
        //1.这里我们需要进行一个转换
        //2.如果成绩在(60-100),(int)(成绩/60)=1

        double score =88.5;
        //使用if-else 保证输入的成绩有效的0-100
        if(score >= 0 && score <=100){
            switch((int)(score/60)) {
                case 0 :
                    System.out.println("不及格");
                    break;
                case 1 :
                    System.out.println("合格");
                    break;
//              default:
//                  System.out.println("你的成绩有误");
            }
        }else {
            System.out.println("输入的成绩在0-100");
        }

        //根据用于指定月份
        //打印月份所属的季节。3.4.5春季6.7.8夏季9.10.11秋季12.1.2冬季
        //思路分析
        //创建一个scanner对象 接收用户输入
        //定义int month变量 来接收
        //3.使用switch 来匹配，使用穿透来完成
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = myScanner2.nextInt();
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("这是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("这是冬季");
                break;
            default:
                System.out.println("你输入的月份不对(1-12)");
        }
    }
}
