public class VarParameterExercise {
    public static void main(String[] args) {
        HspMethod01 hm = new HspMethod01();
        //方法的调用，要返回到调用的地方
        System.out.println(hm.showScore("milan",90.1,80.0));
        System.out.println(hm.showScore("terry",90.1,80.0,10,30.5,70));
    }
}
class HspMethod01{
    /*
    有三个方法，分别实现返回姓名和两门课成绩(总分)
    返回姓名和三门课成绩(总分)，
    返回姓名和五门课成绩(总分)
    封装成一个可变参数的方法
    分析
    1.方法名showScore,
    2.形参 (String name,double... )
     */

    public String showScore(String name,double...scores){
        double totalScore = 0;
        for (int i = 0; i < scores.length; i++) {
            totalScore += scores[i];
        }
        //拼接字符串
         return name +" 有" + scores.length +
                 "门课的成绩总分为=" + totalScore;
    }
}