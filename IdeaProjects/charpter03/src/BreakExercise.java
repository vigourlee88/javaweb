public class BreakExercise {
    public static void main(String[] args) {

        //1-100以内的数求和，求出 当和 第一次大于20的当前数 (for+break)
        //思路分析
        //1.循环1-100，求和sum
        //2.当sum>20,记录下当前数，然后break
        //3.在for循环外部，定义变量 n,把 i 赋值给 n
        int sum = 0;
        //注意i 的作用范围在for{}
        int n = 0;
        for(int i = 1;i <= 100;i++){
            sum += i;
            if(sum > 20){
                System.out.println("和>20时候 当前i=" + i);
                n = i;
                break;
            }
        }
        System.out.println("当前数=" + n);

    }
}
