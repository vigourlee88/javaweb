public class Continue01 {
    public static void main(String[] args) {
        //跳转控制语句-continue
        int i = 1;
        while(i <= 4){
            i++;
            if(i == 2){
                continue;//结束本次循环且之后的程序不执行，继续下一次外循环i<=4;
            }
            System.out.println("i=" + i);//3,4,5
        }
    }
}
