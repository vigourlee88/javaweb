public class Homework11 {
    public static void main(String[] args) {
        /*
        求出1-1/2+1/3-1/4....+1/100的和
        思路分析
        1. =(1/1)-(1/2)+(1/3)-(1/4)+(1/5)+....+(1/100)
        2.从上面的分析我们可以看到
        (1)一共100个数，分子为1，分母从1-100
        (2)当分母为奇数时，前面是+，当分母为偶数时，前面是-
        3.我们使用for+判断即可完成
        4.把结果存放到double sum
        5.这里有一个隐藏的陷阱，要把公式分子1写成1.0才能得到精确到小数
         */
        double sum = 0;
        for(int n = 1;n <= 100;n++){
            //判断是奇数还是偶数，然后做不同的处理
            if(n % 2 != 0){//分母为奇数
               // sum = sum + (1/n);
                sum += 1.0/n;
            }else {//分母为偶数
               // sum = sum-(1/n);
               sum -= 1.0/n;
            }
        }
        System.out.println("sum="+sum);
    }
}
