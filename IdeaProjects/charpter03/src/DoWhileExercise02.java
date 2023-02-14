import java.util.Scanner;

public class DoWhileExercise02 {
    public static void main(String[] args) {
        //如果李三不还钱，则老韩将一直输出5连鞭，直到李三说还钱为止
        //化繁为简
        //不停的问，还钱吗
        //使用char answer 接收，定义一个Scanner对象
        //在do-while的while判断如果是y就不再循坏  answer != 'y'

        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do{
            System.out.println("老韩使出五连鞭");
            System.out.println("老韩问还钱吗？y/n");
            answer = myScanner.next().charAt(0);
            System.out.println("他的回答是:" + answer);
        }while(answer != 'y');
        System.out.println("李三还钱了");
    }
}
