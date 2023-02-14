public class DoWhileExercise01 {
    public static void main(String[] args) {

        //统计1-200之间能被5整除但不能被3整除的个数
        //化繁为简
        //使用do while 输出1-200
        //过滤  i % 5 == 0 && i %3 !=0
        //统计满足条件的个数 int count = 0;
        //先死后活
        //范围的值
        //能被5整除但不能被3整除，5和3可以改成变量

        int i = 1;
        int count = 0;
        do{
            if(i % 5 == 0 && i %3 !=0){
                System.out.println("i=" + i);
               count++;
            }
            i++;
        }while(i <= 200);
        System.out.println("count" + count);
    }
}
