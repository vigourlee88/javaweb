public class ContinueDetail01 {
    public static void main(String[] args) {

        lable1:
        for(int j =0;j < 4;j++){
            lable2:
            for(int i = 0;i < 10;i++){
                if(i == 2){
                    continue lable2;
                }
                System.out.println("i=" + i);
            }
        }
    }
}
