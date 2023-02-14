public class ContinueDetail {
    public static void main(String[] args) {

        lable1:
        for(int j =0;j < 4;j++){
            lable2:
            for(int i = 0;i < 10;i++){
                if(i == 2){
                  continue;//等价于continue到最近循环lable2;

                }
                System.out.println("i=" + i);//输出4组0，1,3,4,5,6,7,8,9
            }
        }
    }
}
