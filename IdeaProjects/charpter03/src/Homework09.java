public class Homework09 {
    public static void main(String[] args) {
        int m = 0,n = 3;
        if(m > 0){
            if(n > 2)
                System.out.println("ok1");
            else
                System.out.println("ok2");
        }

        /*
        输出1-100之间的不能被5整除的数，每5个一行
        思路分析
        1.先输出1-100的所有数
        2.然后过滤输出 不能被5整除的数
        3.每5个一行，使用int count 统计输出的个数count%5==0
        就说明输出5个，这时，我们就输出一个换行即可

        代码实现
         */
        int count = 0;//统计输出的个数
        for(int i = 1; i <= 100;i++){
            if(i % 5 != 0){
                count++;
                System.out.print(i+"\t");
                //判断 每满5个，就输出一个换行
                if(count %5 == 0){
                    System.out.println();
                }
            }
        }
    }
}
