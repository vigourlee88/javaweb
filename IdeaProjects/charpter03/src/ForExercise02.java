public class ForExercise02 {
    public static void main(String[] args) {
        //完成下面表达式输出
        //0+5=5 1+4=5 2+3=5 3+2=5 4+1=5 5+0=5
        //化繁为简
        //(1)先输出0-5
        //(2)后面的+是5-i

        //先死后活
        //(1)5 替换成变量 n

        int n = 5;
        for(int i = 0;i <= n; i++){
            System.out.println(i + "+" + (n-i) + "=" + n);
        }
    }
}
