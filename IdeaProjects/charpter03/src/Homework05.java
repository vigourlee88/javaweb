public class Homework05 {
    public static void main(String[] args) {
        /*
        某人有100000元，每经过一次路口，需要交费
        1)当现金>50000时，每次交5%
        2)当现金<=50000时，每次交1000
        编程计算该人可以经过多少次路口，
        要求使用while+break

        思路分析
        1.定义变量 double money= 100000;
        2.根据提的要求，分析出3种情况
        money>50000,
        money >=1000 && money<=50000,
        money<1000
        使用多分支 if-elseif-else
        外循环while+break(money<1000);使用变量count保存个数
        代码实现
         */

        int count = 0;//累积过的路口
        double money = 100000;
        while (true){
            if(money > 50000){//过路口
               //money = money - money*0.05;
                money *= 0.95;//过了这个路口还有这些钱
                count++;
            }else if(money >= 1000 ){
                money -=1000;
                count++;
            }else {
                break;
            }
        }
        System.out.println("100000 可以过"+ count + "路口");
    }
}
