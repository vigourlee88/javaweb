import java.util.Scanner;

public class MulForExercise01 {
    public static void main(String[] args) {
        //1.统计3个班成绩情况，每个班有5名同学，求出每个班的平均分和所有班的
        //的平均分(学生成绩从键盘输入)
        //2.统计3个班及格人数，每个班有5名同学
        //思路分析
        //化繁为简
        //1.先计算出一个班，5个学生的成绩，使用for
        //1.1创建Scanner对象，接收用户输入
        //1.2得到该班级的平均分，定义一个double sum 把该班5个学生的成绩累积

        //2.总计3个班(每个班5个学生)平均分
        //3.所有班级的平均分
        //3.1定义一个变量double totalScore 累积所有学生的成绩
        //3.2当多重循环结束后 totalScore / (3 * 5)
        //4.统计3个班级及格人数
        //4.1定义变量int passNum = 0;当有一个学生成绩>=60,passNum++;

        //创建Scanner对象,需要反复使用，放在for外面
        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;//累积所有学生成绩
        int passNum = 0;//累积 及格人数
        int classNum = 3;//班级的个数
        int stuNum = 5;//学生的个数

        for(int i = 1;i <= classNum;i++) {//i 表示班级

            double sum = 0;//一个班级的总分
            for (int j = 1; j <= stuNum; j++) {//j 表示学生
                System.out.println("请输入第"+ i +"个班的第" + j + "个学生的成绩");
                double score = myScanner.nextDouble();
                //当有一个学生成绩>=60,passNum++;
                if(score >= 60){
                    passNum++;
                }
                sum += score;//累积
                System.out.println("成绩为" + score);

            }
            //sum是5个学生的总成绩
            System.out.println("sum=" + sum + "平均分=" + sum / stuNum);
            //把sum 累积到 totalScore
            totalScore += sum;
        }
        System.out.println("三个班总分=" + totalScore + "平均分"+ totalScore / (classNum * stuNum));
        System.out.println("及格人数="+ passNum);
    }
}
