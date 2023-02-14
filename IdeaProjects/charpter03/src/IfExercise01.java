public class IfExercise01 {
    public static void main(String[] args) {
        //单分支和多分支的练习
        //编写程序，声明2个double型变量并赋值
        //判断第一个数大于10.0且第2个数小于20.8  打印两数之和

        //思路分析

        double d1 = 34.5;
        double d2 = 2.6;
        if(d1 > 10.0 && d2 < 20.8) {
            System.out.println("两个数之和" + (d1 + d2));
        }

        //定义两个变量int 判断二者的和
        //是否能被3又能被5整除，打印提示信息
        //思路分析
        //1.定义两个变量int num1 num2
        //2.定义一个变量int sum = num1+num2
        //3.sum%3=0
        int num1 =  7;
        int num2 =  8;
        int sum = num1 + num2;
        if((sum % 3 == 0 )&& (sum%5 == 0)) {
            System.out.println("可以被3又能被5整除");
        }else {
            System.out.println("不可以被3和5整除");
        }

        //判断一个年份是否是闰年，闰年的条件是符合下面的条件之一
        //(1)年份能被4整除，但不能被100整除
        //(2)能被400整除
        //思路分析
        //1.定义 int year保存年
        //2.年份能被4整除，但不能被100整除
        //year%4 == 0 && year%100 != 0
        //3.能被400整除  year %400 ==0
        //2和3是或的关系
        int year = 2003;
        if(year % 4 == 0 && year % 100 !=0 ||year % 400==0){
            System.out.println(year + "是闰年");
        }else{
            System.out.println("不是闰年");
        }
    }
}
