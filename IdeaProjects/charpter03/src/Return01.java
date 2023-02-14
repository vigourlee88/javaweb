public class Return01 {
    public static void main(String[] args) {
        //跳转控制语句-return
        for(int i = 1;i <= 5;i++){
            if(i == 3){
                System.out.println("hsp教育"+ i);
                //break;//跳出当前最近的循环
                //continue;//终止本次循环，continue后面的代码都不执行，进入下次循环
                return;//作用在方法，表示跳出所在的方法，如果在main方法中，退出程序

            }
            System.out.println("Hello,World!");
        }
        System.out.println("go on..");
    }
}
