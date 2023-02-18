import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        //创建一个double数组，大小5
//        double [] scores = new double [5];
        //先声明数组，再new 分配空间
        double [] scores;//声明数组，这是数组 scores为null;
        scores = new double [5];//分配了内存空间，可以存放数据

        //循环输入 5个成绩，保存到double 数组并输出
        Scanner myScanner = new Scanner(System.in);
        //循环输入，scores.length表示数组的大小/长度
        for(int i = 0; i < scores.length;i++){
            System.out.println("请输入第"+ (i+1) + "的元素的值");
            scores[i] = myScanner.nextDouble();
        }
        //输出 遍历数组
        System.out.println("==数组的元素/值的情况如下:===");
        for(int i = 0;i < scores.length;i++){
            System.out.println("第"+ (i+1)+"各元素的值="+ scores[i]);
        }
    }
}
