public class Homework08 {
    public static void main(String[] args) {
        /*判断一个整数是否是水仙花数，
         水仙花数是指一个3位数，其各个位上数字立方和等于其本身
         153=1*1*1+3*3*3+5*5*5
         思路分析
         1.比如int n = 153;
         2.先得到n的百位，n/100
         3.十位，n%100/10
         4.个位的数字，n%10
         5.使用if判断他们的立方和是否相等即可
        */
        int n =153;
        int n1 = n / 100;
        int n2 = n % 100 /10;
        int n3 = n % 10;
        if(n1*n1*n1+n2*n2*n2+n3*n3*n3 == n){
            System.out.println(n+"是水仙花数");
        }else{
            System.out.println(n+"不是水仙花数");
        }
    }
}
