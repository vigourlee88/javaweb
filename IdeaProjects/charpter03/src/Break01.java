public class Break01 {
    public static void main(String[] args) {
        //跳转控制语句-break
        for(int i = 0;i < 10; i++){
            if(i == 3){
                break;//提前结束整个for循环
            }
            System.out.println("ok" + i);//0,1,2
        }
        System.out.println("退出for循环，继续执行....");
    }
}
