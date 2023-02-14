public class MulForExercise02 {
    public static void main(String[] args) {
        //打印出99乘法表
        //化繁为简
        //先打印出1*1=11*2=2

        for (int i = 1; i <= 9;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(i + "*"+ j+ "="+ j * i +"\t");
            }
            System.out.print("\n");
        }
    }
}
