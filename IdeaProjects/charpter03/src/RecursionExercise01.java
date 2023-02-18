public class RecursionExercise01 {
    public static void main(String[] args) {

        S s1 = new S();
//        int n = 1;
//        int res = s1.fibonaci(n);
//        if(res != -1) {
//            System.out.println("当n=" + n + "对应的斐波那契数=" + res);
//        }
        //桃子问题
        int day = 11;
        int peachNum = s1.peach(day);
        if(peachNum != -1){
            System.out.println("第" + day + "天有" + peachNum + "个桃子");
        }
    }
}
class S{
    /*
    请使用递归的方式求出斐波那契数1,1,2,3,5,8,13...
    给你一个整数n,求出它的值是多少？
    思路分析
    1.当n=1 斐波那契数 是1
    2.当n=2 斐波那契数 是1
    3.当n>=3 斐波那契数 是前两个数的和
    4.这里就是一个递归的思路
     */
    public int fibonaci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonaci(n - 1) + fibonaci(n - 2);
            }
        } else {
            System.out.println("要求输入的n>=1的整数");
            return -1;
        }
    }
      /*
        猴子吃桃子问题
        有一堆桃子
        猴子第一天吃了其中的一半，并再多吃了一个。
        以后每天猴子都吃其中的一半，然后再多吃一个，当到第10天时，
        想再吃时(还没吃完)，发现只有1个桃子了。问题 最初共多少个桃子
        思路分析  逆推
        1.day = 10时 有 1个桃子
        2.day = 9时 有 (day10 + 1)* 2个桃子 = 4 吃掉1/2，再吃一个1，还剩1个
        3.day = 8时 有 (day9 + 1)* 2个桃子 = 10 吃掉1/2，再吃一个1，还剩4个
        4.规律就是 前一天的桃子= (后一天的桃子 + 1)*2
        5.递归
         */
    public int peach(int day){
        if(day == 10){//第10天，只有1个桃
            return 1;
        }else if(day >=1 && day <= 9){
            return (peach(day + 1) + 1) * 2;
        }else{
            System.out.println("day在1-10");
            return -1;
        }
    }
}